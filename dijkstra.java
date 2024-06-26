// Creating Adjancenct List
ArrayList<ArrayList<Pair<Integer,Integer>>> adjList = new ArrayList<>();
int[] dist = new int[n+1]; 

for(int i=0;i<=n;i++){
    dist[i] = Integer.MAX_VALUE;
    adjList.add(new ArrayList());
}
 
for(int[] time : times)
    adjList.get(time[0]).add(new Pair<>(time[1], time[2]));

PriorityQueue<Integer> queue = new PriorityQueue<>( 
    (a,b) -> dist[a] -  dist[b]
);

dist[start] = 0;
queue.add(start);

// Traversing the graph
while(!queue.isEmpty()){

    int curr = queue.remove();

    for(Pair<Integer, Integer> node : adjList.get(curr)){
        if(dist[node.getKey()] > dist[curr] + node.getValue() ){
        dist[node.getKey()] =  dist[curr] + node.getValue() ;
        queue.add(node);
        }
    }
}
