package gameZone;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int computerGuess;
		int userChoice;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number.\n1-for rock\n2-for paper\n3- for scissors>>");
		userChoice = input.nextInt();
		
		if(computerGuess == 1) 
		{
			if(userChoice == 1) {
				result = "Tie";
			}
			else if(userChoice == 2) {
				result = "You win";
			}
			else 
				result = "You lose";	
		}
		if(computerGuess == 2)
		{
			if(userChoice == 2) {
				result = "Tie";
			}
			else if(userChoice == 3) {
				result = "You win";
			}
			else 
				result = "You lose";
		}
		if(computerGuess == 3) 
		{
			if(userChoice == 3) {
				result = "Tie";
			}
			else if(userChoice == 1) {
				result = "You win";
			}
			else 
				result = "You lose";
		}

	}

}
