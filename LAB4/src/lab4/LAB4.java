/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Phantom
 */
public class LAB4 {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("123", 10);
		BankAccount acc2 = new BankAccount("321", 20);
		
		System.out.println(acc1);
		acc1.cashIncome(100);
		System.out.println(acc1);

		System.out.println(acc1);
		acc1.cashTaking(50);
		System.out.println(acc1);
		
		System.out.println(acc1);
		System.out.println(acc2);
		acc1.bankTransferToAccount(acc2, 45);
		System.out.println(acc1);
		System.out.println(acc2);
		
	}

}
