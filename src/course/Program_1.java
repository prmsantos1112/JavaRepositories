package course;

import java.util.Locale;

public class Program_1 {

	public static void main(String[] args) {
		
		boolean complete = false;
		char gerder = 'F';
		char letter = '\u0041';
		byte n1 = 126;
		int n2 = 1000;
		int n3 = 2147483647;
		long n4 = 2147483648L;
		float n5 = 4.5f;
		double n6 = 4.5;
		
		String nome = "Paulo Ricardo";
		Object obj1 = "Evonira Simões";
		Object obj2 = 10.6f;
		
		
		char gender = 'F'; 
		int age = 32; 
		double balance = 10.35784; 
		String name = "Maria";
		
		System.out.println(complete);
		System.out.println(gerder);
		System.out.println(letter);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(n6);
		
		System.out.println();
		
		System.out.println(nome);
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		
		System.out.print("Good morning!"); 
		System.out.println("Good afternoon!"); 
		System.out.println("Good night!"); 
		System.out.println("---------------------------"); 
		System.out.println(balance); 
		System.out.printf("%.2f%n", balance); 
		System.out.printf("%.4f%n", balance); 
		Locale.setDefault(Locale.US); 
		System.out.printf("%.4f%n", balance); 
		System.out.println("---------------------------"); 
		System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name, age, gender, balance);

	}

}
