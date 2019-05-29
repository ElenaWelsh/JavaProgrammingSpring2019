package day49_Inheritance2;

public class PaperBack extends Book{
 private int pages;

public int getPages() {
	return pages;
}

public void setPages(int pages) {
	this.pages = pages;
}


public String toString() {
	return "Book [title=" + getTitle() + ", type=" + getType() + ", Author=" + getAuthor() + ", price=" + getPrice()
	+ pages+"]";
}
}
