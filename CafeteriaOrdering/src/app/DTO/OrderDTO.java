package app.DTO;

import java.util.List;

public class OrderDTO {
	
	private Long studentPk;
	private List<OrderItemDTO> items;
	
	public OrderDTO() {
		
	}

	public OrderDTO(Long studentPk, List<OrderItemDTO> items) {
		super();
		this.studentPk = studentPk;
		this.items = items;
	}

	public Long getStudentPk() {
		return studentPk;
	}

	public void setStudentPk(Long studentPk) {
		this.studentPk = studentPk;
	}

	public List<OrderItemDTO> getItems() {
		return items;
	}

	public void setItems(List<OrderItemDTO> items) {
		this.items = items;
	}
	
	

}
