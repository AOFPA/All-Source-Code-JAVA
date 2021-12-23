
class EncapsDemo {

    private int empId;
    private String empName;
    private int empAge;

    /*
    หากต้องการเข้าถึง Attibute ให้ใช้ method 
        [1] getter(ดึงค่า/อ่านค่า)
        [2] setter(เปลี่ยนแปลงค่า)
     */
    public int get_empId() {
        return empId;
    }

    public String get_empName() {
        return empName;
    }

    public int get_empAge() {
        return empAge;
    }

    public void set_empId(int new_id) {
        empId = new_id;
    }

    public void set_empName(String new_name) {
        empName = new_name;
    }

    public void set_empAge(int new_age) {
        empAge = new_age;
    }

}

public class Test_Encaps {

    public static void main(String[] args) {
        EncapsDemo obj = new EncapsDemo();
        obj.set_empId(1);
        obj.set_empName("Chokchai Jamnoi");
        obj.set_empAge(21);
        System.out.println("รหัสลูกจ้าง : "+ obj.get_empId());
        System.out.println("ชื่อลูกจ้าง : "+ obj.get_empName());
        System.out.println("อายุลูกจ้าง : "+ obj.get_empAge());
    }
}
