package stringPractice;

public class removeDuplicateString {
    public static void main(String[]args) {
    	String str="geeksforgeeks";
    	char[] arr=str.toCharArray();
    	StringBuilder sb=new StringBuilder();
    	for(int i=0;i<arr.length;i++) {
    		boolean repeated=false;
    		for(int j=i+1;j<arr.length;i++) {
    			if(arr[i]==arr[j]) {
    				repeated=true;
    				break;
    			}
    		}
    			if(!repeated) {
    				sb.append(arr[i]);
    			}
    		}
    		System.out.println(sb);
    	
    }
}
