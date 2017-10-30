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
		System.out.println(splitAtBread("applespineapplesbreadlettustomatobaconmayohambreadcheese"));
		System.out.println(splitAtBreadWithSpaces("apples pineapples bread lettus tomato bacon mayo ham bread cheese"));
		System.out.println(splitAtBread("apples pineapples bread lettus tomato bacon mayo ham bread cheese"));
	}

	//Your task Part 1:
	/*Write a method that take in a string like 
	* "applespineapplesbreadlettustomatobaconmayohambreadcheese"
	*describing a sandwich
	* use String.split to split up the sandwich by the word "bread" and 
	* return what's in the middle of the sandwich and ignores what's on the outside
	* What if it's a fancy sandwich with multiple pieces of bread?
	*/
	public static String splitAtBread(String sandwichInput){
		String finalOutput = "";
		String Ingredients = " " + sandwichInput + " ";
		String[] arrayBread = Ingredients.split("bread");
		if(arrayBread.length <= 2){
			System.out.println("Ingredients entered are not in a sandwich.");
		}else{
			for (int i = 1; i < arrayBread.length-1; i++){
				String middleOfSandwich = arrayBread[i];
				if(arrayBread[i].equals("")){
					System.out.print("");
				}else{
					finalOutput += middleOfSandwich;
				}
			}
		}
		return finalOutput;
	}

	//Your task Part 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich use String.split to split up the sandwich at the spaces, " ", and 
		* return what's in the middle of the sandwich and ignores what's on the outside
		* Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/	
	public static String splitAtBreadWithSpaces(String sandwichInput){
		String finalOutput = "";
		String ingredients = " " + sandwichInput + " ";
		String [] sandwichInnards = ingredients.split(" ");
		for (int i = 0; i < sandwichInnards.length; i++){
			ingredients += sandwichInnards[i];
		}
		String[] arrayBread = ingredients.split("bread");
		if(arrayBread.length <= 2){
			System.out.println("Ingredients entered are not in a sandwich.");
		}else {
			for (int i = 1; i < arrayBread.length-1; i++){
				String middleOfSandwich = arrayBread[i];
				if (arrayBread[i].equals("") && i == arrayBread.length - 2){
					System.out.println("Ingredients entered are not in a sandwich.");
				}else {
					finalOutput += middleOfSandwich;
				}
			}
		}
		return finalOutput;
		}
}	







