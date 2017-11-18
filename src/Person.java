/*
   @author Siam-Al-mer Chowdhury
   CSC 201-004N
   Professor Tanes Kanchanawanchai
 A program to implement and test the functionality of class Employee which is extended from Person class.


   */
//findFigure method definition

public class Person {
//Person Name
    protected String name;

    //Default Constructor
    public Person()
    {
        name="No Name Yet";
    }
    //1-arguement constructor sets initialName
    public Person(String initialName){
        name=initialName;
    }
    // Sets new name
    public void setName(String newName){
        name=newName;
    }

    //Returns Person Name
    public String getName(){
        return name;
    }

    //Write person name to console
    public void writeOutput(){
        System.out.println("Name: "+ name);
    }
    //Returns true if name are same otherwise false
    public boolean hasSameName(Person otherPerson){
        return
        this.name.equalsIgnoreCase(otherPerson.name);
    }
}


