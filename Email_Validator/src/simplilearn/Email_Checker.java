package simplilearn;

/*
Java String Array Contains Example
This Java String Array Contains example shows how to find a Email in 
String of Emails in Java.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Email_Checker {

       public static void main(String args[]){

        //String array
       String[] strEmails = new String[]{"abc@gmail.com", "def@yahoo", "myemail@hotmail.com", "youremail@gmail.com", 
		"sportlover@yahoo.com"};

       //Strings to find list of emails
       Scanner myObj = new Scanner(System.in);  // Create a Scanner object
       System.out.println("Enter user email");

       String userEmail = myObj.nextLine();  // Read user input
       System.out.println("User Email Address is: " + userEmail);  // Output us



        boolean contains = false;

       //iterate the String array
       for(int i=0; i < strEmails.length; i++){

       //check if string array contains the string 
       if(strEmails[i].equals(userEmail)){

       //string found
       contains = true;
       break;

          }
      }

       if(contains){
       System.out.println("String array contains String " + userEmail);
       }else{
       System.out.println("String array does not contain String " + userEmail);
      }


     }
}