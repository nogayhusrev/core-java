package lab10_classObject_encapsulation.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer {

    private String name;
    private int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double hourlyRate;

    private String programmingLanguage;


    public String getName(){
        return name;
    }

    public void setName(String name){

        if(name == null || name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name: "+name);
            System.exit(1);
        }

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if( age < 18){
            System.err.println("Invalid age for the tester: "+age);
            System.exit(1);
        }

        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    //'Q'
    public void setGender(char gender) {

        if( !(gender == 'M' || gender == 'F') ){ // invalid
            System.err.println("Invalid gender for tester: "+gender);
            System.exit(1);
        }

        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if(jobTitle == null || jobTitle.trim().isEmpty() ){
            System.err.println("Invalid job title: "+jobTitle);
            System.exit(1);
        }

        this.jobTitle = jobTitle;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {

        if(hourlyRate < 0){
            System.err.println("Hourly rate of the tester can not be negative");
            System.exit(1);
        }

        this.hourlyRate = hourlyRate;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {

        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.addAll(Arrays.asList(
                "Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"
        ) );

        if(!programmingLanguages.contains(programmingLanguage)){
            System.err.println("Invalid programming language: "+programmingLanguage);
            System.exit(1);
        }


        this.programmingLanguage = programmingLanguage;
    }


    public Developer(String name, int age, char gender, String id, String jobTitle, double hourlyRate, String programmingLanguage) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setHourlyRate(hourlyRate);
        setProgrammingLanguage(programmingLanguage);
    }

    public double getSalary(){
        return hourlyRate * 40 * 52;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + getSalary() +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }


    public void coding(){
        System.out.println(name + " is coding in "+programmingLanguage);
    }

    public void fixingBug(){
        System.out.println(name+" is fixing bugs");
    }




}

/*
 2. create a class named Developer
            Attributes:
                name, age, gender, employeeID, jobTitle, hourlyRate , programmingLanguage

            Encapsulate all the fields
              Conditions for setting the fields:
                  1. name can not be set to null/empty/blank
                  2. age can not be less than 18
                  3. gender can only be set to 'M' or 'F'
                  5. jobTitle can not be set to null/empty/blank
                  6. hourlyRate  can not be negative
                  7. programmingLanguage must be one of those programming language:
                          languages = {"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}
            Method:
              getSalary(): returns the annual salary
              coding()
              fixingBug()
              toString()
 */