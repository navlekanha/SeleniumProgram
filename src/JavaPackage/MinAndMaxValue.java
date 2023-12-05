package JavaPackage;

import java.util.Arrays;

public class MinAndMaxValue {
	public static void main(String[] args) {
		int a[]= {12,45,48,50,52};
		int n=a.length;
		int min=a[0];
		int max=a[n-1];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min of element is "+min);
		System.out.println("max element is "+max);
	}

}
