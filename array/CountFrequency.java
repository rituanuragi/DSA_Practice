package array;
import java.util.*;
public class CountFrequency {
	 public static void main(String[] args) {
			int arr[]=  {10, 20, 20, 10, 10, 20, 5, 20};
			int n=arr.length;
//			int visited=-1;
//			int fr[]=new int[n];
//			for(int i=0;i<arr.length;i++) {
//				int count=1;
//				for(int j=i+1;j<arr.length;j++) {
//					if(arr[i]==arr[j]){
//						count++;
//						fr[j]=visited;
//					}
//				}
//				if(fr[i]!=visited) {
//					fr[i]=count;
////	}
//				
//	    }
	 
//	}
//			for(int i=0;i<fr.length;i++)
//				if(fr[i]!=visited) 
//						System.out.println("frequency of "+arr[i]+" "+fr[i]);
//						
//}
			Map<Integer,Integer> mp =new HashMap<>();
			for(int i=0;i<n;i++) {
				if(mp.containsKey(arr[i])) {
					mp.put(arr[i], mp.get(arr[i])+1);
				}
				else {
					mp.put(arr[i], 1);
				}
			}
			System.out.println(mp);
}
}