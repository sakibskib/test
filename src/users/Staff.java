package users;
public final class Staff extends Employee{
    private int overTimeHours;
    public Staff(){
        name=dob=gender="TBA";
        eId=0; salary=0.0f;   
        overTimeHours=0;
    }
    @Override
    public void showInfo(){
        System.out.println("Employee ID="+eId);
        //showUserInfo();
        System.out.println("Name="+name+", DoB="+dob+", Gender="+gender);
        System.out.println("overTime Hours="+overTimeHours);
    } 
}
