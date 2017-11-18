public class Employee extends Person {
    //Data members
    private double annualSalary;
    private int hiredYear;
    private String ID;

    //Constructor with parameters employee name, salary, date and id

    public Employee(String initialName, double initialSalary, int joinedYear,
                    String id){
            //Calls base class constructor
            super(initialName);
            annualSalary=initialSalary;
            hiredYear=joinedYear;
            ID=id;
    }
    //Sets annual salary
    public void setAnnualSalary(double newsSalary){
        annualSalary=newsSalary;
    }
    //Sets hired year
    public void setHiredYear(int year){
        hiredYear=year;
    }
    //sets employee ID
    public void setID(String newID){
        ID=newID;
    }
    //Returns annual Salary
    public double getAnnualSalary(){
        return annualSalary;
    }
    //Returns hired year
    public int getHiredYear(){
        return hiredYear;
    }
    // public employee ID
    public String getID(){
        return ID;
    }

    //Returns true if both employee objects are same
    //otherwise returns false
    public boolean equals(Employee otherEmployee){
        if (name.equals(otherEmployee.name))
            if (annualSalary==otherEmployee.annualSalary)
                if (hiredYear==otherEmployee.hiredYear)
                    if(ID ==otherEmployee.ID)
                        return true;
        return false;
    }
    //Prints the employee name, annual Salary, hired Year and ID
    public void display(){
        System.out.println("Employee Name: " +name);
        System.out.println("Employee Annual Salary: " +annualSalary);
        System.out.println("Employee Hired Year: " +hiredYear);
        System.out.println("Employee ID: " +ID);
        System.out.println();
    }
}
