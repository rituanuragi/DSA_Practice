package stringPractice;

public class FindDuplicate {
public static void main(String[] args) {
	String str="great responsibility";
	char[] dup=str.toCharArray();
	for(int i=0;i<str.length();i++) {
		int count=1;
		for(int j=i+1;j<str.length();j++) {
			if( dup[i]==dup[j] && dup[i]!=' ') {
				count++;
				dup[j]='0';
			}
		}
		if(count>1 && dup[i]!='0')
	       System.out.println(dup[i]);
		}
}
}