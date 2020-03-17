package edu.schedule;


public class PrimeNumbers {

	public static void main(String[] args) {
		int range =10000;
		int index = 0;
		int[] primeNumber = new int[range];

		for (int i = 1; i <= range; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(int num =i; num>=1; num--)
	          {
	             if(i%num==0)
	             {
	            	 counter = counter + 1;
	             }
	          }
	          if (counter ==2)
	          {
	        	  primeNumber[index]=i;
	        	  index++;
	          }		
	       
	      }
		
		for (int k=0;k<10;k++) {
			System.out.println(primeNumber[k] + " ");
		}

	}

}
