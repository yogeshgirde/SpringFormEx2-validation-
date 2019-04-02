package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Employee;

@Component
public class EmployeeValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Employee.class.equals(clazz);
		//return Employee.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		//convert to model class object
		Employee e=(Employee)target;
		
		
		if(!Pattern.matches("[A-Z]{4,6}", e.getEmpName())) {
			errors.rejectValue("empName", null,"Please Enter Valid Employee Name");
		}
		
		if(e.getEmpGen()==null ||"".equals(e.getEmpGen())){
			errors.rejectValue("empGen", null,"Please choose one Gender");
		}
		
		if(e.getEmpDept()==null ||"".equals(e.getEmpDept())){
			errors.rejectValue("empDept", null,"Please select one Dept ");
		}
		
		if(e.getEmpAddr()==null || "".equals(e.getEmpAddr().trim()) || e.getEmpAddr().length()<10) {
			errors.rejectValue("empAddr", null,"Please Enter Address at least 10 chars");
		}
		
		if(e.getEmpPrjs()==null || e.getEmpPrjs().isEmpty()) {
			errors.rejectValue("empPrjs", null,"At least choose one Project");
		}
		
	}

}
