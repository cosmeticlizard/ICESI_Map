package model;

public class Edge<T> {
	
	private int weight;
	private Vertex<T> origin;
	private Vertex<T> destiny;
	
	public Edge(int w, Vertex<T> o, Vertex<T> d) {
		this.weight = w;
		this.origin = o;
		this.destiny = d;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Vertex<T> getOrigin() {
		return origin;
	}

	public void setOrigin(Vertex<T> origin) {
		this.origin = origin;
	}

	public Vertex<T> getDestiny() {
		return destiny;
	}

	public void setDestiny(Vertex<T> destiny) {
		this.destiny = destiny;
	}
	
	
	
}
