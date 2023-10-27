package allTypeQuestion;

public class CheckPrime {
    public static void main(String[] args) {
	int n=8;
	int i;
	if(n==0 || n==1)
		System.out.println("not prime");
	for(i=2;i<=n;i++) 
		if(n%i==0) 
			break;
		
		if(i==n) 
			System.out.println("prime");
		
		else 
			System.out.println("not prime");
			
		
	}
}
    

