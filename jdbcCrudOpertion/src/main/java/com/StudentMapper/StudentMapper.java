package com.StudentMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.Student.bean.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std=new Student();
		std.setId(rs.getInt("id"));
		std.setName(rs.getString("name"));
		std.setSection(rs.getString("section"));
		std.setMarks(rs.getString("marks"));
		return std;
	}

}
