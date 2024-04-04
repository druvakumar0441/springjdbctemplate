package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class stdController {

	@Autowired
	private stdService service;
	

	public void save(student c) {
		System.out.println("from controller class===" +c);
		service.save(c);
		System.out.println("controller =="+c);
	}


	public student getStudentById(int c) {
		System.out.println("from controller class===" +c);
		student ss =service.getStudentById(c);
		System.out.println("controller =="+c);
		return ss;
		
	}

	public void updateStudent(student c) {
		System.out.println("from controller class===" +c);
		service.updateStudent(c);
		System.out.println("controller =="+c);
		
		
	}
	public void deleteStudent(int c) {
		System.out.println("from controller class===" +c);
		service.deleteStudent(c);
		System.out.println("controller =="+c);
		
		
	}
	public List<student> getAllStudents() {
		List<student> s=	service.getAllStudents();
				System.out.println("service ====");
				return s;
				
			}


	
}
