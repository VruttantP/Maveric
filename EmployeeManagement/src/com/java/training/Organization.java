package com.java.training;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Organization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalesEmployee se1=new SalesEmployee(101,"Eshan",10000,5000);
		
		System.out.println(se1);
		
//		Employee e1 = new Employee(1,"ABC",100); 
//		System.out.println(e1);
//
//		Employee e2 = new Employee(); 
//		System.out.println(e2);
//		
//		ArrayList<Employee> empList = new ArrayList<Employee>();
//		empList.add(e2);
//		empList.add(e1);
//		Scanner input = new Scanner(System.in);
//		char ch;
//		
//		do {
//			System.out.println("1>Add new record\n2>Display record\n3>Delete Entry\n4>Update Record \n");
//			int choice=input.nextInt();
//			switch(choice) {
//			case 1:
//				System.out.println("Enter Emp Id:");
//				int id=input.nextInt();
//				System.out.println("Enter Emp Name:");
//				String name=input.next();
//				System.out.println("Enter Emp Salary:");
//				double sal=input.nextDouble();
//
//				empList.add(new Employee(id,name,sal));
//				System.out.println("Record is added Successfully....");
//				break;
//			case 2:
//				System.out.println("************Employee record are**********");
//				for (Employee emp : empList) {
//					System.out.println(emp);
//				}
//				break;
//
//			case 3:
//				System.out.println("Enter employee name to delete");
//				String d_name = input.next();
//				int flag = 0;
//				for (int i = 0; i < empList.size(); i++) {
//					if(empList.get(i).getEmpName().equalsIgnoreCase(d_name))
//					{
//						empList.remove(i);
//						System.out.println("Record is deleted successfully...!!!");
//						flag = 1;
//						break;
//					}
//				}
//				if(flag==0)
//					System.out.println("Record not found !!!");				
//				
//				break;
//				
//			case 4:
//				System.out.println("1>Update Name\n2>Update Salary\n\n");
//				int choice1=input.nextInt();
//				switch (choice1) {
//				case 1:
//					System.out.println("Enter Old name ");
//					String oName = input.next();
//					int flag1=0;
//					for (int i = 0; i < empList.size(); i++) {
//						if(empList.get(i).getEmpName().equalsIgnoreCase(oName)) {
//							System.out.println("Enter New Name to replace "+ oName);
//							String newName = input.next();
//							empList.get(i).setEmpName(newName);
//							System.out.println("Updated the name successfully !!!");
//							flag1 =1;
//							break;
//						}						
//					}		
//					if(flag1==0)
//						System.out.println("Record not found !!!");
//					break;
//				case 2:
//					System.out.println("Enter the minimum salary eligible for increment \n");
//					int minSalary = input.nextInt();
//					
//					System.out.println("Enter the increment percentage");
//					int hike = input.nextInt();
//					
//					for (int i = 0; i < empList.size(); i++) {
//						if(empList.get(i).getSalary()<=minSalary) {
//							empList.get(i).setSalary(empList.get(i).getSalary()*(1+hike/100));
//						}
//					}
//					break;
//					
//				default:
//					System.out.println("Invalid Choice");
//				}
//				break;
//			default:
//				System.out.println("Invalid Choice...");
//				break;
//			}
//
//			System.out.println("Do you want to continue....");
//			ch=input.next().charAt(0);
//
//		}while(ch=='y' || ch=='Y');
//
//		System.out.println("I'm done");
	}

}
