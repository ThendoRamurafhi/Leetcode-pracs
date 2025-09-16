import java.util.ArrayList;
//import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFSGraph {
    public static ArrayList<Integer> bfs (ArrayList<ArrayList<Integer>> adj){
        int vertices = adj.size();

        int startNode = 0;

        ArrayList<Integer> results = new ArrayList<>();

        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[startNode] = true;
        queue.add(startNode);

        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            results.add(currentNode);

            for(int i: adj.get(currentNode)){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

        return results; 
    }
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u); // undirected graph, remove this if directed
    }

    public static void main(String[] args){
        int vertices = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++){
            adj.add(new ArrayList<>());
        }

        int[][] edges = {{1,2}, {0,2,3}, {0,1,4}, {1,4}, {2,3}};
        for(int[] e: edges){
            addEdge(adj, e[0], e[1]);
        }

        ArrayList<Integer> ans = bfs(adj);
        for(int i : ans){
            System.out.println(i);
        }
    }
}
