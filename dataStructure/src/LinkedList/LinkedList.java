package LinkedList;

// LinkedList
// 장점 : 노드의 동적 추가, 삽입, 삭제가 용이
// 단점 : 검색의 경우, 모든 노드를 처음부터 탐색해야 함

// 1. add(Element e) ; boolean
// 2. remove(int index) ; Element
// 3. get(int index) ; Element

public class LinkedList<E> {
	private Node<E> headNode;
	private int listSize;

	public LinkedList() {
		super();
		headNode = new Node<E>(null, null);
	}

	public int size() {
		return listSize;
	}

	public boolean add(E element) {
		boolean retVal = false;
		Node<E> currentNode = headNode;
		// 꼬리 노드에 접근
		while (currentNode.getNextNode() != null) {
			currentNode = currentNode.getNextNode();
		}
		// 꼬리 노드는 element, null 형태임
		Node<E> rearNode = new Node<E>(element, null);
		// 꼬리 노드에 node링크 넣어줌
		currentNode.setNextNode(rearNode);
		retVal = true;
		listSize++;
		return retVal;
	}

	public E remove(int index) {
		if (index < 0 || index >= listSize) {
			throw new IndexOutOfBoundsException("유효하지 않은 index입니다.");
		}
		Node<E> node = headNode;
		// 삭제될 '전' Node까지 접근
		for (int i = 0; i <= index - 1; i++) {
			if (node.getNextNode() != null) {
				node = node.getNextNode();
			}
		}
		// 현재 node는 removeNode의 이전 노드.
		// removeNode는 return될 Node
		Node<E> removeNode = node.getNextNode();

		// 삭제될 다음 노드의 링크로 연결
		node.setNextNode(removeNode.getNextNode());

		// 삭제될 노드는 링크가 없어져야한다.
		removeNode.setNextNode(null);
		listSize--;
		return removeNode.getElement();
	}

	public E get(int index) {
		Node<E> currentNode = headNode;
		// index가 list사이즈보다 크거나 0보다 작을 경우
		if (index < 0 || index >= listSize) {
			throw new IndexOutOfBoundsException("유효하지 않은 index입니다.");
		}
		// currentNode 구하기 위해서 index 크기만큼 반복
		for (int i = 0; i < index; i++) {
			currentNode = currentNode.getNextNode();
		}
		return currentNode.getElement();
	}

	@Override
	public String toString() {
		return "LinkedList [headNode=" + headNode + ", listSize=" + listSize + "]";
	}

}