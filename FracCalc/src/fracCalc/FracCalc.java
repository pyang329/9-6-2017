// Pauline Yang
// 11/21/2017
// APCS Period 2
package fracCalc;
import java.util.Arrays;
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
        String [] inputString = new String [input.length()];
        String [] separateIntoParts = input.split(" ");
        String firstOperand = separateIntoParts[0];
        String operator = separateIntoParts[1];
        String secondOperand = separateIntoParts[2];
        int[] parsedFirstOperand = parseOperand(firstOperand);
		int[] parsedSecondOperand = parseOperand(secondOperand);
		int[] impropFracFirst = toImproperFrac(parsedFirstOperand);
		int[] impropFracSecond = toImproperFrac(parsedSecondOperand);
		int[] commonFractions = commonDenominator(impropFracFirst,impropFracSecond);
        	int numerator;
        	int denominator;
        	String strNumer;
        	String strDenomi;
        	String answer;
        	if (parsedFirstOperand[2] == 0 || parsedSecondOperand[2] == 0) {
            	return "Invalid Answer. Cannot divide by 0.";
        	}
        if (operator.equals("+")) {
        		numerator = (commonFractions[0] + commonFractions[1]);
        		strNumer = Integer.toString(numerator);
        		answer = strNumer + "/" + commonFractions[2];
        		return answer;
        	} else if(operator.equals("-")) {
        		numerator = (commonFractions[0] - commonFractions[1]);
        		strNumer = Integer.toString(numerator);
        		answer = strNumer + "/" + commonFractions[2];
        		return answer;
        	} else if(operator.equals("*")) {
        		numerator = (commonFractions[0] * commonFractions[1]);
        		denominator = (commonFractions[2] * commonFractions[2]);
        		strNumer = Integer.toString(numerator);
        		strDenomi = Integer.toString(denominator);
        		answer = strNumer + "/" + strDenomi;
        		return answer;
        	} else if (operator.equals("/")) {
        		numerator = (commonFractions[0] * commonFractions[2]);
        		denominator = (commonFractions[1] * commonFractions[2]);
        		strNumer = Integer.toString(numerator);
        		strDenomi = Integer.toString(denominator);
        		answer = strNumer + "/" + strDenomi;
        		return answer;
        	} else {
        		String error = "Unexpected error.";
    			return error;
        	}
    }
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static int [] parseOperand (String operand) {
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
    
    public static int[] toImproperFrac(int[] operand){
		if(operand[0] < 0) {
			operand[1] = operand[2] * operand[0] - operand[1];
		} else {
			operand[1] = operand[2] * operand[0] + operand[1];
		}
		int[] improperFraction = {operand[1], operand[2]};
		return improperFraction;
    
    }
    public static int[] commonDenominator(int[] firstOperand, int[] secondOperand){
		int firstNumerator = firstOperand[0] * secondOperand[1];
		int secondNumerator = secondOperand[0] * firstOperand[1];
		int denominator = firstOperand[1] * secondOperand[1];
		int[] CommonFrac = {firstNumerator, secondNumerator, denominator};
		return CommonFrac;
	}
    
 
}








