
package contactlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dan Kadar
 * This program will add and store contacts sorted between business and personal. 
 */
public class ContactList {

   
    public static void main(String[] args) {
     
     int selection;  // store user selection
     Scanner in = new Scanner(System.in); // read input from command line
     ArrayList<Contact> contactRecord = new ArrayList<Contact>(); //store contacts
         
     
       while (true) {
            // Display menu graphics
            System.out.println("========================================");
            System.out.println("|            Contacts                  |");
            System.out.println("========================================");
            System.out.println("| Options:                             |");
            System.out.println("|   1. Add a business contact          |");
            System.out.println("|   2. Add a personal contact          |");
            System.out.println("|   3. Display contacts                |");
            System.out.println("|   4. Quit                            |");
            System.out.println("========================================");
            System.out.println(" Select an option and hit enter: ");
            selection = in.nextInt();

            // Switch statement
            switch (selection) {
                case 1:
                    addContact(contactRecord, selection);
                    break;
                case 2:
                    addContact(contactRecord, selection);
                    break;
                case 3:
                    //If no contact added yet prompt for new selection
                    if (contactRecord.size() == 0){
                        System.out.println("No contacts to display select again");
                        break;
                    }
                    else{
                    dispContacts(contactRecord);
                    break;
                    }
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection select again");
                    break;
            }
        }
       
    }
    
    // Prompts user for contact information and stores information in contactRecord
    public static void addContact(ArrayList<Contact> contactRecord, int selection) {
        Scanner in = new Scanner(System.in);
    
        System.out.println("First name: ");
        String firstName = in.nextLine();
        System.out.println("Last name:");
        String lastName = in.nextLine();
        System.out.println("Address:");
        String address = in.nextLine();
        System.out.println("Phone number:");
        String phoneNumber = in.nextLine();
        System.out.println("Email Address:");
        String email = in.nextLine();
        //check for valid email address
        boolean isEmail = false;
        do{
        for (int i = 0; i< email.length(); i++){
            if (email.charAt(i)== '@'){
                isEmail = true;
             }
        }
        if (isEmail == false){
            System.out.println("Invalid email, Please enter a valid email address:");
            email = in.nextLine();
        }
        }while (isEmail == false);    
        
        
       //For business contact
             
        if (selection == 1) {
            System.out.println("Job Title: ");
            String jobTitle = in.nextLine();
            System.out.println("Organization name:");
            String organization = in.nextLine();
            Contact busContact = new Business( firstName, lastName, address, phoneNumber, email, jobTitle, organization);
            contactRecord.add(busContact);
        }
        
        //For personal contact
        if (selection == 2) {
            System.out.println("Date of birth (MM/DD/YYYY):  ");
            String dateofBirth = in.nextLine();
            Contact persContact = new Personal( firstName, lastName, address, phoneNumber, email, dateofBirth);
            contactRecord.add(persContact);
            
        }
        
    }
    // display list of currently stored contacts and prompt for user input
    public static void dispContacts(ArrayList<Contact> contactRecord){
        Scanner in = new Scanner(System.in);
        System.out.println("Current list of contacts:");
        for (int i = 0; i < contactRecord.size(); i++) {
            //account for index starting at 0
            int j = i + 1;
            System.out.println(j + ") "+ contactRecord.get(i).getFirstName() + " " + contactRecord.get(i).getLastName()) ;
        }
        System.out.println("Enter the number of the person to get contact details:");
        int selection = in.nextInt();  
       
        //Check to make sure valid option is selected
        while (selection > contactRecord.size() || selection <= 0 ){
            System.out.println("Invalid selection, please select number from the above list:");
            selection = in.nextInt();
          
        }
        //change back to index value
        selection--;
        //get selected record and call display method to print to screen
        Contact choice = contactRecord.get(selection);
        choice.dispContact();
    }
    
}
