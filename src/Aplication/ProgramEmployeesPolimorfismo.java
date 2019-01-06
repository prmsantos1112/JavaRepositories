package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeesPolimorfismo;
import entities.OutSourcedEmployeesPolimorfismo;

public class ProgramEmployeesPolimorfismo {

	public static void main(String[] args) {		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeesPolimorfismo> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees:");
		int numero = sc.nextInt();
		
		// Percorrer Employees;
		
		for (int i = 1; i <= numero; i ++) {
			System.out.println("Employee #1" + i + " data: " );
			System.out.print("Outsourced (y/n)? ");
			char recebe = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per Hours: ");
			double valuePerHours = sc.nextDouble();
			
		// 	Ler dados Aditional Charge; se char recebe for y ! segue;
			
			if (recebe == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				
				// Instaciar Employees(Funcionário); 			
				// EmployeesPolimorfismo employees = new OutSourcedEmployeesPolimorfismo(name, hours, valuePerHours, additionalCharge);				
				// Adicionar na Lista;
				list.add(new OutSourcedEmployeesPolimorfismo(name, hours, valuePerHours, additionalCharge));						
				
				// Caso Employees(Funcionário) não terceirizado;
			} else {
				// EmployeesPolimorfismo employees = new EmployeesPolimorfismo(name, hours, valuePerHours);
				// list.add(employees);	
				list.add(new EmployeesPolimorfismo(name, hours, valuePerHours));
				
			}			
		}
		
		System.out.println();
		System.out.println("PAYMENTS: ");
		
		for(EmployeesPolimorfismo employees : list) {
			System.out.println(employees.getName() + " - $ " + String.format("%.2f", employees.payment()));
			
		}
		
		sc.close();
	}

}
