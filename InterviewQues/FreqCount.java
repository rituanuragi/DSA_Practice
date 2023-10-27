package allTypeQuestion;

import java.util.HashMap;
import java.util.Map;

public class FreqCount {
     public static void main(String[]args) {
    	 int arr[] = {10,5,10,15,10,5,15};
    	 int n=arr.length;
    	 Map<Integer,Integer> map=new HashMap<>();
    	 for(int i=0;i<n;i++) {
    		 if(map.containsKey(arr[i])) {
    			 map.put(arr[i], map.get(arr[i])+1);
    		 }
    		 else {
    			 map.put(arr[i], 1);
    		 }
    	 }
    	 System.out.print(map);
     }
}
