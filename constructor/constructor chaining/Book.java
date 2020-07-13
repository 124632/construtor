class Book {
	String title;
	String author;
	int numOfPage;
	double price;

	Book() {
		System.out.println(" book Dc.");
	}

	Book(String title, double price, String author) {
		System.out.println(" Book 2param constructor....");
		this.title= title;
		this.author=author;
		this.price= price;
	}
}

class AcademicBook extends Book {
	String course;
	int edition;

	AcademicBook() {
		super("core java",450.99,"Ashok");
		System.out.println(" AcademicBook  DC....");
	}

	AcademicBook(String course) {
		System.out.println(" AcademiBook 1 param constructor");
		this.course= course;
	}
}