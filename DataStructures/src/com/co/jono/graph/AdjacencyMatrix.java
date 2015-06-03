package com.co.jono.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Implementation of a Adjacency Matrix as a Map of booleans
 * 
 * @author jorgemontes
 * @version 1.0
 */
public class AdjacencyMatrix {

	/**
	 * attributes
	 */
	private Map<VertexPoint, Boolean> values = null;
	private Set<Vertex> vertexInGraph = null;

	/**
	 * default constructor
	 */
	public AdjacencyMatrix() {
		super();
		this.values = new HashMap<VertexPoint, Boolean>();
		this.vertexInGraph = new HashSet<Vertex>();
	}

	/**
	 * @return the vertexInGraph
	 */
	public Set<Vertex> getVertexInGraph() {
		return vertexInGraph;
	}

	/**
	 * @param vertexInGraph
	 *            the vertexInGraph to set
	 */
	public void setVertexInGraph(Set<Vertex> vertexInGraph) {
		this.vertexInGraph = vertexInGraph;
	}

	/**
	 * Gets the boolean on the map
	 * 
	 * @param x
	 * @param y
	 * @return <code>true</code> if there is an object, <code>false</code>,
	 *         otherwise
	 */
	public boolean get(int x, int y) {
		Boolean result = this.values.get(new VertexPoint(x, y));
		return result == null ? false : true;
	}

	/**
	 * puts a boolean on the map
	 * 
	 * @param x
	 * @param y
	 */
	public void put(int x, int y) {
		this.values.put(new VertexPoint(x, y), Boolean.TRUE);
	}

	/**
	 * Puts a vertex in the vertex list
	 * 
	 * @param vertex
	 */
	public void putVertex(Vertex vertex) {
		this.vertexInGraph.add(vertex);
	}

}
