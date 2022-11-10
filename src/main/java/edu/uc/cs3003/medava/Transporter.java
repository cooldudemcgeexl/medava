package edu.uc.cs3003.medava;

import java.util.ArrayList;

public class Transporter {
    { goods = new ArrayList<Medicine>() {
        
    };}
    
    private String mTransporterName;

    public String getTransporterName() {
        return mTransporterName;
    }

    public ArrayList<Medicine> goods;

    public void ship() {
        // Do some shipping!
    }
}