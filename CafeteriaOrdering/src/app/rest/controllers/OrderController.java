package app.rest.controllers;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import app.components.OrderManager;
import app.entity.Order;

@Component
@Path("/order")
public class OrderController {
	
	@Autowired
	private OrderManager om;
	
	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Order> getAllOrders() 
	{
		return om.getAllOrders();
	}
	
	@GET
	@Path("/getOrder")
	@Produces(MediaType.APPLICATION_JSON)
	public Order getOrder(@QueryParam("orderPk") Long orderPk) {
		return om.getOrder(orderPk);
	}
	
	@GET
	@Path("/getOrdersByStudent")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Order> getOrdersbyStudent(Long studentPk){
		return om.getOrdersbyStudent(studentPk);
	}
	
	

}
