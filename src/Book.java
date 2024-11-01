import java.util.Objects;

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
// что бы распечатать сразу переменную а не все свойства по отдельности
  @Override
  public String toString() {
    return "Название книги :" + nameBook + ", " + " Год издания : " + yearBook +
        " Автор: " + authorBook;


  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(nameBook, book.nameBook) && Objects.equals(authorBook,
        book.authorBook) && Objects.equals(yearBook, book.yearBook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameBook, authorBook, yearBook);
  }
}
