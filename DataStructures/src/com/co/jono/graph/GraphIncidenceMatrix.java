package com.co.jono.graph;

import java.util.Collection;
import java.util.Set;

public class GraphIncidenceMatrix implements Graph<Vertex, Edge> {

	@Override
	public Edge addEdge(Vertex init, Vertex end)
			throws IllegalArgumentException, ClassCastException,
			NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vertex addVertex(Vertex vertex) throws NullPointerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean adjacent(Vertex init, Vertex end)
			throws IllegalArgumentException, NullPointerException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Vertex> neighbors(Vertex vertex)
			throws IllegalArgumentException, NullPointerException {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}


}
