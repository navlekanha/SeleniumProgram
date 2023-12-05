package JavaPackage;

import java.util.Scanner;

public class LargestAndSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any two numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("numbers A is largest "+a);
		}
		else
		{
			System.out.println("numbers B is largest "+b);
		}
		}
	}


