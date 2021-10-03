import java.util.Scanner;
public class Ass4 {
    //แปลง พศ เป็น คศ
    public static void main (String[] arge){
        Scanner sc=new Scanner(System.in);
        System.out.print("ป้อน พ.ศ. : ");
        int year = sc.nextInt();
        year = year-543;
        System.out.println("แปลงเป็น ค.ศ. = " + year);
    }

}
