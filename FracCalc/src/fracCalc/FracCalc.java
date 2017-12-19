package fracCalc;
import java.util.Scanner;

public class FracCalc {

	public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    		String input;
    		Scanner sc = new Scanner(System.in);
    		do {
    			System.out.println("Please enter in your input. Type quit to exit.");
    			input = sc.nextLine();
    			System.out.println(produceAnswer(input));
    		} while (input != "quit");
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input){ 
        // TODO: Implement this function to produce the solution to the input
        String [] parsedOperand = input.split(" ");
        if(parsedOperand.length % 2 == 0 || parsedOperand.length == 1) {
    		return "ERROR. Check your expression.";
        }
        	String finalString = "";
        	Fraction firstOperand = new Fraction (parsedOperand[0]);
        	Fraction secondOperand;
        	Fraction result;
        	for(int i = 2; i < parsedOperand.length; i += 2) {
        		secondOperand = new Fraction(parsedOperand[i]);
        		String operator = parsedOperand[i-1];
        		
        		if(firstOperand.ifDenomZero() || secondOperand.ifDenomZero()){
        			return "Invalid Answer. Cannot divide by 0.";
        		}
        		if(operator.equals("+")) {
        			result = firstOperand.add(secondOperand);
        		} else if(operator.equals("-")) {
        			secondOperand.changeSign();
        			result = firstOperand.add(secondOperand);
        		} else if(operator.equals("*")) {
        			result = firstOperand.multiply(secondOperand);
        		} else if(operator.equals("/")) {
        			secondOperand.reciprocate();
        			if(secondOperand.ifDenomZero()) {
        				return "Error. Cannot divide by zero.";
        			}
        			result = firstOperand.multiply(secondOperand);
        		}else {
        			return "Unexpected error.";
        		}
        		firstOperand = new Fraction (result);
        		result.simplify();
        		finalString = result.toString();
        		System.out.println(finalString);
        	}
        	return finalString;
    }
    

    // TODO: Fill in the space below with any helper methods that you think you will need
/*    public static int [] parseOperand (String operand) {
    		int wholeNum = 0;
		int numerator = 0;
		int denominator = 1;
		if (operand.indexOf('_') >= 0) {
			wholeNum = Integer.parseInt(operand.substring(0, operand.indexOf('_')));
			numerator = Integer.parseInt(operand.substring(operand.indexOf('_') + 1, operand.indexOf('/')));
			denominator = Integer.parseInt(operand.substring(operand.indexOf('/') + 1));
		} else if(operand.indexOf('/') >= 0){
			numerator = Integer.parseInt(operand.substring(0, operand.indexOf('/')));
			denominator = Integer.parseInt(operand.substring(operand.indexOf('/') + 1));
		}else{
			wholeNum = Integer.parseInt(operand);
		}
		int [] threeIntsOfFraction = {wholeNum, numerator, denominator};
	    return threeIntsOfFraction;
    }
    
    public static String simplify(int[] input) {
		int wholeNum = input[0] / input[1];
		 int numer = input[0]%input[1];
		 int denom = input[1];
			String returnStrg = "";
			if (wholeNum != 0) {
			 numer = absValue(numer);
		 }
			int gcfFrac= gcf(numer, denom);
			numer /= gcfFrac;
			denom /= gcfFrac;
		if (wholeNum == 0) {
			if(numer == 0){
				return "0";
			}
				return numer + "/" + denom;
	}
		if(numer == 0) {
			return "" + wholeNum;
		}
		return wholeNum + "_" + numer + "/" + denom;
	}
    
	public static boolean isDivisibleBy (int numOne, int numTwo) {
		if (numOne%numTwo == 0) {
			return true;
		}else{
				return false; 
		}
	}
	
	public static int gcf(int numOne, int numTwo){
		int gcf = 1; 
		for(int i =1; i<= numTwo; i++) {
			if(isDivisibleBy(numOne, i) && isDivisibleBy(numTwo, i)) {
				gcf = i; 
			}
		}
		return gcf;
	}

	public static int absValue (int value) {
		if (value < 0) {
			return value*-1;
		}else {
			return value;
		}
	}*/
}
