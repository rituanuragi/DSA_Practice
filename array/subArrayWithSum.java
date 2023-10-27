package array;

public class subArrayWithSum {
public static void main(String[]args) {
	int arr[]= {1,2,3,7,5};
	int s=10;
	   
      for (int i = 0; i < arr.length; i++) {
        int sum = 0;
        
        for (int j = i; j < arr.length; j++) {
            sum += arr[j];
            
            if (sum == s) {
                for (int k = i; k <= j; k++) { // Change '<' to '<='
                    System.out.print(k + " "); // Print indices instead of elements
                }
                System.out.println();
            }
        }
    }
}
}