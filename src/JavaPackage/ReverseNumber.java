package JavaPackage;

public class ReverseNumber {
public static void main(String[] args) {
	int n=1236;
	int rem,rev=0;
	while(n!=0)
	{
		rem=n%10; //2
		rev=rev*10+rem; //63*10+2=632
		n=n/10; //12
	}
	System.out.println("revers number is "+rev);
	
}
}
