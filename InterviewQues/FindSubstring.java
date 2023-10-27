package allTypeQuestion;

public class FindSubstring {
    public static String subString(String str,int s,int e) {
    	String subStr="";
    	for(int i=s;i<e;i++){
    		subStr+=str.charAt(i);
    	}
    	return subStr;
    }
    public static void main(String[] args) {
		String str="helloworld";
		System.out.println(subString(str, 4, 6));
	}
}
