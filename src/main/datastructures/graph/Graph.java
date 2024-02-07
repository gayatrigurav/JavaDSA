package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    private HashMap<String, ArrayList<String>> adList = new HashMap<>();

    public void printGraph(){
        System.out.println(adList);
    }

    public boolean addVertex(String vertex){
        if(adList.get(vertex) == null){
            adList.put(vertex,new ArrayList<String>());
            return true;
        }
        return  false;
    }

    public boolean addEdge(String vertex1, String vertex2){
        if(adList.get(vertex1)!= null && adList.get(vertex2)!= null){
            adList.get(vertex1).add(vertex2);
            adList.get(vertex2).add(vertex1);
            return true;
        }
       return false;
    }

    public boolean removeEdge(String vertex1, String vertex2){
        if(adList.get(vertex1)!= null && adList.get(vertex2)!= null){
            adList.get(vertex1).remove(vertex2);
            adList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(adList.get(vertex) == null) return false;
        for(String otherVertex: adList.get(vertex)){
            adList.get(otherVertex).remove(vertex);
        }
        adList.remove(vertex);
        return true;
    }



}
