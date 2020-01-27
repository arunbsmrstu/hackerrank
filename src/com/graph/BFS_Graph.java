/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Arun
 */
public class BFS_Graph {

    int V;   // No. of vertices 
    LinkedList<Integer> adj[];

    public BFS_Graph(int V) {
        this.V = V;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList();
        }

    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void BFS(int s) {
        boolean [] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        
        visited[s]=true;
        queue.add(s);
        
        while(!queue.isEmpty()){
            s=queue.poll();
            System.out.print(s+" ");
            
            Iterator<Integer> i = adj[s].listIterator(); 
            
            while(i.hasNext()){
                int n=i.next();
                if(!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            
            }
            
        }
        System.out.println();

    }

 

    public static void main(String arg[]) {
        BFS_Graph g = new BFS_Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
       

        g.BFS(0);

    }

}
