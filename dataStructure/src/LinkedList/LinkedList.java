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
		listSize++;
		return retVal;
	}
	
	public E remove(int index){
		E retElement = null;
		 if(index<0 || index >= listSize){
			 throw new IndexOutOfBoundsException("유효하지 않은 index입니다.");
	     }else if(index == 0){
	         Node<E> firstNode = headNode.getNextNode().getNextNode();
	         headNode.setNextNode(firstNode);
	         listSize--;
	         retElement = firstNode.getElement();
	     }else{
	    	 Node<E> node = headNode.getNextNode();
	         for(int i =0; i < index-1 ; i++){
	        	 node = node.getNextNode();
	         }
	         Node<E> previousNode = node.getNextNode();
	         Node<E> removeNode = previousNode.getNextNode();
	         Node<E> nextNode = removeNode.getNextNode();
	         previousNode = nextNode;
	         listSize--;
	         retElement = removeNode.getElement();
	     }
		return retElement;
	}
	
	public E get(int index){
		Node<E> currentNode = headNode;
		//index가 list사이즈보다 크거나 0보다 작을 경우 exception?
		if(index<0 || index >= listSize	){
			throw new IndexOutOfBoundsException("유효하지 않은 index입니다.");
		}
		//currentNode 구하기 위해서 index 크기만큼 반복
		 for(int i =0; i < index; i++){
			 currentNode = currentNode.getNextNode();
	        }
	     return currentNode.getElement();
	}
	
}