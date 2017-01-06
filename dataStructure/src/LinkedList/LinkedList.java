package LinkedList;

// LinkedList
// 장점 : 노드의 동적 추가, 삽입, 삭제가 용이
// 단점 : 검색의 경우, 모든 노드를 처음부터 탐색

// 1. add(Element e) ; boolean
// 2. remove(int index) ; Element
// 3. get(int index) ; Element

public class LinkedList<E> {
	private Node<E> headNode;

	public LinkedList() {
		super();
		headNode = new Node<E>(null, null);
	}

	public boolean add(E element){
		boolean retVal = false;
		Node<E> currentNode = new Node<E>();
		currentNode = headNode;
		while(currentNode != null){
			currentNode = currentNode.getNextNode();
		}
		//currentNode
		/*currentNode.setElement(element);
		currentNode.setNextNode(null);*/
		retVal = true;
		return retVal;
	}
	
	public E remove(int index){
		
		return null;
	}
	
	public E get(int index){
		
		return null;
	}
	
}