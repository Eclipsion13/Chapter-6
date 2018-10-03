package excercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scoreIn = 0;
		int total = 0;
		int count = 0;
		int high = 0;
		int low = 100;
		int avg = 0;
		Scanner input = new Scanner(System.in);
		
		while (scoreIn != 999) {
			System.out.println("Input a test score. To leave, type 999 >>");
			scoreIn = input.nextInt();
			if (scoreIn > high && scoreIn <= 100) {
				high = scoreIn;
				count++;
				total = total + scoreIn;
			}
			else if (scoreIn < low && scoreIn >= 0) {
				low = scoreIn;
				count++;
				total = total + scoreIn;
			}
			else if (scoreIn > 100 || scoreIn < 0) {
				System.out.println("Out of range");
			}
			else {
				count++;
				total = total + scoreIn;
			}
			avg = total / count;
		}
		System.out.println("\n" + "Highest: " + high + "\nLowest: " + low + "\nCount: " + count + "\nAverage: " + avg);
	}

}
