package array;

public class ReverseArr {
	public static void main(String[] args) {
		int a[]= {3, 2, 1, 56, 10000, 167};
		int n=a.length;
//		for(int i=0;i<n;i++) {
//			System.out.print(a[i]+" ");
//		}
//		for(int i=n-1;i>=0;i--) {
//			System.out.print(a[i]+" ");
//		}
		int start=0;
		int end=a.length-1;
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<n;i++)
		System.out.println(a[i]);
}
}
