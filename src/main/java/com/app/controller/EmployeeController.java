package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Employee;
import com.app.validator.EmployeeValidator;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeValidator validator;
	
	//1. display form
	@RequestMapping("/show")
	public String showReg(ModelMap map) {
		map.addAttribute("employee", new Employee());
		return "EmpRegister";
	}
	
	//2. read form data
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String readData(
			@ModelAttribute Employee employee,
			Errors errors,
			ModelMap map) 
	{
		String page=null;
		//call validate method
		validator.validate(employee, errors);
		//now check for erros
		if(errors.hasErrors()) {
			//errors exist
			page="EmpRegister";
		}else {
			//no errors
			page="EmpData";
			map.addAttribute("emp", employee);
		}
		
		return page;
	}
	
}




