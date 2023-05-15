import java.util.Objects;

public class Book {
    private String bookName;
    private Author bookAuthor;
    int publicationYear;
    public Book (String bookName, Author bookAuthor, int publicationYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.publicationYear = publicationYear;
    }
    public String getBookName() {
        return bookName;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear (int pubYear) {
        this.publicationYear = pubYear;
    }

    @Override
    public String toString() {
        return "Книга. " +
                "Название: " + bookName +
                " Автор: " + bookAuthor +
                " Год издания: " + publicationYear;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(bookName, book.bookName) && Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuthor, publicationYear);
    }
}