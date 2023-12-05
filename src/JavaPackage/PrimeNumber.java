package JavaPackage;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=13,temp=0;
		for(int i=2;i<=n-1;i++)
		{
			if(n%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("Number is not Prime "+n);
		}
		else
		{
			System.out.println("number is prime "+n);
		}
		
	}

}
