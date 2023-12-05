package JavaPackage;

import java.util.Scanner;

public class StringProgram {
	public static void main(String[] args) {
		String s1="Navle";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String s=sc.nextLine();
		int a=s.length();
		    
		System.out.println("length of the string is "+a);
		System.out.println(s.charAt(3));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.concat(s1));
	}

}
