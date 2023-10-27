package array;
import java.util.ArrayList;
public class FrequencyUsingArrayList {
  public static void main(String[] args) {
	int arr[]= {1,2,3,2,4,5,2,8,1,5,8};

	int n=arr.length;
	int fr[]=new int[n];
	for(int i:arr) {
		fr[i]++;
	}
	ArrayList<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<fr.length;i++) {
		if(fr[i]>1) {
			list.add(i);
		}
	}
	System.out.println(list);
	}
}