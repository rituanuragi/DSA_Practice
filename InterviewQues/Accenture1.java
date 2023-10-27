package allTypeQuestion;

import java.util.HashMap;
import java.util.Map;

public class Accenture1 {
  public static void main(String[] args) {
//	 String str= "Alice is girl and Bob is boy";
//	  Map<String, Integer>map = new HashMap<>();
//     String words[]=str.split(" ");
//     for(String word:words) {
//    	 if(map.containsKey(word)) {
//    		 map.put(word, map.get(word)+1);
//    		 }
//    	 else {
//    		 map.put(word, 1);
//    	 }
//    	 }
//     System.out.println(map);
//     
//}
//}
//    String str="aabbbcccddder";
//    HashMap<Character , Integer> hmap=new HashMap<>();
//    for(int i=0;i<str.length();i++) {
//    	if(hmap.containsKey(str.charAt(i))) {
//    	int count=hmap.get(str.charAt(i));
//    	hmap.put(str.charAt(i), ++count);
//    }
//    else {
//    	hmap.put(str.charAt(i), 1);
//    }
//  }
//    System.out.println(hmap);
//}
//}
	  String str="aabbbcccddder";
	  HashMap<Character ,Integer> hmap=new HashMap<>();
	  for(int i=0;i<str.length();i++) {
		  if(hmap.containsKey(str.charAt(i))) {
			  int count=hmap.get(str.charAt(i));
			  hmap.put(str.charAt(i), ++count);
		  }
		  else {
			  hmap.put(str.charAt(i), 1);
		  }
	  }
		  System.out.println(hmap);
	  }
  
}
	  