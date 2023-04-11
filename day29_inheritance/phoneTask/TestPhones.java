package day29_inheritance.phoneTask;

public class TestPhones {
    public static void main(String[] args) {
        Phone p =new Phone();
        p.setInfo("Apple","Iphone","S","Red",999);
        System.out.println(p);

        System.out.println("------------------------------");
        Iphone ip =new Iphone();
        ip.setInfo("Apple","Iphone 5s","S","Red",999);
        System.out.println(ip);
        ip.faceTime(232412342L);

        System.out.println("------------------------------");
        Samsung s =new Samsung();
        s.setInfo("Samsung","S6","S","Red",999);
        System.out.println(s);
        s.freeze();

        System.out.println("------------------------------");
        Nokia n =new Nokia();
        n.setInfo("Nokia","3310",null,"Red",999);
        System.out.println(n);
        n.selfDefense();


    }

}
