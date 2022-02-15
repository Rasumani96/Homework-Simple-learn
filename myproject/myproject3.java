package myproject;

import java.util.Scanner;

public class myproject3 {

	public static void main(String[] args) {
		int i,number;
		System.out.println("Enter a number");
		Scanner input = new Scanner(System.in);
		i=input.nextInt();
		input.close();
		number = i % 2 ;
		
		if(number==0)
			{
		System.out.println("The input no is even");
			}
		else{
			System.out.println("The input no is odd");
		}
		

	}

}
