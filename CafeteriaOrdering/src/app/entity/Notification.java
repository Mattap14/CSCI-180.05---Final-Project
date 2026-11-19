package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notification {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long notificationPk;
	
	@Column
	private Long studentPk;
	
	@Column
	private Long orderPk;
	
	@Column
	private String message;
	
	@Column
	private String status;
	
	public Notification() {
		
	}

	public Notification(Long studentPk, Long orderPk, String message, String status) {
		super();
		this.studentPk = studentPk;
		this.orderPk = orderPk;
		this.message = message;
		this.status = status;
	}

	public Long getNotificationPk() {
		return notificationPk;
	}

	public void setNotificationPk(Long notificationPk) {
		this.notificationPk = notificationPk;
	}

	public Long getStudentPk() {
		return studentPk;
	}

	public void setStudentPk(Long studentPk) {
		this.studentPk = studentPk;
	}

	public Long getOrderPk() {
		return orderPk;
	}

	public void setOrderPk(Long orderPk) {
		this.orderPk = orderPk;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Notification [notificationPk=" + notificationPk + ", studentPk=" + studentPk + ", orderPk=" + orderPk
				+ ", message=" + message + ", status=" + status + "]";
	}
	
	
	
	
	
	

}
