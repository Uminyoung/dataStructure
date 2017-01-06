package LinkedList;

// LinkedList
// ArrayList는 배열을 이용하여 List를 구현한 것이다.
// 장점 : 조회가 매우 빠르다(index로 바로 접근 가능)
// 단점 : 추가, 삭제에 비효율적이다.(추가 시, 제거 시 index를 계속해서 관리해주어야 하기 때문)

// 1. add(Element e) ; boolean
// 2. remove(int index) ; Element
// 3. size() ; int
// 4. get(int index) ; Element
// 5. isEmpty() ; boolean

public class LinkedList<E> {
	private Node<E> headNode;

	public LinkedList() {
		super();
		headNode = new Node<E>(null, null);
	}

}