import java.util.Iterator;
import java.util.List;

import javax.swing.JApplet;

import org.jgrapht.Graph;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.alg.spanning.KruskalMinimumSpanningTree;
import org.jgrapht.alg.spanning.PrimMinimumSpanningTree;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;
import org.jgrapht.graph.builder.GraphTypeBuilder;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.util.SupplierUtil;

/**
 * 
 * j.l. lehman
 * 
 * fall 2021 (updated fall 2025)
 * 
 * 
 * Demonstrates use of JGraphT packages
 * www.jgrapht.org
 *
 * Download libraries and unzip, will see large list of .jar files in /lib folder
 * Place App.java in this folder and run from the command line. 
 *
 *  javac -cp .:jgrapht-core-1.5.2.jar:jheaps-0.14.jar App.java
 *  java -cp .:jgrapht-core-1.5.2.jar:jheaps-0.14.jar App
 *
 *  note: can also use Maven to manage libraries
 */
public class App  {

	public static void main(String[] args) {

		SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> graph = new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>(
				DefaultWeightedEdge.class);

		//define and add vertices
		String vertices[] = { "A", "B", "C", "D", "E", "F" };
		
		//Ticket to Ride
		//data extracted from JSON file at https://github.com/craiig/ticket-to-ride
		//String vertices[] = { "Atlanta", "Boston", "Calgary", "Charleston", "Chicago", "Dallas", "Denver", "Duluth", "El Paso", "Helena", "Houston", "Kansas City", "Las Vegas", "Little Rock", "Los Angeles", "Miami", "Montreal", "Nashville", "New Orleans", "New York City", "Oklahoma City", "Omaha", "Phoenix", "Pittsburgh", "Portland", "Raleigh", "Saint Louis", "Salt Lake City", "San Francisco", "Santa Fe", "Sault Ste Marie", "Seattle", "Toronto", "Vancouver", "Washington", "Winnipeg" };

		for (int t = 0; t < vertices.length; t++) {
			graph.addVertex( vertices[t] );
		}
		//replaces  graph.addVertex("A");
		

		//define and add edges
		String edgeStart[] = { "A", "A", "B", "B", "C", "D", "D", "E", "E", "E" };
		String  edgeStop[] = { "B", "E", "C", "D", "F", "C", "F", "B", "D", "F" };
		int     edgeCost[] = {  8,   5,   5,    2,   1,   2,   3,   2,   3,   7 };
		
		//Ticket to Ride
		//String edgeStart[] = {"Vancouver", "Vancouver", "Seattle", "Portland", "San Francisco", "Los Angeles", "San Francisco", "Portland", "Seattle", "Seattle", "Calgary", "Salt Lake City", "Las Vegas", "Los Angeles", "Los Angeles", "Phoenix", "Phoenix", "Phoenix", "Salt Lake City", "Helena", "Denver", "Santa Fe", "Calgary", "Winnipeg", "Helena", "Helena", "Winnipeg", "Duluth", "Denver", "Omaha", "Denver", "Denver", "Santa Fe", "El Paso", "El Paso", "El Paso", "Houston", "Dallas", "Oklahoma City", "Winnipeg", "Sault Ste Marie", "Duluth", "Duluth", "Omaha", "Kansas City", "Oklahoma City", "Dallas", "Houston", "New Orleans", "Nashville", "Little Rock", "Nashville", "Chicago", "Saint Louis", "Nashville", "Chicago", "Chicago", "Sault Ste Marie", "Sault Ste Marie", "Montreal", "Toronto", "New Orleans", "New Orleans", "Nashville", "Miami", "Miami", "Atlanta", "Atlanta", "Nashville", "Charleston", "Raleigh", "Raleigh", "Pittsburgh", "Washington", "Pittsburgh", "New York City", "New York City", "Montreal" };
		//String edgeStop[] = { "Calgary",  "Seattle",  "Portland",  "San Francisco",  "Los Angeles",  "Las Vegas",  "Salt Lake City",  "Salt Lake City",  "Helena",  "Calgary",  "Helena",  "Helena",  "Salt Lake City",  "Phoenix",  "El Paso",  "El Paso",  "Santa Fe",  "Denver",  "Denver",  "Denver",  "Santa Fe",  "El Paso",  "Winnipeg",  "Helena",  "Duluth",  "Omaha",  "Duluth",  "Omaha",  "Omaha",  "Kansas City",  "Kansas City",  "Oklahoma City",  "Oklahoma City",  "Oklahoma City",  "Dallas",  "Houston",  "Dallas",  "Oklahoma City",  "Kansas City",  "Sault Ste Marie",  "Duluth",  "Toronto",  "Chicago",  "Chicago",  "Saint Louis",  "Little Rock",  "Little Rock",  "New Orleans",  "Little Rock",  "Little Rock",  "Saint Louis",  "Saint Louis",  "Saint Louis",  "Pittsburgh",  "Pittsburgh",  "Pittsburgh",  "Toronto",  "Toronto",  "Montreal",  "Toronto",  "Pittsburgh",  "Miami",  "Atlanta",  "Atlanta",  "Atlanta",  "Charleston",  "Charleston",  "Raleigh",  "Raleigh",  "Raleigh",  "Washington",  "Pittsburgh",  "Washington",  "New York City",  "New York City",  "Boston",  "Montreal",  "Boston"};
		//int edgeCost[] = { 3, 1, 1, 5, 3, 2, 5, 6, 6, 4, 4, 3, 3, 3, 6, 3, 3, 5, 3, 4, 2, 2, 6, 4, 6, 5, 4, 2, 4, 1, 4, 4, 3, 5, 4, 6, 1, 2, 2, 6, 3, 6, 3, 4, 2, 2, 2, 2, 3, 3, 2, 2, 2, 5, 4, 3, 4, 2, 5, 3, 2, 6, 4, 1, 5, 4, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 3, 2 };
		
		DefaultWeightedEdge dwe[] = new DefaultWeightedEdge[edgeStart.length];
		
		for (int t = 0; t < edgeStart.length; t++) {
			dwe[t]= graph.addEdge( edgeStart[t], edgeStop[t]);
			graph.setEdgeWeight(dwe[t], edgeCost[t]);
		}
		
		// replaces
		//DefaultWeightedEdge e1 = graph.addEdge("A", "B");
		//graph.setEdgeWeight(e1, 8);
		// ... for each edge
		
		
		
		// display nodes (ie. vertices)
		System.out.println("Vertices ");
		for (String v : graph.vertexSet()) {
			System.out.println("vertex: " + v);
		}
		System.out.println();

		// display connections (ie. edges)
		System.out.println("Edges ");
		for (DefaultWeightedEdge e : graph.edgeSet()) {
			System.out.println("edge: " + e + " " + graph.getEdgeWeight(e));
		}
		System.out.println();

		
		
		System.out.println("Breadth-First Traversal");
		Iterator<String> iterator = new BreadthFirstIterator<>(graph);
		while (iterator.hasNext()) {
			String temp = iterator.next();
			System.out.print(temp + " ");
		}
		System.out.println();
		System.out.println();

		System.out.println("Depth-First Traversal");
		iterator = new DepthFirstIterator<>(graph);
		while (iterator.hasNext()) {
			String temp = iterator.next();
			System.out.print(temp + " ");
		}
		System.out.println();
		System.out.println();

		
		
		
		// Prim's Algorithm
		System.out.println("Minimal Spanning Tree - Prim");
		double total = 0;
		for (DefaultWeightedEdge e : new PrimMinimumSpanningTree<>(graph).getSpanningTree()) {
			System.out.println("edge: " + e + " " + graph.getEdgeWeight(e));
			total = total + graph.getEdgeWeight(e);
		}
		System.out.println("   Total Cost:  " + total);
		System.out.println();

		// Kruskal's Algorithm
		System.out.println("Minimal Spanning Tree - Kruskal");
		total = 0;
		for (DefaultWeightedEdge e : new KruskalMinimumSpanningTree<>(graph).getSpanningTree()) {
			System.out.println("edge: " + e + " " + graph.getEdgeWeight(e));
			total = total + graph.getEdgeWeight(e);
		}
		System.out.println("   Total Cost:  " + total);
		System.out.println();

		
		// Dijkstra's Algorithm
		System.out.println("Dijkstra's Algorithm");
		
		String destinations[] = { "B", "C", "D", "E", "F" };

		for (int t = 0; t < destinations.length; t++) {

			total = 0;
			List<DefaultWeightedEdge> path = DijkstraShortestPath.findPathBetween(graph, "A", destinations[t]).getEdgeList();
			for (int i = 0; i < path.size(); i++) {
				DefaultWeightedEdge f = path.get(i);
				System.out.println((i + 1) + " " + graph.getEdgeSource(f) + " -> " + graph.getEdgeTarget(f) + "  (" + graph.getEdgeWeight(f) + ")");
				total = total + graph.getEdgeWeight(f);
			}
			System.out.println("   Total Cost: " + total);
			System.out.println();

		}
					    
			    
			    
	}// main

}// class
