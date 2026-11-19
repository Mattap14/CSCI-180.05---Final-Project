package app.components;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.DTO.OrderDTO;
import app.DTO.OrderItemDTO;
import app.entity.Order;
import app.entity.OrderItem;
import app.entity.Student;
import app.repository.OrderItemRepository;
import app.repository.OrderRepository;
import app.repository.StudentRepository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Component
public class OrderManager {
	
	@Autowired
	OrderRepository or;
	
	@Autowired
	OrderItemRepository oir;
	
	@Autowired
	StudentRepository sr;
	
	public List<Order> getAllOrders() {
		return or.findAll();	
	}
	
	public Order getOrder(Long orderPk) {
		return or.findByorderPk(orderPk);
	}
	
	public List<OrderItem> getAllOrderItems(Long orderPk){
		return oir.findByorderPk(orderPk);
	}
	
	public List<Order> getOrdersbyStudent(Long studentPk){
		return or.findByStudentPk(studentPk);
	}
	
	public OrderReply placeOrder(OrderDTO orderDTO) throws Exception{
		Long selectedStudentpk = orderDTO.getStudentPk();
		Student selectedStudent = sr.findBystudentPk(selectedStudentpk);
		if(selectedStudent != null) {
			Order o = new Order();
			o.setStudentPk(selectedStudentpk);
			o.setOrderDate(LocalDateTime.now());
			o.setStatus("Pending");
			o = or.save(o);
			Long orderPk = o.getOrderPk();
			
			Retrofit retrofit = new Retrofit.Builder()
					.baseUrl("http://localhost:8080/")
					.addConverterFactory(GsonConverterFactory.create())
			        .build();
			
			MenuService menuService = retrofit.create(MenuService.class);
			
			for(OrderItemDTO item : orderDTO.getItems()) {
				
				Long foodItemPk = item.getFoodItemPk();
				int quantity = item.getOrderedQuantity();
				Call<FoodItem> foodCall = menuService.getFoodItem(foodItemPk);
				Response<FoodItem> reponse = foodCall.execute();
				FoodItem foodItem = reponse.body();
				
				Call<FoodItem> quantityCall = menuService.updateQuantity(foodItemPk, quantity);
				Response<FoodItem> response = quantityCall.execute();
				
				OrderItem oi = new OrderItem();
				oi.setOrderPk(selectedStudentpk);
				oi.setFoodItemPk(foodItemPk);
				oi.setOrderedQuantity(quantity);
				oi.setItemPrice(foodItem.getPrice());
			}
				
		}
		
		
		
	}

}
