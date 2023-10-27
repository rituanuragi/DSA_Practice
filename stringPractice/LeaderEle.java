package stringPractice;

public class LeaderEle {
	public static void main(String[]args) {
    int arr[]= {15,18,5,3,6,2};
    int max=Integer.MIN_VALUE;
    for(int i=arr.length-1;i>=0;i--) {
    	if(arr[i]>max) {
    		max=arr[i];
    		System.out.println(arr[i]);
//    	}
//    }
//    for left leader
//     for(int i=0;i<arr.length-1;i++) {
//    	 if(arr[i]>max) {
//    		 max=arr[i];
//    		 System.out.println(arr[i]);
    	 }
}
	}
}