package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeesList;

public class ProgramEmployeesList {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeesList> list = new ArrayList<>();

		// PART 1 - READING DATA:

		System.out.print("How many employees will be registered? ");
		
		int numero = sc.nextInt();
		for (int i = 1; i <= numero; i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeesList(id, name, salary));

		}
		
		// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		
		int id = sc.nextInt();
		EmployeesList employees = list.stream().filter(x -> x.getNumberId() == id).findFirst().orElse(null);
		if (employees == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			employees.increaseSalary(percentage);
			
		}

		// PART 3 - LISTING EMPLOYEES:

		System.out.println();
		System.out.println("List of employees:");
		for (EmployeesList obj : list) {
			System.out.println(obj);
			
		}
		
		sc.close();

	}

}
