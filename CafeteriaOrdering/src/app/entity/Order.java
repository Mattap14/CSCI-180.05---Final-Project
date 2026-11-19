package app.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column
	private Long orderPk;
	
	@Column
	private Long studentPk;
	
	@Column
	private LocalDateTime orderDate;
	
	@Column
	private String status;
	
	@Column
	private double totalPrice;
	
	public Order() {
		
	}

	public Order(Long studentPk, LocalDateTime orderDate, String status, double totalPrice) {
		super();
		this.studentPk = studentPk;
		this.orderDate = orderDate;
		this.status = status;
		this.totalPrice = totalPrice;
	}

	public Long getOrderPk() {
		return orderPk;
	}

	public void setOrderPk(Long orderPk) {
		this.orderPk = orderPk;
	}

	public Long getStudentPk() {
		return studentPk;
	}

	public void setStudentPk(Long studentPk) {
		this.studentPk = studentPk;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Order [orderPk=" + orderPk + ", studentPk=" + studentPk + ", orderDate=" + orderDate + ", status="
				+ status + ", totalPrice=" + totalPrice + "]";
	}
	
	
	

}
