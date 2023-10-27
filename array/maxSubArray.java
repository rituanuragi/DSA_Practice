package array;

public class maxSubArray {
public static void main(String[]args) {
	int arr[]={-3, -4, 5, -1, 2, -4, 6, -1};
	int currsum=0;
	int maxsum=Integer.MIN_VALUE;
	for(int i=0;i<arr.length-1;i++) {
		currsum+=arr[i];
		if(currsum<0) {
			currsum=0;
		}
		maxsum=Math.max(currsum, maxsum);
		
	}
	System.out.println(maxsum);	
}
}
