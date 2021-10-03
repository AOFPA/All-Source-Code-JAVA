public class Teacher {
    private String name,department,tel;
    public void setValue(String name,String department,String tel){
        this.name = name;
        this.department = department;
        this.tel = tel;
    }
    public void display(){
        System.out.println("name : " + this.name);
        System.out.println("department : " + this.department);
        System.out.println("tel : " + this.tel);
    }
}
