package JavaPackage;

public class MinValueOfArray {
	public static void main(String[] args) {
		int a[]= {45,58,10,89,23};
		int min=a[0];//45
		for(int i=1;i<a.length;i++)//2<5
		{
			if(a[i]<min)//10<45
			{
				min=a[i];//10
			}
		}
		System.out.println("min element of arrays "+min);
	}

}
