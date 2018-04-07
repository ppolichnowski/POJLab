/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pozyczka;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
/**
 *
 * @author Phantom
 */
public class Pozyczka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Applicant appl = new Applicant();
     
     String firstName = null;
     appl.setFirstName(firstName);
     System.out.println(appl);
     
     firstName = "A";
     appl.setFirstName(firstName);
     System.out.println(appl);
     
     firstName = "$123";
     appl.setFirstName(firstName);
     System.out.println(appl);
     
     firstName = "Ala";
     appl.setFirstName(firstName);
     System.out.println(appl);
     
     String surName = "Kota";
     appl.setSurName(surName);
     System.out.println(appl);
     
     String pesel = "12345678901";
     appl.setPesel(pesel);
     System.out.println(appl);
     
     String nip = "123987456";
     appl.setNip(nip);
     System.out.println(appl);
     
     String bankAccountNumber = "4056000000001234";
     appl.setBankAccountNumber(bankAccountNumber);
     System.out.println(appl);
     
     String gender = "K";
     appl.setGender(gender);
     System.out.println(appl);
     
     Date d = new GregorianCalendar(2018, 02, 20).getTime();
     appl.setDateOfBirth(d);
     System.out.println(appl);
     
    }
    
}
