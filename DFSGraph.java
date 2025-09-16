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

    // To add an edge in an undirected graph
    public static void addEdge(ArrayList<ArrayList<Integer> > adj, int u, int t){
        adj.get(u).add(t);
        adj.get(t).add(u);
    }

    public static void main(String[] args){
        int vertices = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for(int i = 0; i < vertices; i++){
            adj.add(new ArrayList<>());
        }

        // Add edges
        int[][] edges= {{1, 2},{1, 0},{2, 0},{2, 3},{2, 4}}; 
        for(int[] e : edges){
            addEdge(adj, e[0], e[1]);
        }

        // Perform DFS starting from vertex 0
        ArrayList<Integer> res = DFS(adj);

        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
    }
}
