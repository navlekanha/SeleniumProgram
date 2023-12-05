package JavaPackage;

public class MissingNumberOfArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,6};
		int n=a.length+1;
		
		int total_sum=n*(n+1)/2;
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
	System.out.println("missing number is "+(total_sum-sum));
		
	}

}
