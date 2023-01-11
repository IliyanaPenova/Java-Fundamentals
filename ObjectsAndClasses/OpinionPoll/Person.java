package ObjectsandClasses.OpinionPoll;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(int age) {
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

}


