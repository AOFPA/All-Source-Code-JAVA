public class Main1 {
    public static void main(String[] arge){
        Teacher t1=new Teacher();
        Teacher t2=new Teacher();

        t1.setValue("Chokchai Jamnoi", "Coe", "083-5323829");
        t2.setValue("Witsarut", "BC", "082-2822822");

        t1.display();
        t2.display();
    }
}
