package app.DTO;

public class StudentDTO {
	private String name;
	private String cellphoneNumber;
	
	public StudentDTO(String name, String cellphoneNumber) {
		super();
		this.name = name;
		this.cellphoneNumber = cellphoneNumber;
	}
	
	public StudentDTO() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphoneNumber() {
		return cellphoneNumber;
	}

	public void setCellphoneNumber(String cellphoneNumber) {
		this.cellphoneNumber = cellphoneNumber;
	}
	
	

}
