public class TestBook {

	public static void main(String[] args) {
		Book ob1 = new Book();
		Book ob2 = new Book();
		ob1.setBookId(123);
		ob1.setBookName("java");
		ob1.setBookPrice(299.00);
		System.out.println("Book1 Details");
		System.out.println(ob1.getBookId());
		System.out.println(ob1.getBookName());
		System.out.println(ob1.getBookPrice());


		ob2.setBookId(123);
		ob2.setBookName("java");
		ob2.setBookPrice(299.00);
		System.out.println("Book2 Details");
		System.out.println(ob2.getBookId());
		System.out.println(ob2.getBookName());
		System.out.println(ob2.getBookPrice());




	}

}
