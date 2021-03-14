package com.cap.empapp1.service;

import com.cap.empapp1.dto.Employee;
import com.cap.empapp1.exceptions.InvalidEmployeeIdExcption;
import com.cap.empapp1.exceptions.WrongSalaryException;

public interface IEmployeeService {
		public boolean addEmployee(Employee e)throws WrongSalaryException;
		 
		 public boolean editSalaryByEmployeeId(int id)throws InvalidEmployeeIdExcption;
		 
		 public boolean editExpByEmployeeId(int id)throws InvalidEmployeeIdExcption;
		 
		 public Employee[] getAllEmployees();
		 
		 public Employee[] getEmployeeBySalary(int salary);
		 
		 public Employee[] getEmployessBySalaryRange(int salaryRangeMin,int salaryRangeMax);

	}

