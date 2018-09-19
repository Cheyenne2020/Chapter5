package Practice;
import java.util.Scanner;
public class DoorGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int doorChoice;
		int chestChoice;
		int bookChoice;
		String result;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door. \n1- for door One\n2- for door Two\n3- for door Three");
		doorChoice = input.nextInt();
		
		if(doorChoice == 1)
		{
			System.out.println("Door 1 good choice choose amoung the following Chests");
			System.out.println("1-For Chest One\n2- For Chest Two");
			chestChoice = input.nextInt();
			if(chestChoice == 1) 
			{
			result = "a pile of gold";
			}
			else if(chestChoice == 2) 
			{
				result = "Empty HAHAHA";
			}
			else 
			{
				result = "just kidding, I said 1 or 2!, now die!";
			}
				
		}
		else if(doorChoice == 2)
		{
			result = " a donkey!, what?!";
		}
		else if(doorChoice == 3)
		{
			result = " a long fast food line!"; 
		}
		else if(doorChoice == 3) {
			System.out.println("You enter a special room with 3 books on the table, there are no +"
					+ "words on the cover. Do you choose Book 1, Book 2, Book 3?");
			bookChoice = input.nextInt();
			if(bookChoice == 1) 
			{
			result = "You die ";
			}
			else if(bookChoice ==2) 
			{
				result = "you somewhat die";
			}
			else if(bookChoice ==3) 
			{
				result = "You live";
			}
			else {
				result = " You should have picked a book!"; 
			}
				
		}
		else
		{
			result = " nothing because that was not a choice!";
		}
		displayMessage(result);	

	}
	public static void displayMessage(String result)
	{
		System.out.println("You won" + result);
	}

}
