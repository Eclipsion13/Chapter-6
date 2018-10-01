package excercises;

import java.util.Scanner;

public class EvenEntryLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCh;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Input a number > ");
			numCh = input.nextInt();
			if(numCh % 2 == 0) {
				System.out.print("Good job! ");
			}
			else {
				System.out.print("Error! ");
			}
		} while(numCh != 999);

	}

}
