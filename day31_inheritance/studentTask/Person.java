package day31_inheritance.studentTask;

public class Person {

    private String name, gender;
    private int age;

    public Person(String name, String gender, int age) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name) {
        // 1. name should not be set to null
        // 2. name should not be empty
        // 3. name should not contain any special character other than space
        if (name != null || !name.isEmpty() ){

            for (char c: name.toCharArray()){
                if (!Character.isLetterOrDigit(c) && c!=' '){
                    System.err.println(" 1. name should not be set to null\n" +
                            " 2. name should not be empty\n" +
                            " 3. name should not contain any special character other than space");
                    System.exit(1);

                }
            }
            this.name = name;
        }else{
            System.err.println(" 1. name should not be set to null\n" +
                    " 2. name should not be empty\n" +
                    " 3. name should not contain any special character other than space");
            System.exit(1);
        }




    }

    public void setGender(String gender) {
        //5. gender must be valid
        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")){
            this.gender = gender;
        }else {
            System.err.println("Gender cannot be other than \"M,m,F,f,Male,male,Female,female\"");
            System.exit(1);
        }

    }

    public void setAge(int age) {
        //4. age should not be set to negative

        if (age < 0){
            System.err.println("Age should not be set to negative");
            System.exit(1);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
/*
Student Task:
    1. Create a class named Person:
            Variables:
                name, age, gender

            Encapsulate all the fields

            Add a constructor that can set all the fields

                    Condition:
                        1. name should not be set to null
                        2. name should not be empty
                        3. name should not contain any special character other than space
                        4. age should not be set to negative
                        5. gender must be valid

            Methods:
                eat()
                drink()
                sleep()
                toString()




    3. Create the following sub classes of Student class:

                1. GraduateStudent:

                        Override the study method

                        add any additional fields and methods if necessary

                2. UndergraduateStudent

                        Override the study method

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


                4. Create a class named StudentObjects:

                        Create the objects of each sub classes

                        test all the functions of each objects

                        Analyze the relationships between the classes

 */