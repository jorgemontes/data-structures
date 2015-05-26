package com.co.jono.graph;

import java.util.Set;

/**
 * This interface of a Graph defines the basic operations needed to use the
 * data-structure
 * 
 * @author jorgemontes
 * @version 1.0
 */
public interface Graph<V, E> {

	/**
	 * adjacent(G, x, y): tests whether there is an edge from node x to node y.
	 * neighbors(G, x): lists all nodes y such that there is an edge from x to
	 * y. add(G, x, y): adds to G the edge from x to y, if it is not there.
	 * delete(G, x, y): removes the edge from x to y, if it is there.
	 * get_node_value(G, x): returns the value associated with the node x.
	 * set_node_value(G, x, a): sets the value associated with the node x to a.
	 * 
	 * Structures that associate values to the edges usually also provide:
	 * 
	 * get_edge_value(G, x, y): returns the value associated to the edge (x,y).
	 * set_edge_value(G, x, y, v): sets the value associated to the edge (x,y)
	 * to v.
	 */

	/**
	 * Adds an edge to the Graph
	 * 
	 * @param init
	 *            - Initial Vertex
	 * @param end
	 *            - Final Vertex
	 * @return <code>E</code> - the added Edge
	 * @throws IllegalArgumentException
	 *             - if the vertices are not in the graph
	 * @throws ClassCastException
	 *             - if was unable to cast the resultant Edge
	 * @throws NullPointerException
	 *             - if the vertices are null
	 */
	public E addEdge(V init, V end) throws IllegalArgumentException,
			ClassCastException, NullPointerException;

	/**
	 * Adds a Vertex to the Graph
	 * 
	 * @param vertex
	 *            - the Vertex to add
	 * @return <code>V</code> - the added Vertex
	 * @throws NullPointerException
	 *             - if the vertex is null
	 */
	public V addVertex(V vertex) throws NullPointerException;

	/**
	 * Tests whether there is an edge from vertex <code>init</code> to vertex
	 * <code>y</code>.
	 * 
	 * @param init
	 *            - the initial vertex
	 * @param end
	 *            - the ending vertex
	 * @return <code>true</code> if exists and edge between the vertices,
	 *         <code>false</code> otherwise
	 * @throws IllegalArgumentException
	 *             - if the vertices are not in the graph
	 * @throws NullPointerException
	 *             - if the vertices are null
	 */
	public boolean adjacent(V init, V end) throws IllegalArgumentException,
			NullPointerException;

	/**
	 * Returns all vertices such that there is an edge from <code>vertex</code>
	 * to the others
	 * 
	 * @param vertex
	 *            - the vertex to search
	 * @return <code>Set<V></code> - The vertices that have an edge with
	 *         <code>vertex</code>
	 * @throws IllegalArgumentException
	 *             - if the vertex are not in the graph
	 * @throws NullPointerException
	 *             - if the vertex are null
	 */
	public Set<V> neighbors(V vertex) throws IllegalArgumentException,
			NullPointerException;

	/**
	 * @param vertex
	 * @return
	 * @throws IllegalArgumentException
	 *             - if the vertex are not in the graph
	 * @throws NullPointerException
	 *             - if the vertex are null
	 */
	public boolean removeVertex(V vertex) throws IllegalArgumentException,
			NullPointerException;

	public boolean removeEdge(E edge);

}
