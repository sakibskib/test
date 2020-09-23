package users;

import java.util.Scanner;

abstract public class User {
    protected String name, dob, gender;
    abstract public void showInfo();
    public User(){}
    public User(String name, String dob, String gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        //this.dept = dept;
    }

    //public String getDept() {        return dept;    }

    //public void setDept(String dept) { this.dept = dept; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setUserInfo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = s.nextLine();
        System.out.print("Enter Date of Borth (dd/mm/yyyy): ");
        dob = s.nextLine();
        System.out.print("Enter Gender(M/F/T): ");
        gender = s.nextLine();
    }
    
    public void showUserInfo(){
        System.out.println("Name="+name+", DoB="+dob+", Gender="+gender);
    }    
    
    public void showDoB(){
        System.out.println("DoB="+dob);
    }
    public void showDoB(String stName){
        System.out.println(stName+"'s Date of Birth="+dob);
    }
    
}
