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
// Class for personal contacts

public class Personal extends Contact {
       private String dateofBirth;
    
  // constructors  
public Personal(){
    super();
}

public Personal(String firstName, String lastName, String address, String phoneNumber, String email, String dateofBirth){
    super (firstName, lastName, address, phoneNumber, email);
    this.dateofBirth = dateofBirth;

}
public String getDateofBirth(){
    return dateofBirth;
}       

// displays personal contact details
@Override
public void dispContact(){
    String name = this.getName(); 
    String address = this.getAddress();
    String phoneNumber = this.getPhoneNumber();
    String email = this.getEmail();
    String dateofBirth = this.getDateofBirth();
    
    
        
    System.out.println(name + " is a personal contact.");
    System.out.println("*******************************************");
    System.out.println("Address: " + address);
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Email Address: " + email);
    System.out.println("Date of Birth: " + dateofBirth);
    System.out.println("*******************************************");
    
      
    
}
}
