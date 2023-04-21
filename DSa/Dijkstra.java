public class Dijkstra {
    
    public void shortesrPath(int graph[][],boolean select[],int start){
        
        int dist[] = new int[graph[start].length];
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[start] = 0;
        for (int i = 0; i < dist.length-1; i++) {
            
            int u = minDistance(select, dist);
            if(u == -1){
                break;
            }
            select[u] =true;
            for (int j = 0; j < dist.length; j++) {
                if(!select[j] && graph[u][j] !=0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][j] < dist[j] ){
                    dist[j] = dist[u] + graph[u][j];
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i]);
        }
       
    }

    public int minDistance(boolean select[],int dist[]){
        int min = Integer.MAX_VALUE;
        int min_Index = -1;
        for (int i = 0; i < dist.length; i++) {
            if(!select[i] && min > dist[i]){
                min = dist[i];
                min_Index = i;
            }
        }
        return min_Index;

    }
    public static void main(String[] args) {
        int graph[][] = {{0,1,1,0},
                        {0,0,0,2},
                        {0,0,0,1},
                        {0,0,0,0}};
        Dijkstra obj =  new Dijkstra();
        boolean select[]= new boolean[4]; 
        obj.shortesrPath(graph, select, 2);
    }
}
