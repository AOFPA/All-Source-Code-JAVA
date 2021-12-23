/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2;

class TestOverload{
    public int calculate(int x , int y){
        return x+y;
    }
    public int calculate(int x , float y){
        return x+(int)y;
    }
    public int calculate(int x , double y){
        return x+(int)y;
    }
    public int calculate(int x , int y , int z){
        return x+y+z;
    }
    
    public static void main(String[] args) {
        TestOverload C1 = new TestOverload();
        System.out.println(C1.calculate(10, 10));
        System.out.println( C1.calculate(10, 5.5));
        System.out.println(C1.calculate(10, 35.5));
        System.out.println(C1.calculate(10, 20, 35));
    }
}

/**
 *
 * @author AOFPA
 */
public class Test02 {
   
    
}
