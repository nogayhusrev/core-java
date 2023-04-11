package day26_statics;

public class TaskPersonTest {

    public static void main(String[] args) {

        TaskPerson tp=new TaskPerson("Adam", 24, 'M');
        tp.eat("Meat");
        tp.drink("Coke");
        tp.sleep();
        System.out.println(tp);
    }
}
