package day27_accessModifiers.cydeoStudent;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber, groupNumber;
    public int secretCode;

    public static String schoolName;
    public static String programmingLanguage;

    static {
        schoolName="Cydeo";
        programmingLanguage="Java";
    }

    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, int secretCode) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.secretCode = secretCode;
    }

    public void printSchoolName(){
        System.out.println("schoolName = " + schoolName);
    }

    public void printSecretCode(){
        System.out.println("name = " + secretCode);
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", secretCode=" + secretCode +
                '}';
    }
}
/*
2. create a class named CydeoStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()
 */
