package day49_Inheritance2;

public class BarnesAndNobles {
	public static void main(String[] args) {
		
		EBook ebook= new EBook();
		ebook.setTitle("Introduction to Java");
		ebook.setAuthor("Savitch");
		ebook.setPages(1016);
		ebook.setPrice(170);
		ebook.setSize(500);
		ebook.setTitle("Tech book");
		
		System.out.println(ebook.getAuthor());
		System.out.println(ebook.getTitle());
		ebook.readEBook(10);
		
		AudioBook aBook = new AudioBook();
		aBook.setTitle("OCA preparation");
		aBook.setAuthor("Jeanne");
		aBook.setNarrator("Marufjon");
		
		PaperBack pb= new PaperBack();
		pb.setTitle("Outliers");
		pb.setAuthor("Malcom");
		pb.setPrice(20);
		pb.setType("Autobiography");
		pb.setPages(304);
		System.out.println(pb.toString());
}
}