package allTypeQuestion;

public class PalindromeNum {
   public static void main(String[] args) {
	int n=121;
//	int temp=n;
//	int rem;
//	int sum=0;
//	while(temp!=0) {
//		rem=temp%10;
//		sum=sum*10+rem;
//		temp=temp/10;
//		
//	}
//	if(sum==n) {
//		System.out.println("palindrome");
//	}
//	else {
//		System.out.println(" not palindrome");
//	}
	int temp=n;
	int sum=0;
	while(temp!=0) {
		int rem=temp%10;
		sum=sum*10+rem;
		temp=temp/10;
	}
	if(sum==n) {
		System.out.println("palindrome");
	}
	else {
		System.out.println(" not palindrome");
	}
}
}
