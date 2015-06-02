package com.co.jono.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AdjacencyMatrix {

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

	public boolean get(int x, int y) {
		Boolean result = this.values.get(new VertexPoint(x, y));
		return result == null ? false : true;
	}

	public void put(int x, int y) {
		this.values.put(new VertexPoint(x, y), Boolean.TRUE);
	}

	public void putVertex(Vertex vertex) {
		this.vertexInGraph.add(vertex);
	}

	public int size() {
		return values.size();
	}

}
