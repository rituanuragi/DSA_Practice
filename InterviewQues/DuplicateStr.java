package allTypeQuestion;

public class DuplicateStr {
  public static void main(String[] args) {
	   String string1 = "Great responsibility";  
       int count;  
       char str[]=string1.toCharArray();
       for(int i=0;i<str.length;i++) {
    	    count=1;
    	   for(int j=i+1;j<str.length;j++) {
    		   if(str[i]==str[j] && str[i]!=' ') {
    			   count++;
    			   str[j]='0';
    		   }
       }
    	   if(count>1 && str[i]!='0' ) 
    		   System.out.println(str[i]);
    	   
       
}
}
}
