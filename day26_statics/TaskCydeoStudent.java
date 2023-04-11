package day26_statics;

public class TaskCydeoStudent {

    public String name;
    public int age;
    public char gender;
    public int id;
    public int batchNumber, groupNumber;
    public char grade;

    public static String schoolName = "Cydeo School";
    public static String magicWord = "Wooden Spoon";



    public TaskCydeoStudent(String name, int age, char gender, int id, int batchNumber, int groupNumber, char grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;

    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void attend(){

        System.out.println(name + " is attending the class");
    }


    public static void printSchoolName(){
        System.out.println("School: " + schoolName);

    }

    public static void printProgLanguage(){
        System.out.println("Programing language is: " + magicWord);
    }

    @Override
    public String toString() {
        return "TaskCydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                '}';
    }
}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, magicWord

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()

 */