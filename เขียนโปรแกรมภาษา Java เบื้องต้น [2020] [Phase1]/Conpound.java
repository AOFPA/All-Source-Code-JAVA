public class Conpound {
    public static void main(String[] arge){
        // += -= *= /= %=  ความหมายคือ x = x (opt) y
        int x = 10 , y=5;
        System.out.println("ก่อน : " + x);
        x %= y;
        System.out.println("หลัง : " + x);
    }
}
