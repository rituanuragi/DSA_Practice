package allTypeQuestion;

public class ReverseNum {
   public static void main(String[] args) {
	int num=645;
	int rem;
	int sum=0;
	while(num!=0) {
		rem=num%10;
		sum=sum*10+rem;
		num=num/10;
	}
	System.out.println(sum);
}
}
