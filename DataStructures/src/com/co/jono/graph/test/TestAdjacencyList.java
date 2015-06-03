package com.co.jono.graph.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Set;
import java.util.UUID;

import org.junit.Before;
import org.junit.Test;

import com.co.jono.graph.Edge;
import com.co.jono.graph.Graph;
import com.co.jono.graph.GraphAdjacencyList;
import com.co.jono.graph.Vertex;

/**
 * Test for the Graph's implementation of AdjacencyList
 * 
 * @author jorgemontes
 * @version 1.0
 */
public class TestAdjacencyList {

	/**
	 * A->B
	 */
	Graph<Vertex, Edge> graph = null;
	Vertex a;
	Vertex b;

	/**
	 * Method that creates the Graph that will be tested
	 */
	@Before
	public void runBeforeEveryTest() {
		graph = new GraphAdjacencyList();
		// Vertex creation
		a = new Vertex("A", UUID.randomUUID());
		b = new Vertex("B", UUID.randomUUID());
		// Edge creation
		Edge e = new Edge(a, b);
		// Graph creation
		graph.addVertex(a);
		graph.addVertex(b);
		graph.addEdge(a, b);
	}

	@Test
	public void testAddVerticesAndEdges() {
		boolean adja = graph.adjacent(a, b);
		assertTrue("the nodes are not adjacent", adja);
	}

	@Test
	public void testAddNullVertex() {
		Vertex c = null;
		try {
			graph.addVertex(c);
		} catch (NullPointerException ex) {
			assertEquals("not the expected Exception", "Vertex is null!!",
					ex.getMessage());
		} catch (Exception e) {
			fail("Not a NullPointerException");
		}
	}

	@Test
	public void testAlreadyAddedVertex() {
		Vertex c = b;
		try {
			graph.addVertex(c);
		} catch (IllegalArgumentException ex) {
			assertEquals("not the expected Exception",
					"the vertex is allready in graph", ex.getMessage());
		} catch (Exception e) {
			fail("Not a IllegalArgumentException");
		}
	}

	@Test
	public void testAddEdgeNullVortex() {
		try {
			graph.addEdge(null, a);
		} catch (NullPointerException ex) {
			assertEquals("not the expected Exception", "Vertex is null!!",
					ex.getMessage());
		} catch (Exception e) {
			fail("Not a NullPointerException");
		}
	}

	@Test
	public void testAddEdgeNullVortex2() {
		try {
			graph.addEdge(a, null);
		} catch (NullPointerException ex) {
			assertEquals("not the expected Exception", "Vertex is null!!",
					ex.getMessage());
		} catch (Exception e) {
			fail("Not a NullPointerException");
		}
	}

	@Test
	public void testAddEdge() {
		try {
			Vertex c = new Vertex("C", UUID.randomUUID());
			graph.addVertex(c);
			graph.addEdge(a, c);
			boolean adja = graph.adjacent(a, c);
			assertTrue("the nodes are not adjacent", adja);
		} catch (Exception ex) {
			ex.printStackTrace();
			fail("The method do not suppose to throw an Exception");
		}
	}

	@Test
	public void testAddEdgeNotExistentVertex() {
		try {
			Vertex c = new Vertex("C", UUID.randomUUID());
			graph.addEdge(b, c);
		} catch (IllegalArgumentException ex) {
			assertEquals("not the expected Exception",
					"the vertex is not in the graph", ex.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
			fail("Not a IllegalArgumentException");
		}
	}

	@Test
	public void testNotAdjacent() {
		boolean adja = graph.adjacent(b, a);
		assertTrue("the nodes are adjacent", !adja);
	}

	@Test
	public void testGetVertices() {
		Set<Vertex> vertices = (Set<Vertex>) graph.getVertices();
		if (vertices == null) {
			fail("a and b vertices were expected!");
		}
		if (vertices.size() == 0) {
			fail("a and b vertices were expected!");
		}
		if (vertices.size() > 2) {
			fail("a and b vertices were expected!");
		}
		if (!vertices.contains(a) || !vertices.contains(b)) {
			fail("a and b vertices were expected!");
		}
	}
}
