package day06_ifStatements;
public class EqualNumbers {

    public static void main(String[] args) {
        int nm1=12,
                nm2=23,
                nm3=23;
        if(nm1==nm2 && nm1==nm3 && nm2==nm3){
            System.out.println("all equal");
        } else if (nm1==nm2 ) {
            System.out.println(nm1 +"&"+nm2+" are equal");
        } else if (nm1==nm3) {
            System.out.println(nm1 +"&"+nm3+" are equal");
        }else if (nm2==nm3) {
            System.out.println(nm2 +"&"+nm3+" are equal");
        }else{
            System.out.println("none equal");
        }

    }
}
/*
7. Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal


 */