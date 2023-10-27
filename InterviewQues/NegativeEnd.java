package allTypeQuestion;

import java.util.ArrayList;

public class NegativeEnd {
	public static void main(String[] args) {
	int x=0;
	int arr[]={1, -1, 3, 2, -7, -5, 11, 6 };
//	
	ArrayList<Integer> pos=new ArrayList<>();
	ArrayList<Integer> neg=new ArrayList<>();
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>=0) {
			pos.add(arr[i]);
		}
		if(arr[i]<0) {
			neg.add(arr[i]);
		}
	}
	pos.addAll(neg);
	for(int i=0;i<arr.length;i++) {
	   arr[i]=pos.get(i);
	    System.out.print(arr[i]+" ");
	    
	}
	}
}
  
	