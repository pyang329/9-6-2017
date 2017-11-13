package fracCalc;

public class FracCalc {

    public static void main(String[] args) {
        // TODO: Read the input from the user and call produceAnswer with an equation
    	System.out.println(produceAnswer("1_2/3 + 4_5/6"));

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
        return secondOperand;
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
