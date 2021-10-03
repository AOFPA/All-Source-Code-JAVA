public class Main {
    public static void main(String[] arge){
        Employee e1=new Employee(); //Create Objact
        e1.setId("1");
        e1.setName("Chokchai");
        e1.setSalary(100000.0);
        // System.out.println("ID = " + e1.id);
        // System.out.println("name = " + e1.name);
        // System.out.println("salary = " + e1.salary);
        Employee e2=new Employee();
        e2.setId("2");
        e2.setName("Jamnoi");
        e2.setSalary(50000.0);

        e1.displayEmployee();
        e2.displayEmployee();
    }
}
