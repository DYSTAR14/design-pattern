package design_pattern.dp.creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop_DeepClone implements Cloneable {
	private String Name;
	private List<Book> books = new ArrayList<>();

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public void loadData() {
		for (int i = 0; i <= 10; i++) {
			Book newBook = new Book();
			newBook.setNum(i);
			newBook.setBookName("Book_" + i);
			getBooks().add(newBook);
		}
	}

	@Override
	public String toString() {
		return "BookShop_DeepClone [Name=" + Name + ", books=" + books + "]";
	}

	@Override
	protected BookShop_DeepClone clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BookShop_DeepClone books = new BookShop_DeepClone();
		for (Book book : this.getBooks()) {
			books.getBooks().add(book);
		}
		return books;
	}
}