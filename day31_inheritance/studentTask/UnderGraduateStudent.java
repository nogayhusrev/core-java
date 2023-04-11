package day31_inheritance.studentTask;

public class UnderGraduateStudent extends Student{

    public UnderGraduateStudent(String name, String gender, int age, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
    }

    @Override
    public void study() {
        System.out.println(getClass().getSimpleName() + " " + getName() + " is still studying in university" );
    }
}
/*
 2. UndergraduateStudent

                        Override the study method

                        add any additional fields and methods if necessary
 */