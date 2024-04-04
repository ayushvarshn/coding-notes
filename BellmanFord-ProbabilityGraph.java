// To find the path with maximum probability using Bellman Ford
// Bellman ford is generally used in the problems where you don't know going further into an edge will be better or worse. (Weight can increase or decrease)
// For e.g. a-b-c or a-b. In case You don't know which edge is better, you have to use Bellman Ford.
// For e.g. negative weights where going an extra mile may deacrease total weight
// Interesting to note that max probability graph can also be solved by djikstra. Why?
// Because  a-b-c will always be less than a-b. So you are sure that the prob will deacrease. Thus Djikstra can be used.

double[] dist = new double[n];

dist[start_node] =1;

for(int i=0;i<n;i++){
    for(int j=0;j<edges.length;j++){

        int[] edge = edges[j];
        if(dist[edge[0]] < dist[edge[1]] * succProb[j])
            dist[edge[0]] = dist[edge[1]] * succProb[j];

        if(dist[edge[1]] < dist[edge[0]] * succProb[j])
            dist[edge[1]] = dist[edge[0]] * succProb[j];

    }
}
return dist[end_node];
