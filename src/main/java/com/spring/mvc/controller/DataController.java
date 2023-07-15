package com.spring.mvc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.Data;
import com.spring.mvc.service.DataService;
@Controller
public class DataController {
	@Autowired
	private DataService dataService;
	@RequestMapping("/data/{id}") // by default Requestmethod is GET
	public String getDataWithId(@PathVariable int id, ModelMap dataModel) {
		Data data = dataService.getDataWithId(id);
		dataModel.addAttribute("data", data);
		return "data";
	}
	@RequestMapping(value = "/dataList", method = RequestMethod.GET)
	public String getData(ModelMap dataModel) {
		List<Data> dataList = dataService.getData();
		dataModel.addAttribute("dataList", dataList);
		return "dataList";
	}
	@RequestMapping(value = "update/data/{id}", method = RequestMethod.GET)
	public String updateData(@PathVariable("id") int id, ModelMap dataModel) {
		dataModel.addAttribute("id", id);
		Data data = dataService.getDataWithId(id);
		dataModel.addAttribute("data", data);
		return "update";
	}

	/*
	 * @RequestMapping(value = "/updateData", method = RequestMethod.POST) public
	 * String updateData(@RequestParam int id, @RequestParam(value = "name",
	 * required = true) String name,
	 * 
	 * @RequestParam(value = "experience", required = true) String
	 * experience, @RequestParam(value = "specialization", required = true) String
	 * specialization, ModelMap dataModel) { Data data = new Data(); data.setId(id);
	 * data.setName(name); data.setExperience(experience);
	 * data.setSpecialization(specialization); dataService.updateData(data);
	 * List<Data> dataList = dataService.getData();
	 * dataModel.addAttribute("dataList", dataList); dataModel.addAttribute("id",
	 * id); dataModel.addAttribute("msg", "Data updated successfully"); return
	 * "dataList"; }
	 */
	
	@RequestMapping(value = "/updateData", method = RequestMethod.POST)
	public String updateData(@ModelAttribute("data") Data data) {
		dataService.updateData(data);
		return "redirect:/dataList";
	}
	
	@RequestMapping(value = "/delete/data/{id}")
	public String deleteData(@PathVariable int id, ModelMap dataModel) {
		dataService.deleteData(id);
		List<Data> dataList = dataService.getData();
		dataModel.addAttribute("dataList", dataList);
		dataModel.addAttribute("msg", "Data deleted successfully");
		return "dataList";
	}
}
