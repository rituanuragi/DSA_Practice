package array;

public class MaxSubarraySum {
	 public static void main(String[] args) {
		 int maxsum=Integer.MIN_VALUE;
		 int currsum=0;
		 int arr[]= {1,-2,6,-1,3};
		 for(int i=0;i<arr.length;i++) {
//			 int start=i;
			 for(int j=i;j<arr.length;j++) {
//				 int end=j;
				 currsum=0;
				 for(int k=i;k<j;k++) {
					 currsum+=arr[k];
				 }
				 System.out.println(currsum);
				 if(maxsum<currsum) {
					 maxsum=currsum;
				 }
			 }
		 }
				 
				 System.out.println("max sum:"+maxsum);
			 }
}
