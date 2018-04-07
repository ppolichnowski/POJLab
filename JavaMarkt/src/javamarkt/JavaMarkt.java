/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamarkt;

/**
 *
 * @author Phantom
 */
public class JavaMarkt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p = new Product("Jabłka",1.69);
        System.out.println(p);
        
        Cart cart = new Cart();
        cart .addProduct(new Product("Kartofle", 200))
             .addProduct(new Product("Gazeta",100))
             .addProduct(new Product("Kotlet",150));
        System.out.println(cart);
        cart.addPromotion(new ValuePromotion());
        cart.applyPromotions();
        System.out.println(cart);
    }
    
}
