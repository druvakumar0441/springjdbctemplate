package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class stdService {


	@Autowired
	private stdJdbcTemplate stdtemplte;
	
	public void save(student s) {
		stdtemplte.save(s);
		System.out.println("service ===="+s);
	}

	public student getStudentById(int s) {
	student ss=	stdtemplte.getStudentById(s);
		System.out.println("service ===="+s);
		return ss;
	}
	public void updateStudent(student s) {
		stdtemplte.updateStudent(s);
			System.out.println("service ===="+s);
			
		}
	public void deleteStudent(int t) {
		stdtemplte.deleteStudent(t);
			System.out.println("service ===="+t);
			
		}
	public List<student> getAllStudents() {
	List<student> s=	stdtemplte.getAllStudents();
			System.out.println("service ====");
			return s;
			
		}
	
	
}
