// Pauline Yang
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
       // String [] inputString = new String [input.length()];
        String [] separateIntoParts = input.split(" ");
        String firstOperand = separateIntoParts[0];
        String operator = separateIntoParts[1];
        String secondOperand = separateIntoParts[2];
        int[] parsedFirstOperand = parseOperand(firstOperand);
		int[] parsedSecondOperand = parseOperand(secondOperand);
		String whole = "whole:" + parsedSecondOperand[0];
		String numerator = " numerator:" + parsedSecondOperand[1];
		String denominator = " denominator:" + parsedSecondOperand[2];
        return whole + numerator + denominator;
    }
    

    // TODO: Fill in the space below with any helper methods that you think you will need
    public static int [] parseOperand (String operand) {
    		String[] wholeNumber = operand.split("_");
		String[] splitFraction = wholeNumber[1].split("/");
		String[] threeDigitsSort = {wholeNumber[0], splitFraction[0], splitFraction[1]};
		if (splitFraction[0] == "0") {
			splitFraction [1] = "1";
		}
		int[] intsInOrder = new int[3];
	    for (int i=0; i < threeDigitsSort.length; i++) {
	    		intsInOrder[i] = Integer.parseInt(threeDigitsSort[i]);
	    }
	    return intsInOrder;
    }
    
}



















