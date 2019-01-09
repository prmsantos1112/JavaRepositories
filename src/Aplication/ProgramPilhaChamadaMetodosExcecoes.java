package Aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramPilhaChamadaMetodosExcecoes {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("End of Program !");
	}
	
	public static void method1() {
		System.out.println(" ******* Method1 Start ******");
		System.out.println();
		method2();
		System.out.println(" ******* Method1 End ******");
		System.out.println();
		
	}
	
	public static void method2() {	
		System.out.println(" ******* Method2 Start ******");
		System.out.println();
		Scanner sc = new Scanner(System.in);		
		
		try { 
			String[] vect = sc.nextLine().split(" "); 
			int position = sc.nextInt(); 
			System.out.println(vect[position]); 
			
		} 		
		catch (ArrayIndexOutOfBoundsException e) { 
			System.out.println("Invalid position!"); 
			e.printStackTrace();
			sc.next();
			
		} 		
		catch (InputMismatchException e) { 
			System.out.println("Input error"); 
			
		}
		
		System.out.println();
		System.out.println(" ******* Method2 End ******");
		System.out.println();
		sc.close();
	}

}
