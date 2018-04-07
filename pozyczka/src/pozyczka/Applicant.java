/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pozyczka;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.*;

/**
 *
 * @author Phantom
 */
public class Applicant {
private String firstName;
private String surName;
private String pesel;
private String nip;
private String bankAccountNumber;
private String gender;
private Date dateOfBirth;

public Applicant(){}

public Applicant(String firstName, String surName, String pesel, String nip, String bankAccountNumber, String gender, Date dateOfBirth) {
    this.firstName = firstName;
    this.surName = surName;
    this.pesel = pesel;
    this.nip = nip;
    this.bankAccountNumber = bankAccountNumber;
    this.gender = gender;
    this.dateOfBirth = dateOfBirth;
}

private boolean checkName(String firstName) {
    if(firstName == null)
        return false;
    else if(firstName.length()<2)
        return false;
    else if (! validatePattern(firstName, "^[a-zA-Z]*$"))
        return false;
    else
        return true;
}

public String getFirstName() {
    return firstName;
}

public void setFirstName(String firstName){
    if (checkName(firstName))
        this.firstName = firstName;
    else
        System.out.println("First Name Error: " + firstName);
}


}
