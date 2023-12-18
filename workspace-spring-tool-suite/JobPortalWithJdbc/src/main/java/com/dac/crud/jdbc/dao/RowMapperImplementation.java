package com.dac.crud.jdbc.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.dac.crud.jdbc.model.*;

public class RowMapperImplementation implements RowMapper<Student>{
	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student stud = new Student(rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		return stud;}
}