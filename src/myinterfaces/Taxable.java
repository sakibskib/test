package myinterfaces;

import users.*;

public interface Taxable {
    //static final float mimTaxAmount=0.0f;
    //float mimTaxAmount=0.0f;
    //float mimTaxAmount=1000.0f;
    public void calcTaxPayable();
    abstract public void viewTaxAmount();    
}
