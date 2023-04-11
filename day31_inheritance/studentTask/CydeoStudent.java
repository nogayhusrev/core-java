package day31_inheritance.studentTask;

public class CydeoStudent extends Student{
    private int batchNumber;
    private int groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, String gender, int age, int studentId, String fieldOfStudy, String schoolName, char grade, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, gender, age, studentId, fieldOfStudy, schoolName, grade);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);

    }

    public void setBatchNumber(int batchNumber) {
        //1. batchNumber and groupNumber should not be set to zero or negative
        if (batchNumber < 1){
            System.err.println("BatchNumber and groupNumber should not be set to zero or negative");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public void setGroupNumber(int groupNumber) {
        //1. batchNumber and groupNumber should not be set to zero or negative
        if (groupNumber < 1){
            System.err.println("BatchNumber and groupNumber should not be set to zero or negative");
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        //2. programmingLanguage should not be set to null
        //3. programmingLanguage should not empty
        if (programmingLanguage.isEmpty() || programmingLanguage==null){
            System.err.println("2. programmingLanguage should not be set to null\n" +
                    "3. programmingLanguage should not empty");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}');
    }
}
/*
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