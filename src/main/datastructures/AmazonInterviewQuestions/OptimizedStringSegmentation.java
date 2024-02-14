package AmazonInterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class OptimizedStringSegmentation {
    //Optimized Dynamic Programming:
    //In this approach, apart from the dp table, we also maintain all the indexes which have matched earlier.
    // Then we will check the substrings from those indexes to the current index.
    // If anyone of that matches then we can divide the string up to that index.
    //In this program, we are using some extra space. However, its time complexity is O(n*n) if n>s or O(n*s) if s>n
    // where s is the length of the largest string in the dictionary and n is the length of the given string.

    public static boolean wordBreak(String s, List<String> dictionary){
        // create a dp table to store results of subproblems
        // value of dp[i] will be true if string s can be segmented
        // into dictionary words from 0 to i.

        boolean[] dp = new boolean[s.length() +1];

        //dp[0] is true because an empty string can always can be segmented into dictionary words 0 to i
        dp[0] = true;

        for(int i = 0;i<= s.length();i++){
            for(int j =0;j < i ;j++){
                if(dp[j] && dictionary.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args){
        String[] dictionary = {"mobile","samsung","sam","sung","man","mango"};
        List<String>dict = new ArrayList<>();
        for(String s: dictionary){
            dict.add(s);
        }

        if(wordBreak("ilikesamsung",dict)){
            System.out.println("Yes in dictionary");
        }else{
            System.out.println("Not in dictionary");
        }

        if(wordBreak("samsung",dict)){
            System.out.println("Yes in dictionary");
        }else{
            System.out.println("Not in dictionary");
        }

        if(wordBreak("samsungandmango",dict)){
            System.out.println("Yes in dictionary");
        }else{
            System.out.println("Not in dictionary");
        }


    }
}
