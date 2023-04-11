package day29_inheritance.employeeTask;

public class Teacher extends Employee{

    public void teaching(){
        System.out.println(getName() + " is teaching");
    }
}
/*
3. Create a custom Class named Teacher
			Variables:
				name, gender, age, id, jobTitle, salary

			Encapsulate all the fields
				Conditions:
					1. gender can only be 'M' or 'F'
					2. age can not be nagative
					3. age MUST be between 18 to 65
					4. salary can not be negative

			Methods:
				setInfo(): sets all the fields
				teching()
				toString(): prints teacher object info when the object is passed in the print statement
 */