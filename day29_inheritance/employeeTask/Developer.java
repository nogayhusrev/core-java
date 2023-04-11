package day29_inheritance.employeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Developer extends Employee {
    private String programingLanguage;

    public void setInfo(String name, char gender, int age, int id, String jobTitle, double salary,String programingLanguage) {
        setName(name);
        setGender(gender);
        setAge(age);
        setId(id);
        setJobTitle(jobTitle);
        setSalary(salary);
        setProgramingLanguage(programingLanguage);

    }

    public void setProgramingLanguage(String programingLanguage) {

        ArrayList<String> list=new ArrayList<>(Arrays.asList("Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"));

        if (list.contains(programingLanguage)) {
            this.programingLanguage = programingLanguage;
        }else {
            System.err.println("Invalid programing language");
            System.exit(1);
        }

    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void coding(){
        System.out.println(getName() + " is coding with " + getProgramingLanguage());
    }

    @Override
    public String toString() {
        String result=super.toString().substring(0,super.toString().length()-1);

        return result +
                ", programingLanguage='" + programingLanguage + '\'' +
                '}';
    }
}
/*
2. Create a custom Class named Developer

			Variables:
				name, gender, age, id, jobTitle, salary, programmingLanguage

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative
					5. programming language can only be set to one of the followings:
						{"Java", "JavaScript", "Python", "Ruby", "C#", "C++", "Swift"}

			Methods:
				setInfo(): sets all the fields (including programmingLanguage)
				coding()
				toString(): prints developer object info when the object is passed in the print statement


 */