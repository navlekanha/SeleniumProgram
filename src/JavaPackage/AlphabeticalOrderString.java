package JavaPackage;

import java.util.Arrays;

public class AlphabeticalOrderString {
	public static void main(String[] args) {
		String s="java";
		char a[]=s.toCharArray();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}

}
