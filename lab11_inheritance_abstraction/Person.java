package lab11_inheritance_abstraction;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
       setName(name);
        setAge(age);
        if(!(gender =='M' || gender == 'F')) {
            System.err.println("Invalid gender: "+gender);
            System.exit(1);
        }
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            System.err.println("Name of the person can not be null");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age <= 0){
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void eat(String food){
        System.out.println(name +" is eating "+food);
    }

    public void drink(String drink){
        System.out.println(name +" is drinking "+drink);
    }

    public void sleep(){
        System.out.println(name +" is sleeping");
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}

/*
1. Create a class named Person:
			Variables:
				name, age, gender (final)

			Encapsulate all the fields
				Conditions:
					1. age can not be zero or negative
					2. gender can only be set to 'M' or 'T', or 'F'
					3. name can not be null

			methods:
				eat(), drink(), sleep(), toString()
 */