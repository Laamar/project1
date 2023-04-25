package edu.guilford;

import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Driver 
{
    public Driver(String firstName, String lastName, String email, String color, String animal,
            String number, String sport) {
    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        //ask the user to answer the questions
        //get user's first name
        //let the user know that this is the first user
        System.out.println("This is the first user"+"\n");
        //ask the user to enter their first name, last name, email, color, animal, number, and sport
        System.out.println("Enter your first name: ");
        String firstName = scan.nextLine();
        //get user's last name
        System.out.println("Enter your last name: ");
        String lastName = scan.nextLine();
        //get user's email
        System.out.println("Enter your email: ");
        String email = scan.nextLine();

        //get user's favorite color 
        System.out.println("Enter your favorite color: ");
        String color = scan.nextLine();

        //get user's favorite animal
        System.out.println("Enter your favorite animal: ");
        String animal = scan.nextLine();

        //get user's favorite number
        System.out.println("Enter your favorite number: ");
        String number = scan.nextLine();

        //get user's favorite sport
        System.out.println("Enter your favorite sport: ");
        String sport = scan.nextLine();
        
    //create a new user object
        User user = new User(firstName, lastName, email, color, animal, number, sport);
       
       //print out the password to the user from the genertaed password method
        //print out the username to the user from the generated username method
        System.out.println("Your password is: " + user.generatePassword(firstName, lastName, email, color, animal, number, sport));
        
        //print the encrypted password to the user
        System.out.println("Your encrypted password is: " + AES.encryptPassword(user.generatePassword(firstName, lastName, email, color, animal, number, sport)));

        //print the decrypted password to the user
        System.out.println("Your decrypted password is: " + AES.decryptPassword(AES.encryptPassword(user.generatePassword(firstName, lastName, email, color, animal, number, sport)))+"\n");
       
        //Generate a second user object
        User user2 = new User(firstName, lastName, email, color, animal, number, sport);

        //ask this second user to enter their first name, last name, email, color, animal, number, and sport
        //let the user know that this is the second user
        System.out.println("This is the second user"+"\n");
       
        //ask the user to enter their first name, last name, email, color, animal, number, and sport
        System.out.println("Enter your first name: ");
        String firstName2 = scan.nextLine();
        //get user's last name
        System.out.println("Enter your last name: ");
        String lastName2 = scan.nextLine();
        //get user's email
        System.out.println("Enter your email: ");
        String email2 = scan.nextLine();
        //get user's favorite color
        System.out.println("Enter your favorite color: ");
        String color2 = scan.nextLine();
        //get user's favorite animal
        System.out.println("Enter your favorite animal: ");
        String animal2 = scan.nextLine();
        //get user's favorite number
        System.out.println("Enter your favorite number: ");
        String number2 = scan.nextLine();
        //get user's favorite sport
        System.out.println("Enter your favorite sport: ");
        String sport2 = scan.nextLine();

        //print out the username and password for the second user
        System.out.println("Your password is: " + user2.generatePassword(firstName2, lastName2, email2, color2, animal2, number2, sport2));
         //print the encrypted password to the second user
        System.out.println("Your encrypted password is: " + AES.encryptPassword(user2.generatePassword(firstName2, lastName2, email2, color2, animal2, number2, sport2)));
        //print out the decryped password for the second user
        System.out.println("Your decrypted password is: " + AES.decryptPassword(AES.encryptPassword(user2.generatePassword(firstName2, lastName2, email2, color2, animal2, number2, sport2)) ));
      
}
     //Create a getPassword method that will return the password of the user 
    public String getPassword() {
    return null;
}
    public static String getPassword(User user) {
    return user.getPassword();
}


}

