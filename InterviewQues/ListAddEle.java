package allTypeQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListAddEle {
  public static void main(String[] args) {
//	ArrayList <Integer> list=new ArrayList<>();
//	list.add(5);
//	list.add(6);
//	System.out.println(list);
//	  List<Integer> list= Arrays.asList(1,2,3,4,5);
////	
//	 Collections.reverse(list);
//	  System.out.println(list);
//	
//	  Add element at position
	  List<Integer> list = new ArrayList<Integer>(5);
	  
      // use add() method to initially
      // add elements in the list
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(1, 30);
      System.out.println(list);
      // prints all the elements available in list
      for (Integer num : list) {
          System.out.print(num + " ");
      }
  }
}


