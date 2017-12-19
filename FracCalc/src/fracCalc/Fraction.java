package fracCalc;

public class Fraction {
	private int wholeNum = 0;
	private int numerator = 0;
	private int denominator = 1;
	/*private String sign;
	private String Operand;
	private String wholeString;
	private String numString;
	private String denomString;*/
	//constructs fraction with given numbers
	public Fraction (String frac) {
		if (frac.contains("/") && frac.contains("_")) {
			wholeNum = Integer.parseInt(frac.split("_")[0]);
			numerator = Integer.parseInt(frac.split("_")[1].split("/")[0]);
			denominator = Integer.parseInt(frac.split("/")[1]);	
		}else if(frac.contains("/")) {
			numerator = Integer.parseInt(frac.split("/")[0]);
			denominator = Integer.parseInt(frac.split("/")[1]);
		}else {
			wholeNum = Integer.parseInt(frac);
		}
		toImproperFrac();
	}
	
	//sets default values for fraction
	public Fraction(){
		this(0,0,1);
	}
	
	//takes fraction that has no whole number
	public Fraction(int numerator, int denominator) {
		this(0, numerator, denominator);
	}
	
	//constructor that constructs fraction with given numbers
	public Fraction (int whole, int numer, int denom) {
		this.wholeNum = whole;
		this.numerator = numer;
		this.denominator = denom;
		toImproperFrac();
		}
	
	public Fraction(Fraction frac) {
		this(frac.getWhole(), frac.getNumer(), frac.getDenom());
	}
	
	public Fraction add(Fraction input) {
		Fraction result = new Fraction();
		result.setNumer(this.numerator * input.getDenom() + input.getNumer() * this.denominator);
		result.setDenom(this.denominator * input.getDenom());
		return result;
	}
	
	public void changeSign() {
		if(wholeNum == 0) {
			numerator *= -1;
		}else {
			wholeNum *= -1;
		}
	}
	
	/*public Fraction subtract(Fraction input) {
		Fraction result = new Fraction();
		result.setNumer(this.numerator * input.getDenom() - input.getNumer());
		result.setDenom(this.numerator * input.getDenom());
		return result;
	}*/
	
	public Fraction multiply(Fraction input) {
		Fraction result = new Fraction(this.numerator * input.getNumer(), this.denominator * input.getDenom());
		return result;
	}
	
	public void reciprocate() {
		if(numerator < 0) {
			denominator *= -1;
			numerator *= -1;
		}
		int newNum = numerator;
		numerator = denominator;
		denominator = newNum;
	}
	
	
	/*public Fraction divide(Fraction input) {
		Fraction result = new Fraction();
		result.setNumer(this.numerator * input.getDenom());
		result.setDenom(this.denominator * input.getNumer());
		return result;
	}*/
	
	public void toImproperFrac() {
		if(wholeNum < 0 && numerator > 0) {
			numerator *= -1;
		}
		numerator = wholeNum * denominator + numerator;
		wholeNum = 0;
	}
	
	//
	public void toMixedNum() {
		wholeNum = numerator/denominator + wholeNum;
		if(wholeNum != 0){ 
			numerator = Math.abs(numerator);
		}
		numerator = numerator % denominator;
	}
	
	//simplifies the fraction 
		public void simplify() {
			toMixedNum();
			int gcf = greatestcomfact(numerator, denominator);
			numerator /= gcf;
			denominator /= gcf;
		}
	
	//finds the greatest common factor if two integers
	public static int greatestcomfact(int numOne, int numTwo) {
		numOne = Math.abs(numOne);
		numTwo = Math.abs(numTwo);
		int gcf = 1; 
		for(int i =1; i<= numTwo; i++) {
			if((numOne % i == 0) && (numTwo % i == 0)) {
				gcf = i; 
			}
		}
		return gcf;
	}
	
	public boolean ifDenomZero() {
		if(denominator == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//returns fraction parts into one fraction string
	public String toString() {
		toMixedNum();
		if(wholeNum == 0) {
			if(numerator == 0) {
				return "0";
			}
			return numerator + "/" + denominator;
		}
		if (numerator == 0) {
			return "" + wholeNum;

		}
		return wholeNum + "_" + numerator + "/" + denominator;
	}
	
	//getters and setters for the fraction
	public int getWhole () {
		return wholeNum;	
	}
	public void setWhole(int wholeNumber) {
		this.wholeNum = wholeNumber;
	}
	public int getNumer () {
		return numerator;
	}
	public void setNumer(int numer) {
		this.numerator = numer;
	}
	
	public int getDenom () {
		return denominator;
	}
	public void setDenom(int denom) {
		this.denominator = denom;
	}
}	