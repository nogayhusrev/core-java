package day17_customClass;

public class Student {
    String name;
    char gender;
    int age;
    int studentId;
    char grade;
    String isFullTime;

    public static void main(String[] args) {
        Student std=new Student();
        std.setInfo("Ahmet",'M',23,4219,'S');
        System.out.println(std);
        std.study();


    }

    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = ID;
        this.grade = grade;
    }

    public String toString(){
        return "------------------------\n" +
                "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + studentId +
                ", grade=" + grade +
                '}';
    }

    public void study(){
        System.out.println("------------------------");
        System.out.println(name + " is studying.");
    }

}
/*
2. Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime

		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()
 */