import java.util.Scanner;
public class IFStatemaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        if(age >= 15 && age < 20){ //if จะทำเมื่อค่าในวงเล็บ เป็น true ตัวแปร result เก็บค่า true อยู่
            System.out.println("วัยรุ่น");
        }else if(age >= 20 && age < 30){
            System.out.println("วัยทำงาน");
        }else if(age >= 30 && age < 40){
            System.out.println("วัยผู้ใหญ่");
        }else if(age >= 40 && age >= 50){
            System.out.println("วัยชรา");
        }else{
            System.out.println("วัยเด็ก");
        }
        System.out.println("End");
    }
}
