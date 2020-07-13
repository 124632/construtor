class Tester {
	public static void main(String[] args) {
		System.out.println(" main method started....");
		Book bk = new Book();


		AcademicBook ab = new AcademicBook();
		System.out.println(ab.course);
		System.out.println(ab.title);
		System.out.println("  - - - - - -- ");
		AcademicBook ab1 = new AcademicBook(" BE");
		System.out.println(ab.course);
		System.out.println(ab.title);

		System.out.println(" main method ended....");
	}
}