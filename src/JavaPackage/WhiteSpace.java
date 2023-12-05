package JavaPackage;

public class WhiteSpace {
	public static void main(String[] args) {
		String s=" he l lo ";
		System.out.println("before remove white space "+s);
		String s1=s.replaceAll("\\s", "");
		System.out.println("after remove white space "+s1);
	}

}
