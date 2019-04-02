package com.app.model;

import java.util.List;

public class Employee {

	private String empName;
	private String empGen;
	private String empDept;
	private String empAddr;
	private List<String> empPrjs;
	
	public Employee() {
		super();
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpGen() {
		return empGen;
	}
	public void setEmpGen(String empGen) {
		this.empGen = empGen;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
	public List<String> getEmpPrjs() {
		return empPrjs;
	}
	public void setEmpPrjs(List<String> empPrjs) {
		this.empPrjs = empPrjs;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empGen=" + empGen + ", empDept=" + empDept + ", empAddr=" + empAddr
				+ ", empPrjs=" + empPrjs + "]";
	}
	
	
	


}
