package array;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
public static void main(String[] args) {

	int arr[]= {5,2,6,8,6,7,5,2,8};
	
//	LinkedHashSet<Integer> set=new LinkedHashSet<>();
//	for(int i=0;i<arr.length;i++) {
//		set.add(arr[i]);
//		
//	}
//	System.out.println(set);
	Arrays.sort(arr);
	int n=arr.length;
	
	int temp[]=new int[n];
     int j=0;
	for(int i=0;i<n-1;i++) {
		if(arr[i]!=arr[i+1]) {
			temp[j++]=arr[i];
			
		}
		}
	temp[j++]=arr[n-1];
	for(int k=0;k<j;k++) {
		System.out.println(temp[k]);
	}
}
}
