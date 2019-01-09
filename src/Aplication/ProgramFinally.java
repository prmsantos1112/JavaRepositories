package Aplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProgramFinally {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\prmsa\\eclipse-workspace_2018-09\\documento.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
			
		} 
		finally {
			if (sc != null) {
				sc.close();
			}
			JOptionPane.showMessageDialog(null, "Finally block Executed !");
			System.out.println("Finally block Executed !");
		}
	}

}
