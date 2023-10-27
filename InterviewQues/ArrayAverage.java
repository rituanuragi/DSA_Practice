package allTypeQuestion;

public class ArrayAverage {
   public static void main(String[] args) {
	   int sum=0;
	   float avg = 0;
	   int arr[]= {1,3,2,4,5};
	   for(int i=0;i<arr.length;i++) {
	    	sum=sum+arr[i];
	    	avg=sum/arr.length;
	   }
	    	
	         System.out.println(avg);
	}
	}
