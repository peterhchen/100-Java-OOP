public class Salary extends Employee {
    private double salary;
    public Salary (String name, String address, int number, double salary) {
        super (name, address, number);
        System.out.println ("Call setSalary");
        setSalary (salary);
    }
    public void mailCheck () {
        System.out.println ("Salary class:");
        System.out.println ("  Name: " + getName() + " Salary: " + salary);
    }
    public double getSalary () {
        return salary;
    }
    public void setSalary (double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        }
    }
    public double computePay () {
        System.out.println ("Salary class:");
        System.out.println ("  ame: " + getName());
        return salary/52;
    }
}
