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
	
	// cube the input	
	public static int cube (int operand) {
		int cubed = operand*operand*operand;
		return cubed;
	}
	
	// average (two values) - A call to average returns the average of the values passed to it. This method
	// accepts two doubles and returns a double. Calculates the average of two numbers
	public static double average (double x, double y) {
		return (x + y) / 2;
	}
	
	// average (three values) - accepts three doubles and returns a double.
	// Calculates the average of three numbers
	public static double average (double xx, double yy, double z) {
		return (xx + yy + z) / 3;
	}
	
	//takes the radian value and turns it into degrees
	public static double toDegrees (double radian) {
		return (radian * 180)/3.14;
	}
	
	//takes the degree value and turns it into radians
	public static double toRadians (double degree) {
		return (degree *3.14)/180;
	}
	
	//calculates the discriminant of a quadratic function
	public static double discriminant (double a, double b, double c) {
		return (b * b)- (4 * a * c);
	}
	
	// changes a mixed number to an improper fraction
	public static String toImproperFrac (int whole, int numerator, int denominator) {
		 return ((whole * denominator) + numerator) + "/" + (denominator);	
	}
	
	// changes an improper fraction into a mixed number
	public static String toMixedNum (int numerator, int denominator) {
		return (numerator/denominator) + "_" + (numerator % denominator) + "/" + (denominator);
	}
	
	//foils a quadratic function
	public static String foil (int a, int b, int c, int d, String variable) {
		return (a * c) + (variable) +"^2+" + ((a*d) + (b*c))+(variable) + (b*d);
	}
	
	//determines if a number is divisible by the other numer
	public static boolean isDivisibleBy (int numberOne, int numberTwo) {
		if (numberOne % numberTwo == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//calculates the absolute value of a number
	public static double absValue (double n) {
		if (n<0) {
			return n * (-1);
			
		}else {
			return n;
		}
	}
	
	//determines which of the three numbers is the maximum
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
	
	//determines which of the three numbers in the minimum
	public static int min (int numOne, int numTwo) {
		if (numOne < numTwo) {
			return numOne;
		}else{
				return numTwo;
		}
	}
	
	//rounds the decimal number to two places (the hundreths place)
	public static double round2 (double decimal) {
		decimal = (decimal * 100) + 0.5;
		decimal = (int)decimal;
		decimal = (double)decimal;
		decimal = decimal/100;
		return decimal;
	}
	
	//calculates a number to its power 
	public static double exponent (double base,int power) {
		double multiplier = base;
		for (int i = 2; i <= power; i++){
			base = base * multiplier;
		}
		return base;
	}
	
	//calculates the factorial of a number
	public static int factorial (int a) {
		int num = 1;
		for (int i = a ; i > 0; i--) {
			num *= i;
		}
		return num;
	}
	
	//determines if a number is prime or not
	public static boolean isPrime (int number) {
		boolean prime = true;
		number = (int) absValue(number);
		if (number % 2 == 0) {
			prime = false;
		}
		return prime;
	}
	
	//finds the greatest common factor of two numbers
	public static int gcf (int factorOne, int factorTwo) {
		int gcf = 1;
		for (int i=1; i <= factorTwo; i++) {
			if (isDivisibleBy(factorOne, i) && isDivisibleBy(factorTwo, i)) {
				gcf = i;
			}
		}
		return gcf;
	}
	
	//takes the square root of the value
	public static double sqrt (double value) {
		if (value < 0) {
			throw new IllegalArgumentException("nonreal answer");
		}
		double number;
		double squareRoot = value/2;
		do {
			number = squareRoot;
			squareRoot = (number + (value/number))/2;
		}
		while ((number - squareRoot) != 0);
		return Calculate.round2(squareRoot);
		}
		

	// finds the roots of a quadratic function using the quadratic formula
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
	
	


	

