package fracCalc;

public class Fraction {
	private int numerator;
	private int denominator;
	private int whole;
	private String sign;
	private String Operand;
	String [] inputString = new String [Operand.length()];
    String [] separateIntoParts = Operand.split(" ");
    String firstOperand = separateIntoParts[0];
    String operator = separateIntoParts[1];
    String secondOperand = separateIntoParts[2];

	
	public Fraction (String Operand) {
		
	}
	
	public void setnumers(int numer) {
		numerator = numer;
	}
	
	public void setdenomi(int denom) {
		denominator = denom;
	}
	
	public void setwhole(int whle) {
		whole = whle;
	}
	
	public int getWhole () {
		return whole;	
	}
	public int getNumers () {
		return numerator;
	}
	
	public int getDenomi () {
		return denominator;
	}
	
	
}
