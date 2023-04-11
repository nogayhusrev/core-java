package day27_accessModifiers.cydeoStudent;

public class TestCydeoStudent {

    public static void main(String[] args) {
        CydeoStudent cs=new CydeoStudent("Adam",'M',25,1,2,4219);
        cs.attendClass();
        cs.study();
        cs.printSchoolName();
        cs.printSecretCode();
        System.out.println(cs);
    }



}
