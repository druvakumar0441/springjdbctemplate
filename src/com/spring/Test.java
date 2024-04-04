package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main1(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(JDBCUtility.class);
		stdController sc =con.getBean(stdController.class);
		sc.save(new student(3, "hari", 23, "mtech"));
	}
	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(JDBCUtility.class);
		stdController sc =con.getBean(stdController.class);
		student ss=sc.getStudentById(14);
		
			System.out.println(ss);
	
		
	}
	public static void main3(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(JDBCUtility.class);
		stdController sc =con.getBean(stdController.class);
		sc.updateStudent(new student(13, "hari", 23, "mtech"));
		
	}
	public static void main4(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(JDBCUtility.class);
		stdController sc =con.getBean(stdController.class);
		sc.updateStudent(new student(13, "hari", 23, "mtech"));
		
	}public static void main5(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(JDBCUtility.class);
		stdController sc =con.getBean(stdController.class);
		sc.deleteStudent(13);
		
	}
	public static void main6(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(JDBCUtility.class);
		stdController sc =con.getBean(stdController.class);
		List<student> ss=sc.getAllStudents();
		for (student student : ss) {
			System.out.println(student);
		}
		
	}
}
