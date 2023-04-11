package lab05_String;

public class StringMethodsPractice {

    public static void main(String[] args) {
        //String name2 = "Cydeo School";

        String name = "Josh Daniel Aaron";
        //             0123456789...

        char ch = name.charAt(7);

        System.out.println(ch);

        System.out.println(name.length());

        char lastChar = name.charAt(name.length() - 1);

        System.out.println(lastChar);


        System.out.println("---------------------------------");

        String school = "Cydeo School";

        int index1 = school.indexOf('e');

        System.out.println(index1);

        int index2 = school.indexOf('j');

        System.out.println(index2);


        String str1 = "Java Programming Language";

        int index3 = str1.indexOf("a ");

        System.out.println(index3);

        System.out.println("-----------------------------------------------------------");


        String s1 = "WOODEN SPOON";

        s1 = s1.toLowerCase(); //"wooden spoon"

        System.out.println(s1);

        s1 = s1.toUpperCase();  //"WOODEN SPOON"

        System.out.println(s1);

        System.out.println("-----------------------------------------------------------");

        String sentence = "Today is Thursday, and Thursday is a lab day";

        sentence = sentence.replace("Thursday", "Friday");

        System.out.println(sentence);

        System.out.println("-----------------------------------------------------------");

        String s = "Today is Thursday, and tomorrow is Thursday";

        s = s.replaceFirst("Thursday", "Wednesday");

        System.out.println(s);

        System.out.println("-----------------------------------------------------------");


        String email = "cydeo_school@gmail.com";

        int beginningIndex = email.indexOf('@') + 1;
        int endingIndex = email.lastIndexOf('.');

        String domain = email.substring(beginningIndex, endingIndex);

        System.out.println(domain);

        System.out.println("-----------------------------------------------------------");

        String s2 = "I study at CYDEO school";

        String schoolName = s2.substring(s2.indexOf('C'));

        System.out.println(schoolName);


        System.out.println("-----------------------------------------------------------");


        String a1 = "DOG";

        String a2 = "dog";


        System.out.println(a1.equals(a2));
        System.out.println(a1.equalsIgnoreCase(a2));

        System.out.println("-----------------------------------------------------------");

        String s3 = "Java is my favorite programming language";

        System.out.println( s3.equals("Java") );
        System.out.println(s3.contains("Java"));

        System.out.println("-----------------------------------------------------------");


        String w = "Cydeo School";

        System.out.println( w.startsWith("Cydeo"));

        System.out.println( w.endsWith("ool") );





    }


}
