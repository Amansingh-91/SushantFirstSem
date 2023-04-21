import java.util.LinkedList;
import java.util.Queue;

class GraphDemo{
    int Vertex ;
    LinkedList<Integer> adj[];
    GraphDemo(int Vertex){
        this.Vertex =  Vertex;
        adj = new LinkedList[Vertex];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new LinkedList<Integer>();
        }
        
    }
    public void addEdge(int u, int v){
        adj[u].add(v);
        adj[v].add(u);
    }
    public void BFS(int start){
        boolean visited[] = new boolean[Vertex];
        for (int i = 0; i < visited.length; i++) {
            visited[i] = false;
        }
        Queue<Integer> q1= new LinkedList<>();
        q1.add(start);
        visited[start] = true;
        while (!q1.isEmpty()) {
            int del = q1.poll();
            System.out.print(del+" ");

            for (Integer ele : adj[del]) {
                if(!visited[ele]){
                    q1.add(ele);
                    visited[ele]= true;
                }


            }

        } 

    }
    public void DFS(int start,boolean v[]){
        v[start] = true;
        System.out.print(start+" ");
        for (int i : adj[start]) {
            if(!v[i]){
                DFS(i, v);
            }
        }

    }
    public static void main(String[] args) {
        GraphDemo obj =  new GraphDemo(5);
        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(2, 3);
        obj.addEdge(2,4);
        obj.addEdge(1, 3);
        obj.addEdge(3,4);
        obj.BFS(4);
        System.out.println();
        boolean v[] = new boolean[obj.Vertex];
        obj.DFS(0, v);
        System.out.println();
    }

}