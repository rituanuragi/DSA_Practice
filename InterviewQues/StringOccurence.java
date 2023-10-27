package allTypeQuestion;

public class StringOccurence {
  public static void main(String[] args) {
	String str="geekforgeeks";
	char ch='g';
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)==ch)
			count++;
	}
	System.out.println(count);
	
}
}
