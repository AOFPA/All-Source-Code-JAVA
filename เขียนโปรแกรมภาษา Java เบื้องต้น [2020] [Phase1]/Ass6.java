import java.util.Scanner;
public class Ass6 {
    public static void main(String[] arge){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int inp = sc.nextInt();

        int oneThousand = inp/1000;
        inp -= (oneThousand * 1000);

        int fiveHundred = inp/500;
        inp -= (fiveHundred*500);

        int oneHundred = inp/100;
        inp -= (oneHundred*100);

        int fifty = inp/50;
        inp -= (fifty*50);

        int twenty = inp/20;
        inp -= (twenty*20);

        System.out.printf("1000 ทอน : %d ใบ\n500 ทอน : %d ใบ\n100 ทอน : %d ใบ\n50 ทอน : %d ใบ\n20 ทอน : %d ใบ",oneThousand,fiveHundred,oneHundred,fifty,twenty);
    }
}
