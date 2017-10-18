//Pauline Yang 
// period 2
// October 10, 2017


public class Quadratic {
	public static String quadrDescriber (double a, double b, double c) {
		if (a == 0) {
			throw new IllegalArgumentException("a cannot equal 0");
		}
		String equation = "y = " + a + "x^2 " + b + "x " + c;
		String opens = "up";
		if (a>0) {
			
		}

		}
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

		
	