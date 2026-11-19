package app.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.DTO.StudentDTO;
import app.entity.Student;
import app.repository.StudentRepository;

@Component
public class StudentManager {
	
	@Autowired
	StudentRepository sr;
	
	
	public Student getStudent(Long studentPk){
		return sr.findBystudentPk(studentPk);
	}
	
	public List<Student> getAllStudents(Long studentPk){
		return sr.findAll();
	}
	
	public Student addStudent(StudentDTO studentDTO) {
		Student s = new Student();
		s.setName(studentDTO.getName());
		s.setCellphoneNumber(studentDTO.getCellphoneNumber());
		s = sr.save(s);
		return s;
		
	}

}
