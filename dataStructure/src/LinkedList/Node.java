package LinkedList;

public class Node<E> {
	private E element;
	private Node<E> nextNode;

	public Node() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Node(E element, Node<E> nextNode) {
		super();
		this.element = element;
		this.nextNode = nextNode;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public Node<E> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node [element=" + element + ", nextNode=" + nextNode + "]";
	}
}
