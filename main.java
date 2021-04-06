public class main {
	public static void main(String[] args) {

		SortedIntegerList list = new SortedIntegerList(true);
		SortedIntegerList list1 = new SortedIntegerList(true);
		SortedIntegerList list2 = new SortedIntegerList(true);
		list.add(1);
		list.add(2);
		list.add(10);
		list.add(5);
		System.out.println("list");
		System.out.println(list);
		list.add(5);
		System.out.println(list);
		list.remove(5);
		System.out.println(list);

		list1.add(20);
		list1.add(15);
		list1.add(10);
		list1.add(5);
		System.out.println("list1");
		System.out.println(list1);
		list1.add(5);
		System.out.println(list1);
		list1.remove(15);
		list1.remove(20);
		list1.remove(5);
		list1.add(1);
		list1.add(2);
		list1.remove(1123);
		System.out.println(list1);

		list.add(1);
		list.add(2);
		list.add(10);
		list.add(5);
		list1.add(20);
		list1.add(15);
		list1.add(10);
		list1.add(5);
		list2.add(5);
		list2.add(6);
		list2.add(10);
		list2.add(15);
		System.out.println("list");
		System.out.println(list);
		System.out.println("list1");
		System.out.println(list1);
		System.out.println("list2");
		System.out.println(list2);

		if (list.equals(list1)) {
			System.out.println(true);
		}

		try {
			list = list.crossing(list1);
			list1 = list1.crossing(list2);
		}
		catch (SortedIntegerListException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("list");
		System.out.println(list);
		System.out.println("list1");
		System.out.println(list1);

	}
}




