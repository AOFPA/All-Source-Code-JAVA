/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author AOFPA
 */
public class NewClass {
    protected String brand = "toyota";
    
    public void Hork(){
           System.out.print("hork!!!");
    }
}

class Car extends NewClass{
    private String modelName = "abc";
    public static void main(String[] arge){
        Car myCar = new Car();
        myCar.Hork();
        System.out.print(myCar.brand + " " + myCar.modelName);
    }
        
}
class Ship extends NewClass{
private String modelName = "123456";
public static void main(String[] arge){
    Ship myShip = new Ship();
    myShip.Hork();
    System.out.print(myShip.brand + myShip.modelName);
}
}