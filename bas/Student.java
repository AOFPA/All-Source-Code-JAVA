public class Student {
    private String name,department,tel,email;
    public void setValue(String name,String department,String tel,String email){
        this.name = name;
        this.department = department;
        this.tel = tel;
        this.email=email;
    }
    public void display(){
        System.out.println("name : " + this.name);
        System.out.println("department : " + this.department);
        System.out.println("tel : " + this.tel);
        System.out.println("email : " + this.email);
    }
}
