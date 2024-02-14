package AmazonInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class StringSegmentation {
    //recursion
    //memoization

    //If the recursion call for suffix return true, we return true,otherwise we try next prefix.
    //If we tried all prefixes and none of them resulted in a solution, we return false.
    //Time complexity : The time complexity will be O(2^n)
    //Auxiliary Space: The space complexity will be O(n) as we are using recursion and the recursive call
    //stack will take O(n) space.
  public static boolean canSegmentString(String s, Set<String> dictionary){
      for(int i = 1;i<= s.length();++i){
          String first = s.substring(0,i);
          if(dictionary.contains(first)){
              String second = s.substring(i);

              if(second == null || second.length() == 0 || dictionary.contains(second) || canSegmentString(second,dictionary)){
                  return  true;
              }
          }
      }
      return false;
  }

  public static void main(String[] args){
      Set<String> dictionary = new HashSet<String>();
      String s = new String();
      s= "hellonow";

      dictionary.add("hello");
      dictionary.add("hell");
      dictionary.add("on");
      dictionary.add("now");
      if(canSegmentString(s,dictionary)){
          System.out.println("String Can be Segmented");
      }else{
          System.out.println("String Can Not be Segmented");
      }
  }

}
