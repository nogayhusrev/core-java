package day26_statics;

public class TaskPerson {

    public String name;
    public int age;
    public char gender;




    public TaskPerson(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;


    }

    public void eat(String food){
        System.out.println(name + " is eating " + food );
    }

    public void drink(String drink){
        System.out.println(name + " is drinking " + drink);
    }

    public void sleep(){
        System.out.println(name + " is  sleeping");
    }

    @Override
    public String toString() {
        return "TaskPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*

3. Person Task:
		1. Create a class named Person:

				Attributes:
					instance: name, age, gender

					static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

				Add a constructor that can set All the fields (instances)


				Actions:
					eat(String food)
					drink(String drink)
					sleep()
					toString()

 */