package day30_inheritance.bookTask;

public class AudioBook extends Book{
    private String narrator;
    private int length;

    public AudioBook(String title, String type, String author, double price, int length, String narrator){
        super(title, type, author, price);
        setLength(length);
        setNarrator(narrator);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0 ){
            System.err.println("Invalid length: "+length);
            System.exit(1);
        }
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }


    public void listen(){
        System.out.println("Listening to "+getTitle());
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1)  +
                ", narrator='" + narrator + '\'' +
                ", length=" + length +
                '}';
    }
}
/*
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