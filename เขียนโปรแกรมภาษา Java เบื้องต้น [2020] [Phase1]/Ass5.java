import java.util.Scanner;
public class Ass5{
    public static void main(String[] agre){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Weight(kg) : ");
        float weight = sc.nextFloat();
        System.out.print("Enter Height(cm) : ");
        float height = sc.nextFloat();
        height /= 100;
        float bmi = weight / (height * height);
        System.out.printf("BMI = %.2f\n",bmi);
        String result="";
        if(bmi < 18 ){
            result = "ต่ำกว่าเกณฑ์";
        }else if(bmi >= 18.5 && bmi <= 22.9){
            result = "สมส่วน";
        }else if(bmi >= 23 && bmi <= 24.9){
            result = "น้ำหนักเกิน";
        }else if(bmi >=25 && bmi <= 29.9){
            result = "โรคอ้วน";
        }else{
            result = "โรคอ้วนระดับอันตราย";
        }
        System.out.println(result);
    }
}