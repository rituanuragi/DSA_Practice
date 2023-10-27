package allTypeQuestion;

public class ArmstrongNum {
	public static void main(String[] args) {
	
   int num=323;
   int temp=num;
   int sum=0;
   int rem;
   while(temp!=0) {
	   rem=temp%10;
	   sum=sum+rem*rem*rem;
	   temp=temp/10;
   }
   if(sum==num) 
   System.out.println("armstrong");
   
   else 
	   System.out.println("not armstrong");
   
   
}
}