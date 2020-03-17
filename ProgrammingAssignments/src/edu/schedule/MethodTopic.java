package edu.schedule;

public class MethodTopic {

	public static void main(String[] args) {

		int n;
		int i = 0;
		while(i<10) {
			n = (int) (Math.random()*52);
			if(i==0) {
				System.out.println("*****Computer*****");
			}
			else if(i==5) {
				System.out.println("\n\n*****Player*****");
			}
			printCard(n);
			i++;
		}
	
	}

	public static void printCard(int n) {
		switch(n%13) {
		case 0: 
			System.out.print("Ace of ");
			break;
		case 1: 
			System.out.print("Two of ");
			break;
		case 2: 
			System.out.print("Three of ");
			break;
		case 3: 
			System.out.print("Four of ");
			break;
		case 4: 
			System.out.print("Five of ");
			break;
		case 5: 
			System.out.print("Six of ");
			break;
		case 6: 
			System.out.print("Seven of ");
			break;
		case 7: 
			System.out.print("Eight of ");
			break;
		case 8: 
			System.out.print("Nine of ");
			break;
		case 9: 
			System.out.print("Ten of ");
			break;
		case 10: 
			System.out.print("Jack of ");
			break;
		case 11: 
			System.out.print("Queen of ");
			break;
		case 12: 
			System.out.print("King of");
			break;
		}
		switch(n/13) {
		case 0:
			System.out.println("Spades");
			break;
		case 1:
			System.out.println("Hearts");
			break;
		case 2:
			System.out.println("Clubs");
			break;
		case 3:
			System.out.println("Diamonds");
			break;
		}
	}

}
