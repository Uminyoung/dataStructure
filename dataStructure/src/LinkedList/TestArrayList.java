package LinkedList;

public class TestArrayList {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("엄");
		list.add("엄1");
		list.add("엄2");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
	}
}
