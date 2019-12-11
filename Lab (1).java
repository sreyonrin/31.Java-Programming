package midterm;

import java.util.Arrays;
import java.util.Random;

public class Lab {

	public static void main(String[] args) {
		// Initiate the array of integer with 15 elements
		int[] numbers = new int[15];
		// Assign random number between -5 to 5
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Random().nextInt(11) - 5;
		}	
		// Output the array as string in the console
		System.out.println(Arrays.toString(numbers));

		// a. find the largest number in this array
		var hightNumber = numbers[0];
		for(int i = 0; i < numbers.length; i++) {
			if(hightNumber < numbers[i]) {
				hightNumber = numbers[i];
			}
		}
		System.out.println(hightNumber);
		// b. find the smallest number in this array
		var lowest = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if(lowest > numbers[i]) {
				lowest = numbers[i];
			}
		}
		System.out.println(lowest);
		
		// c.Display the result of this Boolean assertion :
		// “all numbers greater than zero”
		
		boolean foundNegative = false;//we assume no negative numbers
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]<0) {
				foundNegative = true;
				break;
			}
		}
		
		if(foundNegative==false) {
			System.out.println("All numbers are greater than zero");
		}

	

		// d.Display the result of this Boolean assertion :
		// “at least one number greater than zero”

		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>0) {
				System.out.println("at least one number greater than zero");
				break;
			}
			
		}

		// e.Display how many numbers greater
		// than zero or even appears in this arrays
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]>0 || numbers[i]%2==0) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
