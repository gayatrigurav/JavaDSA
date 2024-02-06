package commonArrayQuestion;

import java.util.HashMap;

public class Main {


//using nested for loop bigO becomes o(n2)
    public static boolean itemInCommon(int[] array1,int[] array2){
        for(int i: array1){
            for(int j: array2){
                if(i == j) return true;
            }
        }
        return false;
    }

   //using hashmap big o is o(n)
    public static boolean itemInCommonUsingHashMap(int[] array1,int[] array2){
        HashMap<Integer,Boolean> myHashMap = new HashMap<>();

        for(int i:array1){
            myHashMap.put(i,true);
        }

        for(int j: array2){
            if(myHashMap.get(j) != null) return true;
        }

        return false;
    }

    public static void main(String[] args){
        int[] array1 = {1,2,3};
        int[] array2 = {4,5,3};

        System.out.println(itemInCommon(array1,array2));
        System.out.println(itemInCommonUsingHashMap(array1,array2));
    }
}
