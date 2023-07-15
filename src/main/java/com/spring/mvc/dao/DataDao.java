package com.spring.mvc.dao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.spring.mvc.mapper.DataMapper;
import com.spring.mvc.model.Data;
@Repository
@Transactional
public class DataDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public Data getData(final int id) {
		Data data = jdbcTemplate.queryForObject("select * from data where ID = ?", new Object[] { id },
				new DataMapper());
		return data;
	}
	public List<Data> getdata() {
		List<Data> data = jdbcTemplate.query("select * from Data", new DataMapper());
		System.out.println(data);
		return data;
	}
	public void updatedata(final Data data) {
		jdbcTemplate.update("update data set NAME = ?, EXPERIENCE = ?, SPECIALIZATION = ? where ID = ?",
				new Object[] { data.getName(), data.getExperience(), data.getSpecialization(), data.getId() });
	}
	public void deletedata(final int id) {
		jdbcTemplate.update("delete from data where ID = ?", new Object[] { id });
	}
}
