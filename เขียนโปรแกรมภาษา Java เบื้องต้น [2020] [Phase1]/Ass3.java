import java.util.Scanner;
public class Ass3{
    //โปรแกรมหาเลขคู่เลขคี่
    public static void main(String[] arge){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        if(num%2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        System.out.println("End");
        
    }
}