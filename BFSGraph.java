import java.util.ArrayList;
import java.util.Arrays;
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
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(1,2)));
        adj.add(new ArrayList<>(Arrays.asList(0,2,3)));
        adj.add(new ArrayList<>(Arrays.asList(0,1,4)));
        adj.add(new ArrayList<>(Arrays.asList(1,4)));
        adj.add(new ArrayList<>(Arrays.asList(2,3)));

        ArrayList<Integer> ans = bfs(adj);
        for(int i: ans){
            System.out.println(i);
        }
    }
}
