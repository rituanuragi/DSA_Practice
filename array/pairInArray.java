package array;
import java.util.*;
public class pairInArray {
	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
//		for(int i=0;i<arr.length;i++) {
//			int curr=arr[i];//2,4,6,8,10
//			for(int j=i+1;j<arr.length;j++) {
//				System.out.print("("+ curr +","+arr[j] +") ");
//			}
//			System.out.println();
//		}
//	}

//total no of pairs
		int n=arr.length;
		int countpair=n*(n-1)/2;
		System.out.println(countpair);
	}
}