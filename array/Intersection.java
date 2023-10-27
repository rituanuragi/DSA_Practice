package array;

public class Intersection {
	public static void main(String[] args) {
		int arr1[]= {2,4,5,7,9};
		int arr2[]= {5,7};
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			}
		}
		
	}
}
