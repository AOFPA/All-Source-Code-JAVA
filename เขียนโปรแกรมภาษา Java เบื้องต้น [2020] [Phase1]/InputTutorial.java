import java.util.Scanner;
public class InputTutorial{
    public static void main(String[] arge){
        //รับค่าข้อมูล

        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter name = ");
        // String name=sc.nextLine();
        // System.out.println("Your name is " + name);

        System.out.print("พศ เกิด : ");
        double years = sc.nextDouble();//int(nextInt) , float(nextFloat) , Double(nextDouble) ,String(nextLine)
        //สามารถใช้ next เฉย ๆ ได้ แต่มันจะไม่เอาค่าว่าง เช่น input aof pa  ออกแค่คำว่า aof
        years = 2564 - years;
        System.out.print("อายุ : " + years + " ปี");
        
    }
}