package day29_inheritance.employeeTask;

public class TestEmployee {

    public static void main(String[] args) {


        Developer d=new Developer();
        Tester tstr=new Tester();
        Teacher t=new Teacher();
        Driver drv=new Driver();

        System.out.println("------------------------------------");
        t.setInfo("Adam",'M',23,1,"Teacher",1250);
        System.out.println(t);
        System.out.println("------------------------------------");
        tstr.setInfo("Adam",'M',23,1,"Tester",1250);
        System.out.println(tstr);
        System.out.println("------------------------------------");
        d.setInfo("Adam",'M',23,1,"Developer",1250);
        System.out.println(d);
        System.out.println("------------------------------------");
        drv.setInfo("Adam",'M',23,1,"Driver",1250);
        System.out.println(drv);

        System.out.println("------------------------------------");
        System.out.println(drv.getClass().isInterface());
    }
}
