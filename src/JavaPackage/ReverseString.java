package JavaPackage;

public class ReverseString {
	public static void main(String args[])
	{
		String s="Hello";
		System.out.println("normal String is "+s);
		String temp="";
		int len=s.length();
		for(int i=len-1; i>=0; i--)
		{
			temp=temp+s.charAt(i);
		}
		System.out.println("reverse string is "+temp);
			
		
	}

}
