package email_ID;

import java.util.regex.*;    
import java.util.*;    
public class EmailValidation{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
          
        emails.add("java@domain.co.in");  
        emails.add("java@domain.com");  
        emails.add("java.name@domain.com");  
        emails.add("java#@domain.co.in");  
        emails.add("core'java@domain.com");  
        //Add invalid mails in list  
        emails.add(".java@yahoo.com");  
        emails.add("java@domain.com.");  
        emails.add("java#domain.com");  
        emails.add("java@domain..com");  
        //Regular Expression   
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate mails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
}  