class Display_Book{
	public static void main(String[] args) {
		Book book = new Book();
		Book_Publication book_publication = new Book_Publication();
		Paper_Publication paper_publication = new Paper_Publication();
		Book ref;
		ref =book;
		System.out.println("Class called is Book");
		ref.display_book();
		System.out.println("Class called is Book_Publication");
		ref =book_publication;
		ref.display_book_publication();
		System.out.println("Class called is Paper_Publication");
		ref =paper_publication;
		ref.display_paper_publication();
	}
}