package allTypeQuestion;
import java.util.Scanner;
public class Practice {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	
	System.out.println("enter first limit");
	int n1=sc.nextInt();
	
	System.out.println("enter second limit");
	int n2=sc.nextInt();
	int sum=0;
	for(int i=n1;i<n2;i++) {
		if((i%3==0) && (i%5==0)) 
			sum=sum+i;
		}
			
		
	System.out.println(sum);
	}
}
