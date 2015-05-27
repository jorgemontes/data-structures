package com.co.jono.graph;

/**
 * Class that represents a pair of vertices that are adjacent in a graph
 * 
 * @author jorgemontes
 * @version 1.0
 */
public class Edge {

	/**
	 * Properties that represents the vertex
	 */
	private Vertex initialVertex;
	private Vertex finalVertex;

	/**
	 * @param initialVertex
	 * @param finalVertex
	 */
	public Edge(Vertex initialVertex, Vertex finalVertex) {
		super();
		this.initialVertex = initialVertex;
		this.finalVertex = finalVertex;
	}

	/**
	 * @return the initialVertex
	 */
	public Vertex getInitialVertex() {
		return initialVertex;
	}

	/**
	 * @param initialVertex
	 *            the initialVertex to set
	 */
	public void setInitialVertex(Vertex initialVertex) {
		this.initialVertex = initialVertex;
	}

	/**
	 * @return the finalVertex
	 */
	public Vertex getFinalVertex() {
		return finalVertex;
	}

	/**
	 * @param finalVertex
	 *            the finalVertex to set
	 */
	public void setFinalVertex(Vertex finalVertex) {
		this.finalVertex = finalVertex;
	}

}
