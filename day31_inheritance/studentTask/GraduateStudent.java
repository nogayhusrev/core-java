package day31_inheritance.studentTask;

public class GraduateStudent extends Student{


    public GraduateStudent(String name, String gender, int age, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is studying in a company" );
    }
}
/*

                1. GraduateStudent:

                        Override the study method

                        add any additional fields and methods if necessary
 */