package ArrayList;

// maxSize, currentSize를 이용한 ArrayList
// ArrayList는 배열을 이용하여 List를 구현한 것이다.
// 장점 : 조회가 매우 빠르다(index로 바로 접근 가능)
// 단점 : 추가, 삭제에 비효율적이다.(추가 시, 제거 시 index를 계속해서 관리해주어야 하기 때문)
 
// 1. add(Element e) ; boolean
// 2. remove(int index) ; Element
// 3. size() ; int
// 4. get(int index) ; Element
// 5. isEmpty() ; boolean

public class ArrayList {
	private String[] list;
	private int maxSize;
	private int currentSize;

	public ArrayList() {
		maxSize = 100;
		currentSize = 0;
		list = new String[maxSize];
	}

	// 1. add(Element e) ; boolean
	// maxSize는 100으로 초기화
	// 이후 maxSize가 넘을 경우 size에 100을 더해서 자동으로 추가가 계속된다.
	public boolean add(String element) {
		boolean flag = false;
		if (currentSize == maxSize) {
			maxSize += 100;
			String[] tmpList = new String[maxSize];
			for (int i = 0; i < list.length; i++) {
				tmpList[i] = list[i];
			}
			list = tmpList;
		}
		list[currentSize++] = element;
		flag = true;
		return flag;
	}

	// 2. remove(int index) ; Element
	// index를 기반으로 remove를 구현.
	// 만약 빈 공간을 제거할 경우 배열의 모든 요소를 앞으로 당겨준다.
	public String remove(int index) {
		if (index >= currentSize || index < 0) {
			throw new ArrayIndexOutOfBoundsException("유효하지 않은 index입니다.");
		}
		String returnString = list[index];
		for (int i = index; i < currentSize - 1; i++) {
			list[i] = list[i + 1];
		}
		currentSize--;
		return returnString;
	}

	// 3. size() ; int
	// currentSize를 반환
	public int size() {
		return currentSize;
	}

	// 4. get(int index) ; Element
	// index를 기반으로 해당 요소를 반환
	public String get(int index) {
		if (index >= currentSize || index < 0) {
			throw new ArrayIndexOutOfBoundsException("유효하지 않은 index입니다.");
		}
		return list[index];
	}

	// 5. isEmpty() ; boolean
	// list가 현재 비어있는 지 아닌 지 반환
	public boolean isEmpty() {
		if (currentSize == 0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < currentSize; i++) {
			result += "(" + list[i] + "), ";
		}
		return result;
	}
}
