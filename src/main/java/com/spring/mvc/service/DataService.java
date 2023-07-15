package com.spring.mvc.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.mvc.dao.DataDao;
import com.spring.mvc.model.Data;
@Service
public class DataService {
	@Autowired
	private DataDao dataDao;
	public Data getDataWithId(final int id) {
		return dataDao.getData(id);
	}
	public List<Data> getData() {
		return dataDao.getdata();
	}
	public void updateData(final Data data) {
		dataDao.updatedata(data);
	}
	public void deleteData(final int id) {
		dataDao.deletedata(id);
	}
}
