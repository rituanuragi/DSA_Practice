package allTypeQuestion;
import java.util.Scanner;
public class PrimeNumGivRange {
   public static void main(String[] args) {
	int x,i;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first no");
	int n1=sc.nextInt();
	System.out.println("enter second  no");
	int n2=sc.nextInt();
	for(x=n1;x<=n2;x++) {
	for(i=2;i<=x;i++) 
		if(x%i==0) 
			break;
		
		if(i==x) 
			System.out.println(x);
		}
   }
}
