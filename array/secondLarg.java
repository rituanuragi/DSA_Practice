package array;

public class secondLarg {
     static int secondLargest(int arr[],int n) {
    	 int largest=arr[0];
         int slargest=-1;
         for(int i=0;i<n;i++){
             if(arr[i]>largest){
                 slargest=largest;
                 largest=arr[i];
             }
             else if(arr[i]<largest && arr[i]>slargest){
                 slargest=arr[i];
             }
         }
       return slargest;
     }

     public static void main(String[] args) {
         int arr[] = { 1, 2, 3, 5, 7, 7, 3 };
         int n = arr.length;
         int secondLargest = secondLargest(arr, n);
         System.out.println("The second largest element is: " + secondLargest);
     }
 }