package lab07_ClassAndObject;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public boolean isEmployed, isMarried;
    public String batch;
    public int group;
    public String programmingLanguage;


    // sets all the fields of the object
    public void setInfo(String name, int age, char gender, boolean isEmployed, boolean isMarried, String batch, int group, String programmingLanguage) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isEmployed = isEmployed;
        this.isMarried = isMarried;
        this.batch = batch;
        this.group = group;
        this.programmingLanguage = programmingLanguage;
    }


    public void study(){
        System.out.println(name+" is studying "+programmingLanguage);
    }

    // displays the student info when the object is passed in print statement
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batch='" + batch + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }


}

/*
Create a custom class for CydeoStudent objects.
In each object, user should be able to store the name, age, gender, isMarried, isEmployed, batch, programming language, and group number information of the Cydeo student
Add a function named setInfo that allows the user to be able to set all the fields of the Cydeo student
Add a function named study that can print the name and programming language the student studying
Add a function that allows the user to be able to display each objects’ name, age, gender, batch  and programming language of the student when it’s passed in the print statement

 */