package Excercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minuets;
		int txtMessages;
		int dataUsage;
		String result;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter monthly talk minuets used");
		minuets = input.nextInt();
		System.out.println("Please enter monthly text messages sent");
		txtMessages = input.nextInt();
		System.out.println("Please enter monthly data used");
		dataUsage = input.nextInt();
		
		if(minuets < 500 && dataUsage == 0 && txtMessages == 0) {
			result = "You need plan A at $49 per month";
		}
		else if(minuets < 500 && txtMessages >= 1) {
			result = "You need plan B at $55 per month";
		}
		else if()

	}

}
