package email;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailBoxCapacity = 500;
    private String altEmail;
    private int passwordLength;
    private String companySuffix = "anycompany.com";
    private String email;


    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = setDepartment();
        System.out.println();
        this.passwordLength = 10;
        this.password = randomPassword(passwordLength);
        if (department.equals("")){
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + companySuffix;
        } else{
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
        }
    }

    private String setDepartment(){
        System.out.println("DEPARTMENT CODES \n1: Sales\n2: Development\n3: Accounting\n0: None");
        System.out.print("> ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if (depChoice==1){
            return "Sales";
        } else if (depChoice==2){
            return "Dev";
        } else if(depChoice==3){
            return "Act";
        } else{
            return "";
        }
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&*";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    public void setAltEmail(String altEmail){
        this.altEmail = altEmail;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public int getMailBoxCapacity() {
        return mailBoxCapacity;
    }

    public String getPassword() {
        return password;
    }

    public String getAltEmail() {
        return altEmail;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanySuffix() {
        return companySuffix;
    }

    public int getPasswordLength() {
        return passwordLength;
    }

    public String showInfo(){
        return "Employee Info:" +
                "\nNAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nPASSWORD: " + password +
                "\nMAILBOX CAPACITY: " + mailBoxCapacity + "mb";
    }
}
