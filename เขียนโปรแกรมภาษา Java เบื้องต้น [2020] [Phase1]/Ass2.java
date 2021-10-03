import java.util.Scanner;
public class Ass2 {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.print("Num1 : ");
        int a = sc.nextInt();
        System.out.print("Num2 :");
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a + " มากกว่า " + b);
        }else if(a < b){
            System.out.println(a + " น้อยกว่า " + b);
        }else{
            System.out.println(a + " เท่ากับ " + b);
        }
        System.out.println("จบโปรแกรม");

    }
}
