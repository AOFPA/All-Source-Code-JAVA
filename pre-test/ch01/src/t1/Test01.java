/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1;

/**
 *
 * @author AOFPA
 */
class Person {
    protected String name = "โชคชัย";
    protected int age = 21;
    protected String workplace = "COE";
    
    public void walk(){
        System.out.println("I walk");
    }
    public void eat(){
        System.out.println("I eat");
    }
}

class Programmer extends Person{
    private String teamName = "COE1";
    
    public void coding(){
        System.out.println("I coding");
    }
    public static void main(String[] args) {
        Programmer P1 = new Programmer();
        P1.walk();
        P1.eat();
        P1.coding();
        System.out.println("name : " + P1.name + " age : "+ P1.age + " workplace : " + P1.workplace + " team : " + P1.teamName);
    }
}

class Dancer extends Person{
    private String groupName = "black pink";
    
    public void dancing(){
        System.out.println("I dancing");
    }
    public static void main(String[] args) {
        Dancer D1 = new Dancer();
        D1.walk();
        D1.eat();
        D1.dancing();
        System.out.println("name : " + D1.name + " age : "+ D1.age + " workplace : " + D1.workplace + " group : " + D1.groupName);
    }
}

class Singer extends Person{
    private String bandName = "maroon5";
    
    public void singing(){
        System.out.println("I singing");
    }
    public void playGitar(){
        System.out.println("I play gitar");
    }
    public static void main(String[] args) {
        Singer S1 = new Singer();
        S1.walk();
        S1.eat();
        S1.singing();
        S1.playGitar();
        System.out.println("name : " + S1.name + " age : "+ S1.age + " workplace : " + S1.workplace + " band : " + S1.bandName);
    }
}

public class Test01 {
}
