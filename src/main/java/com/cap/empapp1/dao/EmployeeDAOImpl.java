package com.cap.empapp1.dao;

import com.cap.empapp1.db.EmployeeDB;
import com.cap.empapp1.dto.Employee;
import com.cap.empapp1.exceptions.InvalidEmployeeIdExcption;
import com.cap.empapp1.exceptions.WrongSalaryException;

public class EmployeeDAOImpl implements IEmployeeDAO {

		public boolean addEmployee(Employee e) throws WrongSalaryException{
	         // SQL  insert into employee ...... 
			
			//System.out.println(" =====>> DAO Impl employee "+e);
			return EmployeeDB.addEmployee(e);
		}

		public Employee[] getAllEmployees() {

			return EmployeeDB.employees;
		}
		
		//============================================================
		
		
		public boolean editSalaryByEmployeeId(int id) throws InvalidEmployeeIdExcption {
			// TODO Auto-generated method stub
			return EmployeeDB.editSalaryByEmpId(id);
		}

		public boolean editExpByEmployeeId(int id) throws InvalidEmployeeIdExcption {
			// TODO Auto-generated method stub
			return EmployeeDB.editExpByEmpId(id);
		}

		

		public Employee[] getEmployeeBySalary(int salary) {
			// TODO Auto-generated method stub
			return EmployeeDB.getEmployeeBySal(salary);
		}

		public Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
			// TODO Auto-generated method stub
			return EmployeeDB.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
		}

	}
