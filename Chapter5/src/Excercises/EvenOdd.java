package Excercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		String result;	
		Scanner input = new Scanner(System.in);
		System.out.println("Eneter an integer >>>");
		x = input.nextInt();
			
		if (0 == x%2) {
			result = "even";
		}
		else {
			result = "odd";
		displayMessage(result);
		}
		
	}
	public static void displayMessage(String result) {
		System.out.print(result);
		
		
	}

}
