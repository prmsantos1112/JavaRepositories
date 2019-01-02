package Aplication;

import java.text.ParseException;
import java.util.Scanner;

import entities.Pensionato;

public class ProgramVectorPensionato {

	public static void main(String[] args) throws ParseException {

		
		Scanner sc = new Scanner(System.in);

		Pensionato[] pensionato = new Pensionato[10];

		System.out.print("How many rooms will be rented? ");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name : ");
			sc.nextLine();
			String nameStudent = sc.nextLine();
			System.out.print("Email : ");
			String emailStudent = sc.nextLine();
			System.out.print("Room : ");
			int room = sc.nextInt();
			pensionato[room] = new Pensionato(nameStudent , emailStudent);

		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (pensionato[i] != null) {
				System.out.println(i + " : " + pensionato[i]);
				
			}
		}

		sc.close();

	}

}
