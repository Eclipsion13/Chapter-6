package practice;

import javax.swing.JOptionPane;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String playerS;
		int player;
		int computer;
		String winner;
		int count = 0;
		int choice;
		

		for(int i = 0; i < 5; i++) {
		computer = 1 + (int)(Math.random() * 3);
		
		playerS = JOptionPane.showInputDialog(null, "Rock... (1) Paper... (2) Scissors... (3)");
		player = Integer.parseInt(playerS);
			
			if (player == computer) {
				winner = "Tie!";
			}
			else if (computer == 1) {
				if (player == 2) {
					winner = "You win! Paper beats rock!";
					count ++;
				}
				else  if (player == 3) {
					winner = "I win! Rock beats scissors!";
				}
				else {
					winner = "That isn't an option!";
				}
			}
			else if (computer == 2) {
				if (player == 1) {
					winner = "I win! Paper beats rock!!";
				}
				else if (player == 3) {
					winner = "You win! Scissors beat paper!";
					count ++;
				}
				else {
					winner = "That isn't an option!";
				}
			}
			else {
				if (player == 1) {
					winner = "You win! Rock beats scissors!";
					count ++;
				}
				else  if (player == 2) {
					winner = "I win! Scissors beat paper!";
				}
				else {
					winner = "That isn't an option!";
				}
			}
			JOptionPane.showMessageDialog(null, "SHOOT!\n" + winner + "\nYou won " + count + " times.");
			choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Would you like to play again? 999 to quit"));
		}

	}

}