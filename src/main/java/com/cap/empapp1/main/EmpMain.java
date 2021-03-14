package com.cap.empapp1.main;

import java.util.Scanner;

import com.cap.empapp1.db.EmployeeDB;
import com.cap.empapp1.dto.Employee;
import com.cap.empapp1.exceptions.InvalidEmployeeIdExcption;
import com.cap.empapp1.service.EmployeeServiceImpl;
import com.cap.empapp1.service.IEmployeeService;

public class EmpMain {
IEmployeeService empService = new EmployeeServiceImpl();
	
	public static void main(String[] args) {
		
		EmpMain app = new EmpMain();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println(" === MUNU ==== ");
			System.out.println("1. add employee ");
			System.out.println("2. Display All Employee ");
			System.out.println("3.edit salary ");
			System.out.println("4.edit Experience ");
			System.out.println("5.Get Employee based on sal ");
			System.out.println("6.Get Employee based on salRange ");
			System.out.println("0. EXIT");
			
			System.out.println("Enter Option");
			int option = Integer.parseInt(sc.nextLine());
			switch(option)
			{
			
			case 1:
				
				System.out.println("Enter Employee Id ");
				int empId = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Salary ");
				int empSalary = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Exp ");
				int empExp = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Name ");
				String name = sc.nextLine();
				
				Employee e = new Employee(empId, name, empExp, empSalary);
				
				try
				{
					boolean isInserted = app.empService.addEmployee(e);
					if(isInserted)
					{
						System.out.println(" Employee Added !!!");
					}
					else
					{
						 throw new Exception("Cannot added Employee ...");
					}
				}
				catch(Exception ex)
				{
					System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
				}
				
				break;
			case 2:
				
				Employee arr[] = app.empService.getAllEmployees();
				int count = EmployeeDB.count;  // not the code
				System.out.println("  --->>  count in main "+count);
				for (int i = 0; i < count; i++) {
					System.out.println(arr[i]);
					System.out.println(" ========================================================");
				}
				break;
			case 0:
				System.exit(0);
			
			case 3:System.out.println("Enter id to change salary");
			  int n=Integer.parseInt(sc.nextLine()); 
			  boolean flag;
			   try {
				   flag=app.empService.editSalaryByEmployeeId(n);
				   if(flag==true) {
					   System.out.println("salary changed sucessfully");
				   }
				   else {
					   throw new InvalidEmployeeIdExcption();
				   }
			   }
			   catch(Exception ex) {
				   System.out.println("Enter valid Employee id:"+ex);
				   
			   }
			case 4:System.out.println("Enter id to change Experience");
			  int n1=Integer.parseInt(sc.nextLine()); 
			  boolean flag1;
			   try {
				   flag1=app.empService.editExpByEmployeeId(n1);
				   if(flag1==true) {
					   System.out.println("Experience changed sucessfully");
				   }
				   else {
					   throw new InvalidEmployeeIdExcption();
				   }
			   }
			   catch(Exception ex) {
				   System.out.println("Enter valid Employee id:"+ex);
				   
			   }
			case 5:System.out.println("Enter sal to fetch Employee");
			int empsal=Integer.parseInt(sc.nextLine());
			Employee temp[]=app.empService.getEmployeeBySalary(empsal);
			for(int i=0;i<temp.length;i++) {
				System.out.println(temp[i]);
			}
			case 6:System.out.println("Enter min sal to fetch Employee");
			int minsal=Integer.parseInt(sc.nextLine());
			System.out.println("Enter max sal to fetch Employee");
			int maxsal=Integer.parseInt(sc.nextLine());
			Employee temp1[]=app.empService.getEmployessBySalaryRange(minsal,maxsal);
			for(int i=0;i<temp1.length;i++) {
				System.out.println(temp1[i]);
			}
			
			}//end switch
			
		}// end while
		
		
		
	}//end main

}//end class
