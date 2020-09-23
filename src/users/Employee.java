package users;

import myinterfaces.Taxable;

 public abstract class Employee extends User implements Taxable{
    protected int eId;
    protected float salary, taxAmount;
    abstract public void showInfo();
    @Override
    public void viewTaxAmount(){
        System.out.println("Tax Amount is: "+taxAmount);
    }

    @Override public void calcTaxPayable(){
        //own code to calc taxAmount
        taxAmount = salary*.20f;
        //assuming that tax amount is 20% for ALL employees
    }
 }
