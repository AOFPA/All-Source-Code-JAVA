public class Employee{
    //Attribute
    public String id;
    public String name;
    public Double salary;

    public void setId(String id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSalary(Double salary){
        this.salary=salary;
    }
    public void displayEmployee(){
        System.out.println("ID = " + this.id);
        System.out.println("name = " + this.name);
        System.out.println("salary = " + this.salary);
    }
}