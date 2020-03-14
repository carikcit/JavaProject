import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int defaultPasswordLength= 6;
    private String email;
    private int mailboxCapacity= 500;
    private String alternateEmail;
    public String companySuffix = "aeycompany.com";

    //Constructor to receive the firstname and last
    public Email(String firstName, String lastName){
        this.firstName= firstName;
        this.lastName= lastName;
        //System.out.println("Email CREATED: " + this.firstName + " " + this.lastName);

        //call a method asking for the department= return department
        this.department= setDepartment();
        //System.out.println("Department" + this.department);

        // Ask for the department asking for random password
        this.password= randomPassword(defaultPasswordLength);
        System.out.println("YOUR PASSWORD IS: " + this.password);

        //combine elements to generate email
        email= firstName.toLowerCase()+ "." + lastName.toLowerCase()+ "@" + department +"."+ companySuffix;
        //System.out.println("YOUR EMAil IS  "+ email);
    }

    // Ask for the department

    private String setDepartment(){
        System.out.print("DEPARTMENT CODES\n1 for sale\n2 for Development\n3 for Accounting\n0 for None\n Enter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if(depChoice == 1 ){ return " Sales"; }
        else if (depChoice == 2){ return " Dev";}
        else if (depChoice == 3){ return " Acct";}
        else{return "";}

    }
//Generate a random password
    private  String randomPassword(int length){
        String passwordSet ="ABCDEFGHIJKLMNOPRSTXYVZ1234567890!@#$%&*";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand= (int)(Math.random()* passwordSet.length());
            password[i]=passwordSet.charAt(rand);
        }
        return new String(password);
    }


//
//    Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity= capacity;

    }
//    Set alternate email
    public void setAlternateEmail (String altEmail){
        this.alternateEmail = altEmail;
    }

//    Change the password
    public void changePassword(String password){
        this.password=password;
    }

    //getter methods
    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}
    private String getPassword(){ return password;}

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + lastName + ","+
                " \nCOMPANY EMAIL: " + email + ","+
                " \nMAILBOX CAPACITY: " + mailboxCapacity + "mb ";
    }


}
