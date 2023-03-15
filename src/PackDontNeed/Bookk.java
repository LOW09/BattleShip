package PackDontNeed;

public class Bookk {
    int BookId;
    String BookName;
    String Autor;
    int Price;
    BookGener Genra;

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void setGenra(BookGener genra) {
        Genra = genra;
    }

    public int getBookId() {
        return BookId;
    }

    public String getBookName() {
        return BookName;
    }

    public String getAutor() {
        return Autor;
    }

    public int getPrice() {
        return Price;
    }

    public BookGener getGenre() {
        return Genra;
    }

    public Bookk(int bookId, String bookName, String autor, int price, BookGener genra) {
        BookId = bookId;
        BookName = bookName;
        Autor = autor;
        Price = price;
        Genra = genra;
    }
}
