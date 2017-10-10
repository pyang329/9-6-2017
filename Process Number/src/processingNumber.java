//Pauline Yang
// 10/4/2017

import java.util.Scanner;

public class processingNumber {
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("How many integers do you have?");
		// asks user for how many integers they want 
		int number = sc.nextInt();
		System.out.print("Whats your number?");
		//asks user for the integers they want
		int next = sc.nextInt();
		int evenMax = 1;
		int even = 0;
		int min = next;
		int max = next;
		if(next %2 == 0) {  
			even += next;
		}
		//sees if number is even so it can be added
	for(int i=1; i<number; i++) {
		System.out.print("Whats your number?");
			next = sc.nextInt();
			if(next < min) {
				min = next;
			}
			if(next > max ) {
				max = next;
			}
			
			if(next %2 == 0) {  
				even += next;
				
			}
			//determines which numbers are the min and max
			
	}
System.out.println(max);
			System.out.println(min);
			System.out.println(even);
}
}

