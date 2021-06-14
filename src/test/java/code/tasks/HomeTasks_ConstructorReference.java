package code.tasks;

class Employee{
    String name;
    String account;
    int salary;

    Employee(String name,String act, int salary)
    {
        this.name=name;
        this.account=act;
        this.salary=salary;
    }

}
public class HomeTasks_ConstructorReference {
    public static void main(String[] arg)
    {
        Employee emp1 = new Employee("Ashish","HDFC-0012345",10000);
        getEmployeeDetails(emp1);

        Employee emp2 = new Employee("Swadha","SBI-67854367",20000);
        getEmployeeDetails(emp2);
    }

    public static void getEmployeeDetails(Employee emp)
    {
        System.out.println("Name : "+emp.name+" ,Account: "+emp.account+" ,Salary: "+emp.salary);
    }
}
