package AmazonInterviewQuestions;

public class ReverseWordsInaSentense {

    //Reverse the order of words in a given sentence(an array of characters)
    //"Hello World"-> "World Hello"
    public static String reverseWords(String s) {

        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args){
       ReverseWordsInaSentense reverseWordsInaSentense = new ReverseWordsInaSentense();
        String s = "Hello World";
        System.out.println(reverseWordsInaSentense.reverseWords(s));
    }
}
