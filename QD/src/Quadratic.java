//Pauline Yang 
// period 2
// October 10, 2017


public class Quadratic {
	public static string quadrDescriber (double a, double b, double c) {
		//prints out full equation and its coefficient 
		System.out.println(a + ": ");
		System.out.println(b + ": ");
		System.out.println(c + ": ");
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
		
}	
		
	public static String quadForm (int a, int b, int c) {
		double ad = a;
		double bd = b;
		double cd = c;
		double dscrmnt = Calculate.discriminant(ad,bd,cd);
		if (dscrmnt < 0) {
			return "no real roots";
		}
		double xAdd = round2(((-1* bd) + Calculate.sqrt(dscrmnt))/ (2*ad));
		double xSubtract = round2(((-1* bd) - Calculate.sqrt(dscrmnt))/ (2*ad));		
		if (dscrmnt == 0) {
			return xAdd + "";
		}else if (xAdd > xSubtract){
			return xSubtract + " and " + xAdd; 
			}else{
				return xAdd + " and " + xSubtract;
			}
	}
}
