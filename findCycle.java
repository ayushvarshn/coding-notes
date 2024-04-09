public boolean findCycle(int numNodes ,ArrayList<ArrayList<Integer>> adjList) {

  boolean[] visited = new boolean[numNodes];
  
  for(int i=0;i<numCourses;i++){
    boolean[] inCurrPath = new boolean[numNodes];
    
    if(visited[i])
      continue;
       
    if(findCycle(adjList, visited, inCurrPath, i))
      return true;
  }
  return false;     
}

public boolean findCycle(ArrayList<ArrayList<Integer>> adjList,boolean[] visited,boolean[] inCurrPath, int curr){
        
  if(inCurrPath[curr])
    return true;
  
  if(visited[curr])
    return false;
  
  visited[curr] = true;
  inCurrPath[curr] = true;
  
  for(int neigh : adjList.get(curr)){
    if(findCycle(adjList, visited, inCurrPath, neigh))
      return true;
  }
  
  inCurrPath[curr] = false;
  return false;
  
}

