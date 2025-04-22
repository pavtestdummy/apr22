package com.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class EmpDetails {

	@GetMapping("/myapp/{empno}")
	public Employee getEmployee(@PathVariable("empno")String empno)
	{
		
		Employee e=new Employee(empno,"Pav_"+empno);
		System.out.println(" employee >"+empno);
		return e;
	}
}
