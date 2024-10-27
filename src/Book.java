public class Book {

  private String nameBook;
  private Author authorBook;
  private int yearBook;

  public Book (String nameBook, Author authorBook, int yearBook) {
    this.nameBook = nameBook;
    this.authorBook = authorBook;
    this.yearBook = yearBook;
  }

  public String getNameBook() {
    return nameBook;
  }

  public int getYearBook() {
    return yearBook;
  }

  public Author getAuthorBook() {// почему серый ? может он не нужен ?
    return authorBook;
  }

  public void setYearBook(int yearBook) {
    this.yearBook = yearBook;
  }

}
