public class Vehicle {
       protected String brand = "Toyota";
       
       public void honk(){
           System.out.println("Tuut! Tuut! Tuut!");
       }    
       public void start(){
           System.out.println("Vehicle Started");
       }
       public void stop(){
           System.out.println("Vehicle Stopped");
       }
}

class Car extends Vehicle{
    private String modelName = "Vios";
    
    public static void main(String[] args){
        Car myCar = new Car();
        System.out.println("brand : " + myCar.brand + " , model : " + myCar.modelName);
        myCar.start();
        myCar.honk();
        myCar.stop();
        System.out.println("-----------------------------------------------");
    }
}
 
class Motorcycle extends Vehicle{
    private String color = "White";
    private String licensePlate = "AB 1133";
    
    public static void main(String[] args){
    Motorcycle myMotorcycle = new Motorcycle();
    myMotorcycle.brand = "Honda" ;
    System.out.println("brand : " + myMotorcycle.brand + " , Color : " + myMotorcycle.color+ " , License Plate : " + myMotorcycle.licensePlate);
    myMotorcycle.start();
    myMotorcycle.honk();
    myMotorcycle.stop();
    System.out.println("-----------------------------------------------");
    }
    

}

class Ship extends Vehicle{
    private String color = "Black";
    private String type = "War ship";
    public void cannonFire(){
        System.out.println("Boom Boom !!");
    }
    public static void main(String[] args){
    Ship myShip = new Ship();
    myShip.brand = "Admiral";
    System.out.println("brand : " + myShip.brand + " , Color : " + myShip.color+ " , Type : " + myShip.type);
    myShip.start();
    myShip.honk();
    myShip.cannonFire();
    myShip.stop();
    System.out.println("-----------------------------------------------");
    } 
}
