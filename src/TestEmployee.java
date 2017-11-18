public class TestEmployee {

    public static void main(String[] args){
        //Employee Objects
        Employee e1=new Employee("John", 50000, 2005,"A101");
        e1.display();//displays employee details

        Employee e2=new Employee("George",90000, 2000,"A201");
        e2.display();

        Employee e3=new Employee("Zion", 75000.99,2009, "A102");
        e3.display();

        System.out.println("s Employee 1 and 3 are Same: "+ e1.equals(e3));
    }
}
