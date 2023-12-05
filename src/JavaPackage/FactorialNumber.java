package JavaPackage;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=n;i++)//4<=3 condition is false
		{
			fact=fact*i; //2*3=6
		}
		System.out.println("factorial is "+fact);
		
	}

}
