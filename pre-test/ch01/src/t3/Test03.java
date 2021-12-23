/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3;

/**
 *
 * @author AOFPA
 */

class Animal{
    private String name;
    private int no_of_legs;
    private int age ;

    public Animal(String name ,int no_of_legs,int age){
    this.name = name;
    this.no_of_legs = no_of_legs;
    this.age = age ;
}
    public void Sound(){
        System.out.println("sound");
    }
}


class Dog extends Animal{
    private String dog_breed;
    
    public Dog(String name ,int no_of_legs,int age,String dog_breed){
        super(name,no_of_legs,age);
        this.dog_breed = dog_breed;
        System.out.println("ชื่อ : " + name + " จำนวนขา : " + no_of_legs + " ขา อายุ : " + age + " ปี สายพันธุ์ : " + dog_breed);
    }
    public void Sound(){
        System.out.println("Blow Blow");
    }
}

class Cat extends Animal{
    private String cat_breed;
    
    public Cat(String name ,int no_of_legs,int age,String cat_breed){
        super(name,no_of_legs,age);
        this.cat_breed = cat_breed;
        System.out.println("ชื่อ : " + name + " จำนวนขา : " + no_of_legs + " ขา อายุ : " + age + " ปี สายพันธุ์ : " + cat_breed);
    }
    public void Sound(){
        System.out.println("Meow Meow");
    }
}

class Duck extends Animal{
    private String duck_breed;
    
    public Duck(String name ,int no_of_legs,int age,String duck_breed){
        super(name,no_of_legs,age);
        this.duck_breed = duck_breed;
        System.out.println("ชื่อ : " + name + " จำนวนขา : " + no_of_legs + " ขา อายุ : " + age + " ปี สายพันธุ์ : " + duck_breed);
    }
    public void Sound(){
        System.out.println("Quack Quack");
    }
}



public class Test03 {
    public static void main(String[] args) {
        Animal A1 ,A2 ,A3;
        A1 = new Dog("ดำ",4,10,"ไทย");
        A1.Sound();
        
        A2 = new Cat("บัวขาว",4,5,"แมวป่า");
        A2.Sound();
        
        A3 = new Duck("สมศรี",2,2,"กากีแคมเบลล์");
        A3.Sound();
    }
    
}
