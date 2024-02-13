package AmazonInterviewQuestions;

public class FindMissingNumberInArray {

    //You are given an array of positive numbers from 1 to n, such that all numbers from 1 to n are
    //present except one numberx. You have to find x. The input array is not sorted.Look at the below array and hiv
    //int array = {3,7,1,2,8,4,5} n= 8,missing number= 6

    //n=

    public static void main(String[] args){

        int[] arr = {3,7,1,2,8,4,5};

        int n = arr.length +1;

        int sum = (n * (n+1))/2;

        for(int i = 0;i< arr.length;i++){
            sum = sum- arr[i];
        }

        System.out.println("missing number is " + sum);
    }

}
