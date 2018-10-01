package excercises;

import java.util.Scanner;

public class CountByAnything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userChoice;
		int user;
		int user10;
		Scanner input = new Scanner(System.in);
		System.out.println("Please pick a number > ");
		userChoice = input.nextInt();
		user = userChoice * 100;
		user10 = userChoice * 10;
		for(int i = 0; i <= user; i = i + userChoice) {
			System.out.print(" " + i);
			if(i % user10 == 0) {
				System.out.println();
			}
			else {
				
			}
		}

	}

}
