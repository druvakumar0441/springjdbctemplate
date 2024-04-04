package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class stdJdbcTemplate {

	@Autowired
	private JdbcTemplate jtemplate;

	public void save(student s) {
	
		jtemplate.update("insert into spring.student (sname, sage, squal) values (?,?,?)", s.getSname(), s.getSage(), s.getSqual());
		System.out.println("template====="+s);
		
	}

	public void getId(int s) {
		try {
            String sql = "SELECT * FROM spring.student WHERE sid = ?";
            student student = (com.spring.student) jtemplate.queryForObject(sql, new Object[]{s}, new StudentRowMapper());
            System.out.println("template====="+s);
            System.out.println(student);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
	}
	public void addStudent(student student) {
        String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
        jtemplate.update(sql, student.getSid(), student.getSname(), student.getSage());
    }

    // READ operation
    public student getStudentById(int id) {
        String sql = "SELECT * FROM student WHERE sid = ?";
        return jtemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
        	student student = new student();
            student.setSid(rs.getInt("sid"));
            student.setSname(rs.getString("sname"));
            student.setSage(rs.getInt("sage"));
            student.setSqual(rs.getString("squal"));
            return student;
        });
        
    }

    // UPDATE operation
    public void updateStudent(student student) {
        String sql = "UPDATE student SET sname = ?, sage = ? WHERE sid = ?";
        jtemplate.update(sql, student.getSname(), student.getSage(), student.getSid());
    }

    // DELETE operation
    public void deleteStudent(int id) {
        String sql = "DELETE FROM student WHERE sid = ?";
        jtemplate.update(sql, id);
    }

    // READ operation to get all students
    public List<student> getAllStudents() {
        String sql = "SELECT * FROM student";
        return jtemplate.query(sql, (rs, rowNum) -> {
        	student student = new student();
            student.setSid(rs.getInt("sid"));
            student.setSname(rs.getString("sname"));
            student.setSage(rs.getInt("sage"));
            student.setSqual(rs.getString("squal"));
            return student;
        });
    }
}
