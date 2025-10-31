package org.example;

public class Person {

        String firstName;
        String lastName;
        int age;
        String location;
        boolean isWorking;
        String[] favColors;


public Person(String firstName, String lastName, int age){
this.firstName =firstName;
this.lastName = lastName;
this.age = age;

}
    public Person(String firstName, String lastName, int age, String location, String[] favColors){
        this(firstName, lastName, age);
        this.location =location;
        this.favColors = favColors;

    }

    public String getFirstName(){
    return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public String getLocation(){
        return this.location;
    }
    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
        return (this.age >= 13 && this.age <= 19);
    }

    public String[] getFavColors(){
        return this.favColors;
    }

    public boolean getIsWorking(){
        return this.age>25;
    }
}
