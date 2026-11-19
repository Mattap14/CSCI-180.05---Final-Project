package app.rest.controllers;


import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.DTO.StudentDTO;
import app.components.StudentManager;
import app.entity.Student;

@Component
@Path("/student")
public class StudentController {
	
	@Autowired
	private StudentManager sm;
	
	@GET
	@Path("/getStudent")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(@QueryParam("studentPk") Long studentPk) {
		return sm.getStudent(studentPk);
	}
	
	@GET
	@Path("/getAllStudents")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudents(Long studentPk){
		return sm.getAllStudents(studentPk);
	}
	
	@POST
	@Path("/add")
	@Produces(MediaType.APPLICATION_JSON)
	public Student addStudent(
	        @FormParam("name") String name,
	        @FormParam("cellphoneNumber") String cellphoneNumber) {
		StudentDTO dto = new StudentDTO();
		dto.setName(name);
		dto.setCellphoneNumber(cellphoneNumber);
		return sm.addStudent(dto);
	}

	
	
	

}
