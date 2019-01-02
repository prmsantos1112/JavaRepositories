package Aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class ProgramEmployees {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employees employees = new Employees();
		
		System.out.println("Name; ");
		employees.name = sc.nextLine();
		System.out.println("GrossSalary; ");
		employees.grossSalary = sc.nextDouble();
		System.out.println("Tax; ");
		employees.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employees);
		System.out.println();
		System.out.print("Which percentage to increase salary? "); 
		double percentage = sc.nextDouble(); 
		employees.increaseSalary(percentage); 
		
		System.out.println(); 
		System.out.println("Updated data: " + employees); 		
		
		sc.close();
	}
}
