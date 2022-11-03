package homeworks.studentgradesystem;

public class Teacher {

    String name;
    String phoneNumber;
    String branch;

    public Teacher(String theName, String theBranch, String thePhoneNumber){
        name = theName;
        branch = theBranch;
        phoneNumber = thePhoneNumber;
    }

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Branch: " + branch);
    }

}
