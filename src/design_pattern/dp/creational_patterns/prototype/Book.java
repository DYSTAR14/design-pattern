package design_pattern.dp.creational_patterns.prototype;

public class Book {
	private int num;
	private String bookName;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [num=" + num + ", bookName=" + bookName + "]";
	}
}
