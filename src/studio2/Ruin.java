package studio2;

import java.util.Scanner;
import java.io.InputStream;

public class Ruin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("In put the starting amount: ");
		double startAmount = in.nextDouble();
		
		System.out.println("In put the chance of winning: ");
		double winChance = in.nextDouble();
		
		System.out.println("In put the win limit: ");
		double winLimit = in.nextDouble();
		
		double currentMoney = startAmount;
		
		System.out.println("In put the total simulations: ");
		int totalSimulations = in.nextInt();
		
		boolean win = true;
		
		double ruins = 0;
				
		int i = 0;
		
		for (int j = 0; j < totalSimulations; j++) {
			
			while (i < 100) {
				
				double luck = Math.random();
				
				if (luck < winChance) {
					currentMoney = currentMoney + 1;
				}
				else {
					currentMoney = currentMoney - 1;
					win = false;
				}
				win = true;
				i +=1;
			}
			System.out.println("Day: " + j);
			System.out.println("Plays: " + i);
			if (currentMoney <= 0) {
				System.out.println("Ruin");
				ruins = ruins + 1;
			}
			else if (currentMoney >= winLimit) {
				System.out.println("Success");
			}
			currentMoney = startAmount;
			i=0;
		}
		
		System.out.println("Ruin rate: " + ruins/totalSimulations);
		
	}
}
