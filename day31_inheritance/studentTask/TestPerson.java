package day31_inheritance.studentTask;

public class TestPerson {
    public static void main(String[] args) {
        Person p = new Person("Adam" ,"M",34);
        System.out.println(p);

        System.out.println("-----------------------");
        Student s = new Student("Adam" ,"Male", 26,123,"Java Developer", "Cydeo", 'A');
        System.out.println(s);

        System.out.println("-----------------------");
        GraduateStudent gs = new GraduateStudent("Adam" ,"Male", 26,123,"Java Developer", "Cydeo", 'A');
        gs.study();
        System.out.println(gs);

        System.out.println("-----------------------");
        UnderGraduateStudent us = new UnderGraduateStudent("Adam" ,"Male", 26,123,"Java Developer", "Cydeo", 'A');
        us.study();
        System.out.println(us);

        System.out.println("-----------------------");
        CydeoStudent cs = new CydeoStudent("Adam" ,"Male", 26,123,"Java Developer", "Cydeo", 'A',1,2,"Java");
        cs.study();
        System.out.println(cs);
    }
}
