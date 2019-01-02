package entities;

public class Retangle {

	public double width; // Largura;
	public double height; // Altura;

	public double ValueArea() {
		return width * height;

	}

	public double ValueParimeter() {
		return (width * 2) + (height * 2);
		// return 2 * (width + height); 
	}

	public double ValueDiagonal() {
		return Math.sqrt(width * width + height * height);
	}	
	
}
