package Excercises;

import java.util.Scanner;

public class CondoSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int condoChoice;
		
		String result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("You have 3 choices, 1 is park veiw, 2 is golf course veiw, and 3 is lake veiw");
		System.out.println("Pick which veiw you want. >> ");
		condoChoice = input.nextInt();
		
		if(condoChoice == 1) {
			result = "It costs $150,000";
		}
		else if(condoChoice ==2) {
			result = "It costs &170,000";
		}
		else if(condoChoice == 3) {
			result = "It costs $210,000";
		}
		else {
			result = " Costs nothing";
		}


	}

}
