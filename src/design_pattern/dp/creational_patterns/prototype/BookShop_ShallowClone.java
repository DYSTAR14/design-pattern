package design_pattern.dp.creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop_ShallowClone implements Cloneable{
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
		for(int i = 0; i <=10 ; i++) {
			Book newBook = new Book();
			newBook.setNum(i);
			newBook.setBookName("Book_"+i);
			getBooks().add(newBook);
		}
	}

	@Override
	public String toString() {
		return "BookShop_ShallowClone [Name=" + Name + ", books=" + books + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
