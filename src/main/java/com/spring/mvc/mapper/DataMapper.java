package com.spring.mvc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.mvc.model.Data;

public class DataMapper implements RowMapper<Data>{
	
	@Override
	public Data mapRow(ResultSet rs, int row) throws SQLException {
		Data data = new Data();
		data.setId(rs.getInt("ID"));
		data.setName(rs.getString("NAME"));
		data.setExperience(rs.getString("EXPERIENCE"));
		data.setSpecialization(rs.getString("SPECIALIZATION"));
		return data;
	}

}
