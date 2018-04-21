/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankier;

/**
 *
 * @author Phantom
 */
public class Konto {
    private String AccountNumber;
    private String Name;
    private String Surname;
    private String Country;
    private Double AccBalance;

public Konto(){}
public Konto(String AccountNumber,String Name,String Surname,String Country,Double AccBalance) {
    this.AccountNumber = AccountNumber;
    this.Name = Name;
    this.Surname = Surname;
    this.Country = Country;
    this.AccBalance = AccBalance;
}
        
    
public String getName() {
return Name;
}
public void setName(String Name) {
    this.Name = Name;
}
public String getSurname(){
    return Surname;
}
public void setSurname(String Surname){
    this.Surname = Surname;
}
public String getCountry() {
    return Country;
}
public void setCountry(String Country) {
    this.Country = Country;
}
public Double getAccBalance() {
    return AccBalance;
}
public void setAccBalance(Double AccBalance){
    this.AccBalance = AccBalance;
}

}