package com.spring;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<student> {

    @Override
    public student mapRow(ResultSet rs, int rowNum) throws SQLException {
    	student student = new student();
        student.setSid(rs.getInt("id"));
        student.setSname(rs.getString("name"));
        // Set other properties as needed
        return student;
    }
}