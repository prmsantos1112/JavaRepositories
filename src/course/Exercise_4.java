package course;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        int funcionario = sc.nextInt();
		int horas_trabalhadas = sc.nextInt();
		double salario = sc.nextDouble();
		salario = salario * horas_trabalhadas;		
		
		System.out.println("Number: " + funcionario);
		System.out.printf("Salary = U$ %.2f", salario);		
		
		sc.close();
		

	}

}
