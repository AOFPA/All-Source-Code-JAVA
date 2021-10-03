import java.util.Scanner;

public class Operator{
    public static void main(String[] arge){
        int a;
        int b;

        Scanner sc=new Scanner(System.in);

        System.out.print("a : ");
        a = sc.nextInt();
        System.out.print("b : ");
        b = sc.nextInt();

        System.out.println("a + b = " + (a+b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a mod b = " + (a%b));
    }
}