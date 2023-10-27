package array;

public class MinMax {
  public static void main(String[] args) {
	int a[]= {3, 2, 1, 56, 10000, 167};
	int min=a[0];
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
		if(a[i]<min){
			min=a[i];
		}
	}
	System.out.println(min+" "+max);
}
}