package day30_inheritance.bookTask;

public class TestBook {
    public static void main(String[] args) {

        Book b=new Book("Adam","Thriller","Adam",25);
        System.out.println(b);

        System.out.println("-------------------------");
        Ebook eb=new Ebook("Adam","Thriller","Adam",25,"Small",1233);
        System.out.println(eb);

        System.out.println("-------------------------");
        AudioBook ab=new AudioBook("Adam","Thriller","Adam",25,12,"Adam");
        System.out.println(ab);
    }
}
