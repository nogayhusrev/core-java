package day30_inheritance.cryptoTask;

public class MyWallet {

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        Bitcoin b=new Bitcoin(23.4,25,123123127398L,21231231,true);
        System.out.println(b);
        System.out.println(b.totalPrice());

        System.out.println("------------------------------------");
        Doge doge=new Doge(23.4,25,123123127398L,21231231,true);
        System.out.println(doge);
        System.out.println(doge.totalPrice());

    }
}
