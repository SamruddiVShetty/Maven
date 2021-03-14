package com.cap.empapp1.db;

import java.util.Scanner;

import com.cap.empapp1.dto.Employee;
import com.cap.empapp1.exceptions.InvalidEmployeeIdExcption;

public class EmployeeDB {
		// Employee cannot be resolved to a type
		public static Employee employees[]  = new Employee[100];
		
		public static int count = 0;
		
		static {
			
			employees[count++] = 	new Employee(101, "ramesh", 8, 7000);
			employees[count++] = 	new Employee(102, "suresh", 2, 8000);
			employees[count++] = 	new Employee(103, "rakesh", 1, 4000);
			employees[count++] = 	new Employee(104, "lokesh", 5, 3000);
			
			}
			
			
		public static boolean addEmployee(Employee e)
		{
			
			employees[count++] = e;
		
			return true;
		}
		
		public static int getCount()
		{
			return count;
		}

		public static boolean editSalaryByEmpId(int id) throws InvalidEmployeeIdExcption{
			for(int i=0;i<count;i++) {
				if(employees[i].getEmployeeId()==id) {
					System.out.println("Enter new salary");
					  int sal=new Scanner(System.in).nextInt();
					employees[i].setSalary(sal);
				return true;
				}
			}
			return false;
			}

		public static boolean editExpByEmpId(int id) {
			for(int i=0;i<count;i++) {
				if(employees[i].getEmployeeId()==id) {
					System.out.println("Enter new exp");
					  int exp=new Scanner(System.in).nextInt();
					employees[i].setExp(exp);
				return true;
				}
			}
			return false;
			}

		public static Employee[] getEmployeeBySal(int salary) {
			Employee[] temp=new Employee[count];
			int x=0;
			for (int i = 0; i < count; i++) {
				if(employees[i].getSalary()==salary) {
					temp[x++]=employees[i];
				
				}
			}
			return temp;
		}

		public static Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
			Employee[] temp=new Employee[count];
			int x=0;
			for (int i = 0; i < count; i++) {
				if(employees[i].getSalary()>=salaryRangeMin && employees[i].getSalary()<=salaryRangeMax) {
					temp[x++]=employees[i];
				}
			}
			return temp;
		}
		

	}