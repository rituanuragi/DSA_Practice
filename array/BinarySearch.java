package array;

public class BinarySearch {
   public static void main(String[]args) {
	   int arr[]= {2,4,6,8,10,12,14,16};
	   int key=14;
	   int n=arr.length;
	   int start=0;
	   int end=n-1;
	   while(start<=end) {
		   int mid=(start+end)/2;
		   if(arr[mid]==key) {
			   System.out.println(mid);
		   }
		   if(arr[mid]<key) {//right
			   start=mid+1;
		   }
		   else {
			   end=mid-1;
		   }
	   }
   }
}
