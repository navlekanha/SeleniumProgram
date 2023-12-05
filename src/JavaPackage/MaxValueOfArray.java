package JavaPackage;

public class MaxValueOfArray {
 public static void main(String[] args) {
	 int a[]= {10,78,45,96,100};
	 int max=a[0];
	 for(int i=1;i<a.length;i++)
	 {
		 if(a[i]>max)
		 {
			 max=a[i];
		 }
	 }
	 System.out.println("max element of array is "+max);
}
}
