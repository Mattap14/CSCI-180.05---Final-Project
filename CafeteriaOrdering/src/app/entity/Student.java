package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)  
	@Column
	private Long studentPk;
	
	@Column
	private String name;
	
	@Column
	private String cellphoneNumber;
	
	public Student() {
		
	}

	public Student(String name, String cellphoneNumber) {
		super();
		this.name = name;
		this.cellphoneNumber = cellphoneNumber;
	}

	public Long getStudentPk() {
		return studentPk;
	}

	public void setStudentPk(Long studentPk) {
		this.studentPk = studentPk;
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

	@Override
	public String toString() {
		return "Student [studentPk=" + studentPk + ", name=" + name + ", cellphoneNumber=" + cellphoneNumber + "]";
	}
	
	
	

}
