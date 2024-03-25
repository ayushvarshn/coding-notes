// BFS Algorithm
public void BFS(int startNode, List<List<Integer>> adjList){
    
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visited = new boolean[n];
    
    visited[startNode] = true;
    queue.add(startNode);
    
    while (!queue.isEmpty()) {
        int q = queue.size()
        for(int i=0;i<q;i++){
            int curr = queue.poll();
            for (int neigh : adjList.get(curr)) {
                if (!visited[neigh]) {
                    visited[neigh] = true;
                    queue.add(neigh);
                }
            }
        }
    }
}
