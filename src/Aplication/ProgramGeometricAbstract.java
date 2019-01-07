package Aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ShapeAbstract;
import entities.enums.Color;
import entities.CircleAbstract;
import entities.RetangleAbstract;

public class ProgramGeometricAbstract {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<ShapeAbstract> list = new ArrayList<>();
		
		System.out.print("Enter the number of Shapes");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i ++) {
			System.out.println("Shape #" + i + " data: ");
			System.out.print("Rectangle or Circle (r/c)? ");
			
			char ch = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			
			Color color = Color.valueOf(sc.next());
			
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new RetangleAbstract(color, width, height));
				
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new CircleAbstract(color, radius));
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		
		for (ShapeAbstract shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}		
		
		sc.close();

	}

}
