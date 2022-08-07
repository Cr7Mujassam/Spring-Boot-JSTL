package com.in28minutes.springboot.web.springbootfirstwebapplication.secondController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.in28minutes.springboot.web.springbootfirstwebapplication.list.ListShow;

@Controller
//to store the data in request server to acess the name attributes in every controller/request
@SessionAttributes("name")
public class SecondController {
	
	@Autowired
	ListShow list;
	
	@RequestMapping(value="/link", method= RequestMethod.GET)
	public String link(ModelMap model) {
		model.put("list",list.showList());
		//here we are retreving the data and chaning into types you want
		String object  = (String) model.get("name");
		//here wea re passing the data into view(JSP)
		model.put("object",object);
		return "list";
	}
	
	@RequestMapping(value="/addlist",method = RequestMethod.GET)
	public String addCar(ModelMap model) {
		
		return "AddList";
	}
	
	@RequestMapping(value="/addlist",method = RequestMethod.POST)
	public String addCars(ModelMap model,@RequestParam String car) {
		list.car = car;
		model.put("list",list.showList()); 
		model.put("car1",list.car);
		return "showcar";
	}
	
}
