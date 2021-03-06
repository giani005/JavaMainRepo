package assignments1;
import java.util.Scanner;


public class SumOfMultiples {
	public static void main (String args[]){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your number here: ");
		int number = input.nextInt();
		
		int sumOfMultiples3 = sumMultiples(number-1,3);
		int sumOfMultiples5 = sumMultiples(number-1,5);
		int sumOfMultiples15 = sumMultiples(number-1,15); // number-1 so we don't include the number given as input
		
		int totalSum = sumOfMultiples3 + sumOfMultiples5 - sumOfMultiples15;
		System.out.println("the sum of multiples of 3 and 5 lower than "+ number + " is " + totalSum);
		
	}
	
	public static int sumMultiples( int n, int k){
		return ((n/k * (n/k +1))/2)*k;
	}

}
