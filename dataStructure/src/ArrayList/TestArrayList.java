package ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println("------------------------------------------------------");
		System.out.println(list.add("엄민영"));
		System.out.println(list.add("엄민영"));
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("------------------------------------------------------");
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println("------------------------------------------------------");
		System.out.println(list.get(0));
		System.out.println(list.size());

		System.out.println("------------------------------------------------------");
		System.out.println(list.isEmpty());
		System.out.println(list.remove(0));
		System.out.println(list.isEmpty());
	}
}
