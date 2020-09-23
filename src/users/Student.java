package users;

import java.util.Scanner;

public final class Student extends User {
    private int id; private float cgpa;
    private static String uniName;
    public Student(){
        name=dob=gender="TBA";
        id=0; cgpa=0.0f;
    }
    public Student(int id, String name, float cgpa, String dob, String gender){
        this.id = id;
        this.name=name;
        this.cgpa=cgpa;
        this.dob=dob;
        this.gender=gender;
    }    
    //public void setStudInfo(){
    public Student setStudInfo(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = s.nextInt();
        this.setUserInfo();
        System.out.print("Enter cgpe: "); 
        cgpa = s.nextFloat();
        return this;
    }

    public float getCgpa() {
        return cgpa;
    }

    public static void setUniName() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Uni name: ");
        Student.uniName = s.nextLine();
    }
    
    public static void setUniName(String uniName) {
        Student.uniName = uniName;
    }
    public static void showUniName() {
        System.out.println("uniName ="+uniName);
    }  
    
    @Override
    public void showInfo(){
        System.out.println("ID="+id);
        showUserInfo();
        System.out.println("Cgpa="+cgpa);
        System.out.println("Uni name="+uniName);
     }
    
    @Override
    public void showDoB(){
        System.out.println("Student's birthday is on: "+dob);
    }
    
    @Override
    public String toString(){
        return "Id="+id+", Name="+name+", DoB="+dob+", Gender="+gender+", Cgpa="+cgpa;
    }
}
