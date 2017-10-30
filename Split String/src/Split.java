//Pauilne Yang
//Period 2

import java.util.Arrays;

public class Split {
	
	public static void main(String[] args) {
		// Your task Part 0
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
//			it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples".split("really")
//			it will split at the word "really" and return an array of ["I "," like "," red apples!"]
		//play around with String.split! 
		//What happens if you "I reallyreally likeapples".split("really") ?
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		
		
		System.out.println(Arrays.toString("I really like red apples".split("really")));
		System.out.println(splitSandwichAtBread("applespineapplesbreadlettustomatobaconmayohambreadcheese"));

	}
	
	public static String splitSandwichAtBread (String sandwich) {
		String finalInput = "";
		String ingredients = " " + sandwich + " ";
		String [] sandwichInnards = sandwich.split(" ");
		for (int i=0; i<sandwichInnards.length; i++) {
			ingredients += sandwichInnards[i];
		}
		String [] arraySandwichHolder = ingredients.split("bread");
		if(arraySandwichHolder.length <= 2) {
			System.out.println("Ingredients are not in a sandwich.");
		}else{
			for (int i=1; i<arraySandwichHolder.length-1; i++) {
				if(arraySandwichHolder[i].equals("")  &&  i == arraySandwichHolder.length -2) {
					System.out.println("Ingredients are not in a sandwich");
				}else {
					finalInput += arraySandwichHolder[i];
				}
			}
			
		}
		return finalInput;
	}
}

//Your task Part 1:
/*Write a method that take in a string like 
* "applespineapplesbreadlettustomatobaconmayohambreadcheese"
*describing a sandwich
* use String.split to split up the sandwich by the word "bread" and 
* return what's in the middle of the sandwich and ignores what's on the outside
* What if it's a fancy sandwich with multiple pieces of bread?
*/

