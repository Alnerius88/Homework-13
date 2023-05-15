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
    public String toString () {
        return bookName + bookAuthor + publicationYear;
    }
    public int hashCode () {
        int result1 = bookName == null ? 0 : bookName.hashCode();
        //Я не понимаю, зачем эта строка и как она работает.
        int result2 = bookAuthor.hashCode();
        int result = result1 + result2 + publicationYear;
        return result;
    }
}