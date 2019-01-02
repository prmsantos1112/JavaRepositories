package course;

import java.util.Locale;

public class Exercises {

	public static void main(String[] args) {
		
		String product1 = "Computer"; 
		String product2 = "Office desk";
		int age = 30; 
		int code = 5290; 
		char gender = 'F';
		double price1 = 2100.0; 
		double price2 = 650.50; 
		double measure = 53.234567;
		
		double a = 1.0, b = -3.0, c = -4.0; 
		double x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);

		
		/* Em seguida, usando os valores das vari�veis, produza a seguinte sa�da na tela do console:
         * Products: Computer, which price is $ 2100,00 Office desk, which price is $ 650,50
         * Record: 30 years old, code 5290 and gender: F
         * Measue with eight decimal places: 53,23456700 Rouded (three decimal places): 53,235 US decimal point: 53.235 
		 */

		
		
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.printf("Computer: %s, which price is %.2f %s, which price is %.2f.%n", product1, price1, product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender );
		
		
		System.out.printf("Measue with eight decimal places: %.8f Rounded (three decimal places): %.3f " , measure, measure, measure );
				
		Locale.setDefault(Locale.US); 
		System.out.printf("US decimal point: %.3f%n", measure);

		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.printf("Resposta Bascara: %.2f" ,x1);
	}

}
