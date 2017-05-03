
public class Main {

	public static void main(String[] args) {
//		user1();
//		user2(); 
//		user3();
//		user4();
//		user5();
	}

	public static void user1() {

		int i = Factory.getObject().add(24,26);

		System.out.println(i);
	}

	public static void user2() {

		int i = Factory.getObject().add(210,290);

		System.out.println(i);
	}

	public static void user3() {

		int i = Factory.getObject().add(21,39);

		System.out.println(i);
	}
}
