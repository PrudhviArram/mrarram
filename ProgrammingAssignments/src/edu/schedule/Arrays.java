package edu.schedule;

public class Arrays {

	public static void main(String[] args) {
		
		int[] primeArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int [] randomArray = setUpArray();
		
		searchArray(primeArray, randomArray);
	}

	private static void searchArray(int[] primeArray, int[] randomArray) {
		int primeCount =0;
		int low = 0 ;
		int high = 0;
		int highFrequency = 0;
		int highFreqNumber =0;
		// array to store frequency of prime number
		int[][] frequency = new int[primeArray.length][2];
		
		//two dimensional array initializing each prime number from primeArray frequencies to 0
		for(int i=0,j=0;i<primeArray.length;i++) {
			
			frequency[i][j] = primeArray[i];
			
		}

		//finding count, least, highest and frequencies of the prime numbers in randomArray 
		for(int i=0;i<primeArray.length;i++) {
			for(int j=0;j<randomArray.length;j++) {
				if(primeArray[i]==randomArray[j]) {
					
					if(primeCount == 0) {
						low = randomArray[j];
						high = randomArray[j];
					}
					if(low > randomArray[j]) {
						low = randomArray[j];
					}
					if(high < randomArray[j]) {
						high = randomArray[j];
					}			
					
					for(int x=0,y=0;x<frequency.length;x++) {
						
						if(frequency[x][y]==primeArray[i]) {
							frequency[x][y+1] = frequency[x][y+1] +1;
						}
						
					}
					
					primeCount++;
				}
				
			}
		}
		for(int x=0,y=0;x<frequency.length;x++) {
			
			if(frequency[x][y+1]> highFrequency) {
				highFrequency = frequency[x][y+1];
				highFreqNumber = frequency[x][y];
			}
			if(frequency[x][y+1] == highFrequency && frequency[x][y] < highFreqNumber) {
				highFreqNumber = frequency[x][y];
			}
			
		}
		
		float perentage =(float) primeCount/randomArray.length;
		System.out.println("The number of occurrences of prime numbers in the array : "+ primeCount);
		System.out.println("The percentage of prime numbers as compared to the total size of the array : "+ perentage*100);
		System.out.println("The smallest prime number found in the array : "+ low);
		System.out.println("The largest prime number found in the array : "+ high);
		System.out.println("The lowest prime number in the array that occurs the most often is " + highFreqNumber +" : " + highFrequency);
		
		
	}
	
	
    //method generating random array
	private static int[] setUpArray() {
		int[] myList = new int[10000];
		for (int i = 0; i < myList.length; i++) {
			  myList[i] = (int) (Math.random() * 1000);
			}
		
		// sorting array
		java.util.Arrays.sort(myList);
		return myList;
	}

}
