package array;
import java.util.*;
public class LargestNo {
    public static int findLarget(int arr[]) {
    	int largest=Integer.MIN_VALUE;//-infinity
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>largest) {
    			largest=arr[i];
    		}
    	}
		return largest;
    }
    public static void main(String[]args) {
    	int arr[]= {3,1,8,3,100,367};
    	System.out.println(findLarget(arr));
    }
}
