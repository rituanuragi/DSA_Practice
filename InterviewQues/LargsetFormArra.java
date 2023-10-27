package allTypeQuestion;
import java.util.Scanner;
public class LargsetFormArra {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s=0;
    int[] arr = { 3, 30, 34,9 };
  
    for(int i=0;i<arr.length;i++) {
     
    	for(int j=i+1;j<arr.length;j++) {
    
    		String ij=String.valueOf(arr[i])+String.valueOf(arr[j]);
    		String ji=String.valueOf(arr[j])+String.valueOf(arr[i]);
    		
    	
    	if(Integer.parseInt(ji)>Integer.parseInt(ij)) {
    		s=arr[i];
    		arr[i]=arr[j];
    		arr[j]=s;    	
    }
    }
	}
	for(int i=0;i<arr.length;i++) {
		
		System.out.print(arr[i]);
}
}
}