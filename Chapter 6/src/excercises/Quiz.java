package excercises;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countIn=0;
		int countCo=0;
		int user = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (user != 2) {
		System.out.println("A structure that allows repeated execution of a block of statements is a ___.\n"
				+ "1 A: Cycle\n2 B: Loop\n3 C: Ring\n4 D: Band");
		user = input.nextInt();
		if (user == 2) {
			countCo++;
			System.out.println("Correct!");
		}
		else {
			countIn++;
			System.out.println("Incorrect.");
		}
		}
		user = 0;
		while (user != 2) {
		System.out.println("A loop that never ends is a(n) ___ loop.\n"
				+ "1 A: Iterative\n2 B: Infinite\n3 C: Structured\n4 D: Illegal");
		user = input.nextInt();
		if (user == 2) {
			countCo++;
			System.out.println("Correct!");
		}
		else {
			countIn++;
			System.out.println("Incorrect.");
		}
		}
		while (user != 4) {
		System.out.println("To construct a loop that works correctly, you should initialize a loop control ___.\n"
				+ "1 A: Variable\n2 B: Constant\n3 C: Structure\n4 D: Condition");
		user = input.nextInt();
		if (user == 4) {
			countCo++;
			System.out.println("Correct!");
		}
		else {
			countIn++;
			System.out.println("Incorrect.");
		}
		}
		System.out.println("Correct choices: " + countCo + "\nIncorrect choices: " + countIn);
	}

}
