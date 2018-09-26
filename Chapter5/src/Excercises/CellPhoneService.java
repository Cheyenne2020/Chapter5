package Excercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minutes;
		int txtMessages;
		int dataUsage;
		String result = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter monthly talk minuets used");
		minutes = input.nextInt();
		System.out.println("Please enter monthly text messages sent");
		txtMessages = input.nextInt();
		System.out.println("Please enter monthly data used");
		dataUsage = input.nextInt();
		
		if(minutes > 500 && dataUsage == 0 && txtMessages == 0) {
			result = "You need plan A at $49 per month";
		}
		else if(minutes < 500 && txtMessages > 0 && dataUsage == 0) {
			result = "You need plan B at $55 per month";
		}
		else if(minutes > 500 && dataUsage == 0 ) {
			if(txtMessages < 100) {
				result = "You need plan C at $61 per month";
			} 
			else 
				result = "You need plan D at $70 per month";
		}
		else if(dataUsage > 0 && dataUsage < 2) {
			result = "You need plan E at $79 per month";
		}
		else if( dataUsage >= 2) {
			result = "You need plan F at $87 per month";
		}
		System.out.println(result);
	}

}
