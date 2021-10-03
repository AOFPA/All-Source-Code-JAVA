import java.util.Scanner;
//โปรแกรมคำนวณน้ำหนัก
public class Bmi {
    public static void main(String[] arge){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Weight : ");
        float weight = sc.nextFloat();
        System.out.print("Enter Height : ");
        float height = sc.nextFloat();
        height = height/100;
        float bmi = weight/(height*height);
        System.out.printf("BMI : %.2f\n",bmi);
    }
}
