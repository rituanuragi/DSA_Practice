package array;

import java.util.HashMap;

public class RemoveAllDupli {
	public static void main(String[] args) {
		int a[]= {2,4,2,6,8,4,2,10,6};
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			}
			else {
				map.put(a[i], 1);
			}
		}
		System.out.println(map);
}
}
