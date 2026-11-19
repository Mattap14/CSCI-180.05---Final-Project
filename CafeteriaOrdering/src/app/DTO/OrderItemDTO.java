package app.DTO;

public class OrderItemDTO {
	
	private Long foodItemPk;
	private int orderedQuantity;
	
	
	public OrderItemDTO() {
		
	}
	
	public OrderItemDTO(Long foodItemPk, int orderedQuantity) {
		super();
		this.foodItemPk = foodItemPk;
		this.orderedQuantity = orderedQuantity;
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
	
	

}
