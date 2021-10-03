class Human{ //Super class - Human
    String name; //สร้าง Attrubute name
    String bornPlace ; //สร้าง Attrubute bornPlace
    int bornYear; //สร้าง Attrubute bornYear
     
    public Human(String name , String bornPlace , int bornYear){ //สร้าง method Human
        this.name = name; //ให้ตัวแปร name ใน class = ตัวแปร name ที่รับมา
        this.bornPlace = bornPlace; //ให้ตัวแปร bornPlace ใน class = ตัวแปร bornPlace ที่รับมา
        this.bornYear = bornYear; //ให้ตัวแปร bornYear ใน class = ตัวแปร bornYear ที่รับมา
    }
    public void Introduce(){ //สร้าง method Introduce
        //แสดงผลลัพธ์
        System.out.println("ฉันชื่อ : " + name); 
        System.out.println("สถานที่เกิด : " + bornPlace);
        System.out.println("ฉันเกิดปี : " + bornYear);
    }
}

class Teacher extends Human {  //Sub class - Teacher
    String workDepart; //สร้าง Attrubute workDepart
    
    public Teacher(String name , String bornPlace , int bornYear , String workDepart){ //สร้าง method Teacher
        super(name,bornPlace,bornYear); //เรียกใช้ method Human super classs โดยส่งพารามิเตอร์ name,bornPlace,bornYear
        this.workDepart = workDepart; //ให้ตัวแปร workDepart ใน class = ตัวแปร workDepart ที่รับมา
    }
        @Override 
        public void Introduce(){ //สร้าง method Introduce
        super.Introduce(); //เรียกใช้ method Introduce ใน Super class
        System.out.println("ฉันเป็นอาจารย์ สอนคณะ : " + workDepart); //แสดงผลลัพธ์
    }
}

class Student extends  Human{ //Sub class - Student
    String depart; //สร้าง Attrubute depart;
    
    public Student(String name , String bornPlace , int bornYear , String depart ){ //สร้าง method Student
        super(name,bornPlace,bornYear); //เรียกใช้ method Human ใน super classs โดยส่งพารามิเตอร์ name,bornPlace,bornYear
        this.depart = depart; //ให้ตัวแปร depart ใน class = ตัวแปร depart ที่รับมา
    }
    @Override
    public void Introduce(){  //สร้าง method Introduce
        super.Introduce(); //เรียกใช้ method Introduce ใน Super class
        System.out.println("ฉันเป็นนักศึกษา เรียนคณะ : " + depart); //แสดงผลลัพธ์
    }
}

public class Ex_polymorphism { //class - Ex_polymorphism
    public static void main(String[] args){ ////สร้าง method main
        //สร้างและ ประกาศ Object
        Human Per1 , Per2 , Per3; 
        Per1 = new Human("สมชาย","กรุงเทพฯ",1995); 
        Per2 = new Teacher("ดร.เกสรา","สงขลา",1995,"COE");
        Per3 = new Student("โชคชัย","สงขลา",2000,"COE");
        
        
        //เรียกใช้ Polymorphism
        Per1.Introduce();
        Per2.Introduce();
        Per3.Introduce();
    }
}
