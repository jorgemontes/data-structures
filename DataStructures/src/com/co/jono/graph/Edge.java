package com.co.jono.graph;

public class Edge {
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
