/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamarkt;
import java.util.ArrayList;
/**
 *
 * @author Phantom
 */
public class Cart {
    ArrayList<CartItem> items = new ArrayList<>();
	ArrayList<IPromotion> promotions = new ArrayList<>();
	double promotionSumOfProducts = 0;
	
	public double totalPriceOfProducts(){
		double sum = 0;
		for(CartItem it : items)
			sum += it.getProduct().getPrice();
		return sum;
	}
	public double totalPriceOfDiscountedProducts(){
		double sum = 0;
		for(CartItem it : items)
			sum += it.getCurrentPrice();
		return sum;
	}
	public ArrayList<CartItem> getItems() {
		return items;
	}
	
	public Cart addProduct(Product p) {
		items.add(new CartItem(p));
		promotionSumOfProducts += p.getPrice(); 
		return this;
	}

	public Cart addPromotion(IPromotion p) {
		promotions.add(p);
		return this;
	}
	
	public Cart applyPromotions(){
		for(IPromotion p : promotions){
			p.CalculateOffer(this);
		}
		return this;
	}
	@Override
	public String toString() {
		return "Cart [\nitems=" + items + "\npromotions=" + promotions + "\npromotionSumOfProducts="
				+ promotionSumOfProducts + "]";
}
}
