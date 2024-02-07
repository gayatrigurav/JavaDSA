package graph;

public class Main {

    public static void main(String[] args){

        Graph myGraph = new Graph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");

        myGraph.addEdge("B","C");
        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");

        myGraph.removeVertex("A");

        myGraph.printGraph();
    }
}
