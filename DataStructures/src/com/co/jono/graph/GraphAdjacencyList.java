package com.co.jono.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GraphAdjacencyList implements Graph<Vertex, Edge> {

	private Set<List<Vertex>> adjacencyList = null;

	public GraphAdjacencyList() {
		adjacencyList = new HashSet<List<Vertex>>();
	}

	@Override
	public Edge addEdge(Vertex init, Vertex end)
			throws IllegalArgumentException, ClassCastException,
			NullPointerException {
		this.validateVertex(init);
		this.validateVertex(end);
		List<Vertex> vertexList = this.getVertexList(init);
		for (Vertex vertexInList : vertexList) {
			if (vertexInList.equals(end))
				throw new IllegalArgumentException("Edge already exist!!");
		}
		vertexList.add(end);
		return new Edge(init, end);
	}

	@Override
	public Vertex addVertex(Vertex vertex) throws NullPointerException {
		// validate
		if (vertex == null)
			throw new NullPointerException("Vertex is null!!");
		if (this.getVertices().contains(vertex))
			throw new IllegalArgumentException(
					"the vertex is allready in graph");
		List<Vertex> vertexList = new ArrayList<Vertex>();
		vertexList.add(vertex);
		this.adjacencyList.add(vertexList);
		return vertex;
	}

	private void validateVertex(Vertex vertex) throws IllegalArgumentException,
			NullPointerException {
		if (vertex == null)
			throw new NullPointerException("Vertex is null!!");
		if (!this.getVertices().contains(vertex))
			throw new IllegalArgumentException("the vertex is not in the graph");
	}

	@Override
	public boolean adjacent(Vertex init, Vertex end)
			throws IllegalArgumentException, NullPointerException {
		this.validateVertex(init);
		this.validateVertex(end);
		List<Vertex> vertexList = this.getVertexList(init);
		for (Vertex vertexInList : vertexList) {
			if (vertexInList.equals(end))
				return true;
		}
		return false;
	}

	@Override
	public Set<Vertex> neighbors(Vertex vertex)
			throws IllegalArgumentException, NullPointerException {
		this.validateVertex(vertex);
		List<Vertex> vertexList = this.getVertexList(vertex);
		Set<Vertex> result = new HashSet<Vertex>();
		for (Vertex vertexInList : vertexList) {
			result.add(vertexInList);
		}
		return result;
	}

	@Override
	public boolean removeVertex(Vertex vertex) throws IllegalArgumentException,
			NullPointerException {
		this.validateVertex(vertex);
		List<Vertex> vertexList = this.getVertexList(vertex);
		this.adjacencyList.remove(vertexList);
		return true;
	}

	@Override
	public boolean removeEdge(Edge edge) throws IllegalArgumentException,
			NullPointerException {
		this.validateVertex(edge.getInitialVertex());
		this.validateVertex(edge.getFinalVertex());
		List<Vertex> vertexList = this.getVertexList(edge.getInitialVertex());
		Vertex vertexToRemove = null;
		for (Vertex vertexInList : vertexList) {
			if (vertexInList.equals(edge.getFinalVertex())) {
				vertexToRemove = vertexInList;
			}
		}
		if (vertexToRemove == null)
			throw new IllegalArgumentException("The edge does not exists!!");
		vertexList.remove(vertexToRemove);
		return true;
	}

	@Override
	public Set<Vertex> getVertices() {
		Set<Vertex> result = new HashSet<Vertex>();
		for (List<Vertex> adjacencyRow : this.adjacencyList) {
			result.add(adjacencyRow.get(0));
		}
		return result;
	}

	public List<Vertex> getVertexList(Vertex vertex) {
		for (List<Vertex> adjacencyRow : this.adjacencyList) {
			if (adjacencyRow.get(0).equals(vertex)) {
				return adjacencyRow;
			}
		}
		return null;
	}
}
