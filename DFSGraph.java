import java.util.ArrayList;

public class DFSGraph {
    public static ArrayList<Integer> DFS (ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[adj.size()];
        ArrayList<Integer> results = new ArrayList<>();
        dfsRecursive(adj, visited, 0, results); 
        return results;
    }

    public static void dfsRecursive(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int startNode, ArrayList<Integer> results){
        visited[startNode] = true;
        results.add(startNode);

        for(int i: adj.get(startNode)){
            if(!visited[i]){
                dfsRecursive(adj, visited, i, results);
            }
        }
    }
}
