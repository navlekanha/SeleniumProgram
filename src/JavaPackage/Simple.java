package JavaPackage;

public class Simple {
	public static void main(String[] args) {
		
		String s="ram";
		int len=s.length();
		String temp="";
		for(int i=len-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
		}
		System.out.println("Reverse string is "+temp);
	}

}
