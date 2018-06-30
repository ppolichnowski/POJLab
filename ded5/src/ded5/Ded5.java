/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ded5;

/**
 *
 * @author Phantom
 */
public abstract class A {
    abstract void metodaA();
    void metodaB(){};
}
public class B extends A {
    @SuppressWarnings("unused")
    private int z;
    static void metodaC(){}
    void metodaA(){}
    B(int i){
        z=i;
    }
}

public class Ded5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //A a = new A();
        //B b = new B();
        //A c = new B();
        A d = new B(0);
        //B e = new B(8); e.z=4;
        //B.metodaA();
        //B.metodaB();
        //B f = new B(-1); f.metodaA();
        B g = new B(0); g.metodaC();
        //A h = new A(); h.metodaB();
       
    }
    
}
