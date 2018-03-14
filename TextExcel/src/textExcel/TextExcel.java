package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{
	public static void main(String[] args)
	{
		Spreadsheet sprdsht = new Spreadsheet();
		Scanner userInput = new Scanner (System.in);
		while(true) {
			System.out.println("enter command: ");
			String input = userInput.nextLine();
			if (input.equals("quit")) {
				break;
			}
			sprdsht.processCommand(input);
		}
	}
}
