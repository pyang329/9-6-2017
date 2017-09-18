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
	
	public static boolean isDivisibleBy (int numberOne, int numberTwo) {
		if (numberOne % numberTwo == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static double absValue (double n) {
		if (n<0) {
			return n * (-1);
			
		}else {
			return n;
		}
	}
	
	public static double max ( double valueOne, double valueTwo, double valueThree) {
		if (valueThree<valueTwo && valueOne<valueTwo) {
			return valueTwo;
		}else{
			if (valueTwo<valueOne && valueThree<valueOne) {
				return valueOne;
			}else {
				return valueThree;
			}
		}
	}
	
	public static int min (int numOne, int numTwo) {
		if (numOne < numTwo) {
			return numOne;
		}else{
				return numTwo;
		}
	}
	
	public static double round2 (double decimal) {
		decimal = (decimal * 100) + 0.5;
		decimal = (int)decimal;
		decimal = (double)decimal;
		decimal = decimal/100;
		return decimal;
	}
	
	public static double exponent (double base,int power) {
		double multiplier = base;
		for (int i = 2; i <= power; i++){
			base = base * multiplier;
		}
		return base;
	}
	
	public static int factorial (int a) {
		int num = 1;
		for (int i = a ; i > 0; i--) {
			num *= i;
		}
		return num;
	}
	
	public static boolean isPrime (int number) {
		boolean prime = true;
		number = (int) absValue(number);
		if (number % 2 == 0) {
			prime = false;
		}
		return prime;
	}
	
	public static int gcf (int factorOne, int factorTwo) {
		int gcf = 1;
		for (int i=1; i <= factorTwo; i++) {
			if (isDivisibleBy(factorOne, i) && isDivisibleBy(factorTwo, i)) {
				gcf = 1;
			}
		}
		return gcf;
	}
	
	public static double sqrt (double value) {
		if (value < 0) {
			throw new IllegalArgumentException("nonreal answer");
		}
		double number;
		double squareRoot = value/2;
		}
		
	}
	

