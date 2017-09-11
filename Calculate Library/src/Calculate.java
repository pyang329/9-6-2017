// Pauline Yang
//September 6 2017
//our self written math library
// it contains a series of methods to do math functions
public class Calculate {
	//square the input
	public static int square (int operand) {
		int squared = operand*operand;
		return squared;
	}	
		
	public static int cube (int operand) {
		int cubed = operand*operand*operand;
		return cubed;
	}
	
	public static double average (double x, double y) {
		return (x + y) / 2;
	}
	
	public static double average (double xx, double yy, double z) {
		return (xx + yy + z) / 3;
	}
	
	public static double toDegrees (double radian) {
		return (radian * 180)/3.14;
	}
	
	public static double toRadians (double degree) {
		return (degree *3.14)/180;
	}
	
	public static double discriminant (double a, double b, double c) {
		return (b * b)- (4* a * c);
	}
	
	public static String toImproperFrac (int whole, int numerator, int denominator) {
		 return ((whole * denominator) + numerator) + "/" + (denominator);
		
	}
	
	public static String toMixedNum (int numerator, int denominator) {
		return (numerator/denominator) + "_" + (numerator % denominator) + "/" + (denominator);
	}
	
	public static String foil (int a, int b, int c, int d, String variable) {
		return (a * c) + (variable) +"^2+" + ((a*d) + (b*c))+(variable) + (b*d);
	}
	
	public static boolean isDividibleBy () {
		boolean isDivisible = false;
	}
}	
	