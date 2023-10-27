package allTypeQuestion;

public class Hcf {
  public static void main(String[] args) {
	int a=625;int b=125;
	int h = 0;
//	for(h=a>b?a:b;h>=1;h--)
//		if(a%h==0 && b%h==0)
//			break;
//	System.out.println(h);
//	for(i=1;i<=a || i<=b;i++) {
//		if(a%i==0 && b%i==0) {
//			h=i;
//		}
//		
//	}
//	System.out.println(h);
//}
	for(int i=1;i<=a;i++) {
		if(a%i==0 && b%i==0) 
			h=i;
		}
	
	System.out.println(h);
	
}
  
}
