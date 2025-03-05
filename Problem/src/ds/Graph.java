package ds;

class Graph {

	 
	  class Edge {
	    int src, dst; //source and destination
	  }

	  // number of vertices and edges
	  int vertices, edges;

	  Edge[] edge; // store all the edges in an array

	  Graph(int vertices, int edges) {
	    this.vertices = vertices;
	    this.edges = edges;

	    // initialize the edge array
	    edge = new Edge[edges];
	    for(int i = 0; i < edges; i++) {

	      // each element of the edge array
	      // is an object of Edge type
	      edge[i] = new Edge();
	    }
	  }

	  public static void main(String[] args) {

	    // create an object of Graph class
	    int noVertices = 5;
	    int noEdges = 8;
	    Graph g = new Graph(noVertices, noEdges);

	    // create graph
	    g.edge[0].src = 1;   // edge 1-2
	    g.edge[0].dst = 2;

	    g.edge[1].src = 1;   // edge 1-3
	    g.edge[1].dst = 3;

	    g.edge[2].src = 1;   // edge 1-4
	    g.edge[2].dst = 4;

	    g.edge[3].src = 2;   // edge 2-4
	    g.edge[3].dst = 4;

	    g.edge[4].src = 2;   // edge 2-5
	    g.edge[4].dst = 5;

	    g.edge[5].src = 3;   // edge 3-4
	    g.edge[5].dst = 4;

	    g.edge[6].src = 3;   // edge 3-5
	    g.edge[6].dst = 5;

	    g.edge[7].src = 4;   // edge 4-5
	    g.edge[7].dst = 5;

	    // print graph
	    for(int i = 0; i < noEdges; i++) {
	      System.out.println(g.edge[i].src + " - " + g.edge[i].dst);
	    }

	  }
	}

