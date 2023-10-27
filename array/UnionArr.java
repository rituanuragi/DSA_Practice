package array;

import java.util.HashSet;
import java.util.Set;

public class UnionArr {
public static void main(String[] args) {
	int arr1[]= {1,2,3};
	int arr2[]= {1,2,3,4,5,6};
	int n=arr1.length;
	int m=arr2.length;
	Set<Integer>s=new HashSet<>();
	for(int i=0;i<n;i++) {
		s.add(arr1[i]);
	}
	for(int j=0;j<m;j++) {
		s.add(arr2[j]);
	}
	System.out.println(arr2);
	System.out.println(s.toString());
}
}
