// Creating Adjancenct List
ArrayList<ArrayList<Pair<Integer,Integer>>> adjList = new ArrayList<>();
int[] dist = new int[n+1]; 

for(int i=0;i<=n;i++){
    dist[i] = Integer.MAX_VALUE;
    adjList.add(new ArrayList());
}
 
for(int[] time : times)
    adjList.get(time[0]).add(new Pair<>(time[1], time[2]));

PriorityQueue<Pair<Integer,Integer>> queue = new PriorityQueue<>( 
    (a,b) -> a.getValue() -  b.getValue()
);

dist[k] = 0;
queue.add(new Pair<>(k,0));

// Traversing the graph
while(!queue.isEmpty()){

    int qSize = queue.size();

    for(int i=0;i<qSize;i++){
        Pair<Integer, Integer> curr = queue.remove();

        for(Pair<Integer, Integer> node : adjList.get(curr.getKey())){
            if(dist[node.getKey()] > dist[curr.getKey()] + node.getValue() ){
            dist[node.getKey()] =  dist[curr.getKey()] + node.getValue() ;
            queue.add(node);
            }
        }

    }
}
