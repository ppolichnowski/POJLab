/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ded4;

/**
 *
 * @author Phantom
 */
class G {
    String a() { return "A"; }
    String b() { return a()+"B";}
    String c() { return b()+"C";}
}
class H extends G {
	String a(){ return "X";}
	String b() { return super.b()+"Y"; }
	String d() { return super.a()+"Z";}
}
public class Ded4 {
    public static void main(String[] args) {
	G g = new G() ;	H h = new H() ;
	System.out.println(g.a() + " " + g.b() + " " + g.c());
	System.out.println(h.a() + " " + h.b() + " " + h.c()
			   + " " +h.d());
  }
}