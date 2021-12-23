/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poly;

/**
 *
 * @author AOFPA
 */
class Person{
    private String fname ;
    private String lname ;
    private int age ;
    public Person(String fname , String lname , int age){
        this.fname = fname;
        this.lname = lname;
        this.age = age;
    }
    public void Display(){
        System.out.print(fname + " " + lname + " " + age);
    }
}

class Manager extends Person{
    String workDepart;
    public Manager(String fname ,String lname,int age ,String workDepart){
        super(fname,lname,age);
        this.workDepart = workDepart;
    }
    public void Display(){
        super.Display();
        System.out.print(" แผนก : " + workDepart);
    }
}
class Student extends Person{
    String depart;
    public Student(String fname ,String lname , int age , String depart){
    super(fname ,lname ,age);
    this.depart = depart;
}
    public void Display(){
        super.Display();
        System.out.print("เรียนสาขา" + depart);
    }
}



public class poly {
    public static void main(String[] args) {
        Person P1,P2,P3;
        P1 = new Person("f-person","l-person",21);
        P2 = new Student("f-student","l-student",18,"coe");
        P3 = new Manager("f-manager" , "l-manager" , 30 , "coe");
        
        P1.Display();
        P2.Display();
        P3.Display();
    }
    
    
}
