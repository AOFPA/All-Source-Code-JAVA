import java.util.Scanner;
public class IfReduce{
    public static void main(String[] arge){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int num = sc.nextInt();
        String result="";
        result = num%2 == 0 ? "Even" : "Odd" ;
        System.out.println(result);
    }
}