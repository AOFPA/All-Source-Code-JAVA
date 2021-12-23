
import java.util.Scanner; //การเพิ่มคำสั่งเข้ามา

abstract class Food { //สร้าง abstract class

    String name; //สร้าง Attribute

    public abstract void FoodOrder(); //สร้าง abstract method
}

class Burger extends Food { //สืบทอด class จาก abstract class

    public Burger(String n) {    //สร้าง constructor คือ เมธอดที่ชื่อเดียวกับ Class
        name = n; //ให้ตัวแปร name มีค่าเท่ากับ อาร์กิวเมนต์ n
    }

    @Override //เขียนทับ  method จาก super class
    public void FoodOrder() {
        System.out.println("คุณ " + name + " สั่ง Burger 1 รายการ"); //แสดงผลลัพธ์
    }
}

class Pizza extends Food { //สืบทอด class จาก abstract class

    public Pizza(String n) {  //สร้าง constructor คือ เมธอดที่ชื่อเดียวกับ Class
        name = n; //ให้ตัวแปร name มีค่าเท่ากับ อาร์กิวเมนต์ n
    }

    @Override  //เขียนทับ  method จาก super class
    public void FoodOrder() {
        System.out.println("คุณ " + name + " สั่ง Pizza 1 รายการ"); //แสดงผลลัพธ์
    }
}

class Sandwich extends Food { //สืบทอด class จาก abstract class

    public Sandwich(String n) {  //สร้าง constructor คือ เมธอดที่ชื่อเดียวกับ Class
        name = n; //ให้ตัวแปร name มีค่าเท่ากับ อาร์กิวเมนต์ n
    }

    @Override  //เขียนทับ  method จาก super class
    public void FoodOrder() {
        System.out.println("คุณ " + name + " สั่ง Sandwich 1 รายการ"); //แสดงผลลัพธ์
    }
}

public class ch07 { //สร้าง class ch07

    public static void main(String[] args) { //สร้าง method main
        String customer_name; //สร้าง attribute customer_name
        Scanner input = new Scanner(System.in); //สร้าง object input เพื่อใช้คำสั่งในการรับค่าจากแป้นพิมพ์
        System.out.print("กรุณาระบุชื่อผู้สั่ง : "); //แสดงผลว่า กรุณาระบุชื่อผู้สั่ง : 
        customer_name = input.next(); //ให้ตัวแปร customer_name เท่ากับค่าที่รับมาจากแป้นพิมพ์

        Burger order01 = new Burger(customer_name); //สร้าง Object order01
        order01.FoodOrder(); //เรียกใช้ method FoodOrder();

        Pizza order02 = new Pizza(customer_name); //สร้าง Object order02
        order02.FoodOrder();//เรียกใช้ method FoodOrder();

        Sandwich order03 = new Sandwich(customer_name); //สร้าง Object order3
        order03.FoodOrder();

    }
}
