package sample;


import java.util.Random;

public class Email {
    //Attributes of Email
    private String companyName;
    private String firstName;
    private String secondName;
    public String department;
    private final int default_Password_length = 8;
    private String password;
    private String email;

    public Email(String cmpName){
        this.companyName = cmpName;
        this.email = "";
        this.password = "";
    }
    public void setName(String first, String second){
        this.firstName = first;
        this.secondName = second;
    }
    public void setDepartment(String dep){
        this.department = dep;
    }

    public String generatePassword(){
        String temp = "ABCDEFGHIJKLMNOPQabcdefghijqlmnopq1234567890@#&^$";
        this.password = "";
        for(int i=0; i<this.default_Password_length;i++) {
            Random rand = new Random();
            int random = rand.nextInt(temp.length());
            password += temp.charAt(random);
        }
        return this.password;
    }

    //Creates Email
    public String createEmail(){
        this.email = "";
        this.email += this.firstName.toLowerCase() + "." + this.secondName.toLowerCase() + "@" + this.department.substring(0,3).toLowerCase() + "." +
                this.companyName.toLowerCase() + ".com";
        return  this.email;
    }
}
