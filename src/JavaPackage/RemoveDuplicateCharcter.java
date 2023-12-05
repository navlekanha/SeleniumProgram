package JavaPackage;

public class RemoveDuplicateCharcter {
 public static void main(String[] args) {
	String s="programming";
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
		int idx=s.indexOf(ch, i+1);
		if(idx==-1)
		{
			sb.append(ch);
		}
	}
	System.out.println("after remove duplicate char "+sb);
	 
}	

}
