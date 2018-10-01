package excercises;

import java.util.Scanner;

public class EvenEntryLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCh = 1;
		Scanner input = new Scanner(System.in);
		
		while (numCh != 999) {
			System.out.println("Input a number > ");
			numCh = input.nextInt();
			if(numCh % 2 == 0) {
				System.out.print("Good job! ");
			}
			else {
				System.out.print("Error! ");
			}
		}
		
	}

}
