package com.co.jono.graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Implementation of the Adjacency Matrix more info at:
 * <a>http://en.wikipedia.org/wiki/Adjacency_matrix</a>
 * 
 * @author jorgemontes
 * @version 1.0
 */
public class GraphAdjacencyMatrix implements Graph<Vertex, Edge> {

	/**
	 * The matrix that represents a graph
	 */
	private AdjacencyMatrix matrix = null;

	/**
	 * default constructor
	 */
	public GraphAdjacencyMatrix() {
		super();
		this.matrix = new AdjacencyMatrix();
	}

	@Override
	public Edge addEdge(Vertex init, Vertex end)
			throws IllegalArgumentException, ClassCastException,
			NullPointerException {
		this.validateVertex(init);
		this.validateVertex(end);
		Boolean edgeExist = this.matrix.get(init.getId().hashCode(), end
				.getId().hashCode());
		if (edgeExist) {
			throw new IllegalArgumentException("Edge already exist!!");
		}
		this.matrix.put(init.getId().hashCode(), end.getId().hashCode());
		return new Edge(init, end);
	}

	@Override
	public Vertex addVertex(Vertex vertex) throws NullPointerException {
		if (vertex == null)
			throw new NullPointerException("Vertex is null!!");
		if (this.getVertices().contains(vertex))
			throw new IllegalArgumentException(
					"the vertex is allready in graph");
		List<Vertex> vertexList = new ArrayList<Vertex>();
		vertexList.add(vertex);
		this.matrix.putVertex(vertex);
		return vertex;
	}

	@Override
	public boolean adjacent(Vertex init, Vertex end)
			throws IllegalArgumentException, NullPointerException {
		this.validateVertex(init);
		this.validateVertex(end);
		return this.matrix.get(init.getId().hashCode(), end.getId().hashCode());
	}

	@Override
	public Set<Vertex> neighbors(Vertex vertex)
			throws IllegalArgumentException, NullPointerException {
		List<Vertex> vertices = (List<Vertex>) this.getVertices();
		Set<Vertex> result = new HashSet<Vertex>();
		for (Vertex vertexInGraph : vertices) {
			if (adjacent(vertex, vertexInGraph)) {
				result.add(vertexInGraph);
			}
		}
		return result;
	}

	@Override
	public boolean removeVertex(Vertex vertex) throws IllegalArgumentException,
			NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeEdge(Edge edge) throws IllegalArgumentException,
			NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Vertex> getVertices() {
		return this.matrix.getVertexInGraph();
	}

	/**
	 * Validation often repeated through the code
	 * 
	 * @param vertex
	 *            - the vertex to validate
	 * @throws IllegalArgumentException
	 *             - if the vertex are not in the graph
	 * @throws NullPointerException
	 *             - if the vertex is null
	 */
	private void validateVertex(Vertex vertex) throws IllegalArgumentException,
			NullPointerException {
		if (vertex == null)
			throw new NullPointerException("Vertex is null!!");
		if (!this.getVertices().contains(vertex))
			throw new IllegalArgumentException("the vertex is not in the graph");
	}

}
