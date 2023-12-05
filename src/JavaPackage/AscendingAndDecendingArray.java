package JavaPackage;

import java.util.Arrays;

public class AscendingAndDecendingArray {
	public static void main(String args[])
	{
		int a[]= {45,28,6,89,22};
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
