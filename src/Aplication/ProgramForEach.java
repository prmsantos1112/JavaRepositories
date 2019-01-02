package Aplication;

public class ProgramForEach {

	public static void main(String[] args) {
		
		String [] vector = new String[] {"Paulo", "Ricardo", "Eduardo"};
		
		for (int i = 0; i < vector.length; i ++) {
			System.out.println(vector[i]);
		}
		
		System.out.println();
		System.out.println("-----------For Each-----------------");
		System.out.println();
		for (String obj : vector) {
			System.out.println(obj);
		}
	}
}
