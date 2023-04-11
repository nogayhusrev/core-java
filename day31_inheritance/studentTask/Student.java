package day31_inheritance.studentTask;

public class Student extends Person{
    private int studentId;
    private String fieldOfStudy;
    private String schoolName;
    private char grade;

    public Student(String name, String gender, int age, int studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, gender, age);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        // 1. filedOfStudy and schoolName should not be set to null
        // 2. filedOfStudy and schoolName should not be empty
        if (fieldOfStudy.isEmpty() || fieldOfStudy==null) {
            System.err.println("1. filedOfStudy and schoolName should not be set to null\n" +
                    "2. filedOfStudy and schoolName should not be empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setSchoolName(String schoolName) {
        // 1. filedOfStudy and schoolName should not be set to null
        // 2. filedOfStudy and schoolName should not be empty
        if (schoolName.isEmpty() || schoolName==null) {
            System.err.println("1. filedOfStudy and schoolName should not be set to null\n" +
                    "2. filedOfStudy and schoolName should not be empty");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public void setGrade(char grade) {
        //3. grade must be valid (A, B, C, D, F)
        if (grade != 'A' || grade != 'B' || grade != 'C' || grade != 'D' || grade != 'F' ) {
            System.err.println("Grade cannot be other than (A, B, C, D, F)");
            System.exit(1);
        }

        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void study(){
        System.out.println(getName() + " is studying");
    }

    @Override
    public String toString() {
        return super.toString().replace("}",", studentId=" + studentId +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}');
    }
}
/*
2. Create a subclass of Person named Student:
                Extra variables:
                        studentId, fieldOfStudy, grade, schoolName

                Encapsulate all the fields

                Add a constructor that can set all the fields

                            Condition:
                                    1. filedOfStudy and schoolName should not be set to null
                                    2. filedOfStudy and schoolName should not be empty
                                    3. grade must be valid (A, B, C, D, F)


                Extra methods:
                    study()
                    toString(): name, age, gender, studentId, fieldOfStudy, grade, schoolName should be included

3. Create the following sub classes of Student class:

                1. GraduateStudent:

                        Override the study method

                        add any additional fields and methods if necessary

                2. UndergraduateStudent

                        Override the study method
"
                        add any additional fields and methods if necessary

                3. CydeoStudent:

                        Extra Variables:
                            batchNumber, groupNumber, programmingLanguage

                        Encapsulate all the fields

                        Add a constructor that can set all the fields

                                Condition:
                                    1. batchNumber and groupNumber should not be set to zero or negative
                                    2. programmingLanguage should not be set to null
                                    3. programmingLanguage should not empty


                        Override the eat, drink and sleep methods (programmingLanguage need to be included)

                        Override the toString method:
                                name, age, gender, studentId, fieldOfStudy, grade, schoolName, batchNumber, groupNumber, programmingLanguage should be included


 */

