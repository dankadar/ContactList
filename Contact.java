/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactlist;

/**
 *
 * @author Dan
 */

//abstract class for contacts

public abstract class Contact {
    

//constructors
    
public Contact(){
}

public Contact(String firstName, String lastName, String address, String phoneNumber, String email){
   
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber= phoneNumber;
    this.email = email;
    
}
//accessor methods
    public String getLastName() {
        return lastName;
    }

   
    public String getFirstName() {
        return firstName;
    }
    public String getName() {
        return firstName + " " + lastName;
    }
       
    public String getAddress(){
        return address;
    
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getEmail(){
        return email;
    }
   
 
    public void dispContact(){
    }

 //declare class variables
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    
}



    
    
    

