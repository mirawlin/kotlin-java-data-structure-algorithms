package au.com.mir.java.datastructures.graphs;

import java.util.ArrayList;
import java.util.Hashtable;

public class Graph {
    Integer numberOfNodes;
    Hashtable<Integer, ArrayList<Integer>> adjacentList;

    public Graph() {
        numberOfNodes = 0;
        adjacentList = new Hashtable<>();
    }

    public void addVertex(Integer node) {
        adjacentList.put(node, new ArrayList<>());
        numberOfNodes++;
    }

    public void addEdge(Integer node1, Integer node2) {
        adjacentList.get(node1).add(node2);
        adjacentList.get(node2).add(node1);
    }

    public void showConnections() {
        Object[] keys = adjacentList.keySet().toArray();
        for (Object key : keys) {
            System.out.println(key + " ---> " + adjacentList.get(Integer.parseInt(key.toString())));
        }
    }

    public static void main(String[] args) {
        var graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addEdge(3,1);
        graph.addEdge(3,4);
        graph.addEdge(4,2);
        graph.addEdge(4,5);
        graph.addEdge(1,2);
        graph.addEdge(1,0);
        graph.addEdge(0,2);
        graph.addEdge(6,5);

        graph.showConnections();

        System.out.println(graph);
    }

    @Override
    public String toString() {
        return "Graph{" +
                "numberOfNodes=" + numberOfNodes +
                ", adjacentList=" + adjacentList +
                '}';
    }
}
