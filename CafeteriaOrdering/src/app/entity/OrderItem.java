package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long orderItemPk;
	
	@Column
	private Long orderPk;
	
	@Column
	private Long foodItemPk;
	
	@Column
	private int orderedQuantity;
	
	@Column
	private double itemPrice;
	
	public OrderItem() {
		
	}

	public OrderItem(Long orderPk, Long foodItemPk, int orderedQuantity, double itemPrice) {
		super();
		this.orderPk = orderPk;
		this.foodItemPk = foodItemPk;
		this.orderedQuantity = orderedQuantity;
		this.itemPrice = itemPrice;
	}

	public Long getOrderItemPk() {
		return orderItemPk;
	}

	public void setOrderItemPk(Long orderItemPk) {
		this.orderItemPk = orderItemPk;
	}

	public Long getOrderPk() {
		return orderPk;
	}

	public void setOrderPk(Long orderPk) {
		this.orderPk = orderPk;
	}

	public Long getFoodItemPk() {
		return foodItemPk;
	}

	public void setFoodItemPk(Long foodItemPk) {
		this.foodItemPk = foodItemPk;
	}

	public int getOrderedQuantity() {
		return orderedQuantity;
	}

	public void setOrderedQuantity(int orderedQuantity) {
		this.orderedQuantity = orderedQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	@Override
	public String toString() {
		return "OrderItem [orderItemPk=" + orderItemPk + ", orderPk=" + orderPk + ", foodItemPk=" + foodItemPk
				+ ", orderedQuantity=" + orderedQuantity + ", itemPrice=" + itemPrice + "]";
	}
	
	
	
	
	
	

}
