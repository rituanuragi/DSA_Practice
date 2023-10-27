package array;
//max subarr sum using this alg
public class KadaneAlg {
	 public static void main(String[]args) {
	    int arr[]= {-2,-3,4,-1,-2,1,5,-3};
	    int maxsum=Integer.MIN_VALUE;
	    int currsum=0;
	    for(int i=0;i<arr.length;i++) {
	    		currsum+=arr[i];
	    		if(currsum<0) {
	    			currsum=0;
	    		
	    	}
	    		maxsum=Math.max(maxsum,currsum);
	    }
	        System.out.println(maxsum);
	    	
	    }
}
