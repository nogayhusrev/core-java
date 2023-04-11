package day30_inheritance.bookTask;

public class Book {

    private String title;
    private String type;
    private String author;
    private double price;

    public Book(String title, String type, String author, double price) {
        setTitle(title);
        setAuthor(author);
        setType(type);
        setPrice(price);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        //	1. price can not be set to negative
        if (price < 0 ){
            System.err.println("Price can not be set to negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName()+"{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=$" + price +
                '}';
    }
}
/*
bookTask:
	1. create a class named Book:
			variables:
				title, type, author, price

			Encapsulate all the fields
					Conditions:
						1. price can not be set to negative

			Add a constructor that can set all the fields

			Methods:
				toString()

	2 Create a sub class of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()

	3 Create a sub class of Book named AudioBook:
			Extra variables:
				length, narrator

			Encapsulate all the extra fields
					Conditions:
						1. length can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				toString()
 */