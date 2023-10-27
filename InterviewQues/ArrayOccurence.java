package allTypeQuestion;

import java.util.Arrays;

public class ArrayOccurence {
   public static void main(String[] args) {
//	   with sorting
	int arr[]= {1, 2, 3, 3, 4, 1, 4, 5, 1, 2};
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
		int count=1;
	  for(int j=i+1;j<arr.length;j++) {
		  if(arr[i]==arr[j]) {
			  count++;
		  }
		  else{
			  break;
		  }
	  }
	  System.out.println(arr[i]+" "+count);
	  i+=count-1;
	}
   }
}
//Without sorting
//	   int arr[]= {1, 2, 3, 3, 4, 1, 4, 5, 1, 2};
//	   int visited=-1;
//	   int freq[]=new int[arr.length];
//	   for(int i=0;i<arr.length;i++) {
//			int count=1;
//       	for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) 
//					count++;
//			        freq[j]=visited;
//			}
//	   
//	        if(freq[i]!=visited) {
//	        	count++;
//	        }
//	        for(i = 0; i < freq.length; i++){  
//	            if(freq[i] != visited)  
//	                System.out.println("    " + arr[i] + "    |    " + freq[i]);  
//	   }
//			        
//   }
//   }
//}
//				