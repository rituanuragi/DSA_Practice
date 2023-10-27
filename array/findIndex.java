package array;

public class findIndex {
    public static int linearSearch(int arr[],int key) {
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==key) {
    			return i;
    		}
    	}
		return -1;
    	
    }
    public static void main(String[]args) {
    	int arr[]= {2,4,5,6,10};
    	int key=4;
    	int index=linearSearch(arr, key);
    	if(index==-1) {
    		System.out.println("not found");
    	}
    	System.out.println(index);
    	}
}
