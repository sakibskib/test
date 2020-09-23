package users;
public final class Faculty extends Employee{
    private String researchExp;
    public Faculty(){
        name=dob=gender=researchExp="TBA";
        eId=0; salary=0.0f;   
    }
    @Override
    public void showInfo(){
        System.out.println("Employee ID="+eId);
        //showUserInfo();
        System.out.println("Name="+name+", DoB="+dob+", Gender="+gender);
        System.out.println("Research Exp="+researchExp);
    }    
}
