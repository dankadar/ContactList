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

//class for business contacts

public class Business extends Contact{
    private String jobTitle;
    private String organization;
    
 //constructors
    
public Business(){
    super();
}

public Business(String firstName, String lastName, String address, String phoneNumber, String email, String jobTitle, String organization){
    super (firstName, lastName, address, phoneNumber, email);
    this.jobTitle = jobTitle;
    this.organization = organization;
}   
    public String getJobTitle(){
        return jobTitle;
    }
    public String getOrganization(){
        return organization;
    }
   
//displays business contacts details.
 @Override
public void dispContact(){
    String name = this.getName(); 
    String address = this.getAddress();
    String phoneNumber = this.getPhoneNumber();
    String email = this.getEmail();
    String jobTitle = this.getJobTitle();
    String organization = this.getOrganization();
    
    
        
    System.out.println(name + " is a business contact.");
    System.out.println("*******************************************");
    System.out.println("Address: " + address);
    System.out.println("Phone Number: " + phoneNumber);
    System.out.println("Email Address: " + email);
    System.out.println("Job Title: " + jobTitle);
    System.out.println("Organization Name: " + organization);
    System.out.println("*******************************************");
    
      
    
}
}
