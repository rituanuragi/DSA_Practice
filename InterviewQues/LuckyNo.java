package allTypeQuestion;

public class LuckyNo {
	public static void main(String[]args) {
		int n=34526262;
		int luckycnt=0;
		while(n!=0) {
			int r=n%10;
			if(r==2 || r==6) {
				luckycnt++;
			}
			n=n/10;
		}
		
		System.out.println(luckycnt);
	}
}
