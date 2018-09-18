package Practice;

import java.util.Scanner;

public class AgeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usersAge;
		String result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age to be insulted");
		usersAge = input.nextInt();
		
		if(usersAge <= 12)
		{
			result = "You are a child! Go away!"; 
		}
		else if(usersAge >= 13 && usersAge <= 18)
		{
			result = " You are a snotty teen";
		}
		else if(usersAge >= 19 && usersAge <= 25)
		{
			result = "Get a job!";
		}
		else if(usersAge >= 26 && usersAge <= 30)
		{
			result = "Get a life!";
		}
		else if(usersAge >= 31 && usersAge <= 40)
		{
			result = "Get better things";
		}
		else if (usersAge >= 41 && usersAge <= 50)
		{
			result = "Your getting old";
		}
		else if(usersAge >= 51 && usersAge <= 60)
		{
			result = "Retire already";
		}
		else if(usersAge >=61)
		{
			result = "Die already";
		}

	}
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}

}
