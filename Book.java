package sample;

public class Book {

    private String book_name;
    private String author;
    private String literary_genre;
    private double price;
    private String book_status;

    //constructor fara parametrii

    public Book()
    {
        this.book_name = "";
        this.author = "";
        this.literary_genre = "";
        this.price = 0;
        this.book_status = "";
    }
 //constructor cu parametrii
    private Book(String book_name,String author,String literary_genre, double price, String book_status)
    {
        this.book_name = book_name;
        this.author = author;
        this.literary_genre = literary_genre;
        this.price = price;
        this.book_status = book_status;
    }
//functii get si set
    public String getBook_name() {return book_name; }

    public String getAuthor() { return author; }

    public String getLiterary_genre(){return literary_genre;}

    public double getPrice(){return price;}

    public String getBook_status(){return book_status;}

    public void setBook_name(String book_name){this.book_name = book_name;}

    public void setAuthor(String author){this.author = author;}

    public void setLiterary_genre(String literary_genre){this.literary_genre = literary_genre;}

    public void setPrice(double price){this.price = price;}

    public void setBook_status(String book_status){this.book_status = book_status;}
}
