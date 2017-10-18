//Pauline Yang
//Period 2
//October 10, 2017

import java.util.Scanner;

public class QuadraticClient {
	public static void main(String[] args) {
		//prints out full equation and its coefficient 
		boolean done = false;
		System.out.println("Welcome to the Quadratic Describer");
		Scanner userInput = new Scanner(System.in);
		System.out.println("a: ");
		double a = userInput.nextDouble();
		System.out.println("b: ");
		double b = userInput.nextDouble();
		System.out.println("c: ");
		double c = userInput.nextDouble();
		System.out.println();
		System.out.println("Description of the graph of: ");
		System.out.println("y = " + a + "x^2 " + b + "x " + c);
		System.out.println();
		
		//determines if graph opens up or down
		if (a > 0) {
			System.out.println("Opens: Up");
		}else {
			System.out.println("Opens: Down");
		}
		
		//determines the axis of symmetry
		double axisOfSymmetry = (-1* b)/(2*a);
		System.out.println("Axis of Symmetry: " + axisOfSymmetry);	
}
