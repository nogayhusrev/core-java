package day22_arrayList;

public class TaskUpperLowerCase {

    public static void main(String[] args) {

        String str="JAVA java";

        int uppers=0;
        int lowers=0;

        char [] ch=str.toCharArray();

        for (char c : ch) {
            if (Character.isUpperCase(c)) uppers++;
            if (Character.isLowerCase(c)) lowers++;
        }

        if (uppers == lowers)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
/*
6. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

        Note: Use Wrapper class methods
 */