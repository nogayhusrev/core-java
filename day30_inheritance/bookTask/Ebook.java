package day30_inheritance.bookTask;

public class Ebook extends Book{

    private String size;
    private int pages;

    public Ebook(String title, String type, String author, double price,String size,int pages) {
        super(title, type, author, price);
        this.size=size;
        this.pages=pages;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPages(int pages) {
        //	1. pages can not be set to zero or negative
        if (pages < 0 ){
            System.err.println("Page can not be set to negative");
            System.exit(1);
        }
        this.pages = pages;
    }

    public String getSize() {
        return size;
    }

    public int getPages() {

        return pages;
    }

    public void readBook(){
        System.out.println("Reading " + getType());
    }



    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1) +
                ", size='" + size + '\'' +
                ", pages=" + pages +
                '}';
    }
}
/*
2 Create a sub class of Book named EBook:
			Extra variables:
				size, pages

			Encapsulate all the extra fields
					Conditions:
						1. pages can not be set to zero or negative

			Add a constructor that can set all the fields

			Extra Methods:
				readBook()
 */