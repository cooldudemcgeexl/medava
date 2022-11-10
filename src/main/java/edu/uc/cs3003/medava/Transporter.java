package edu.uc.cs3003.medava;

import java.util.ArrayList;

public class Transporter {
    { goods = new ArrayList<Medicine>() {
        
    };}
    public Transporter(String transporterName, double lowTemp, double highTemp) {
        mTransporterName = transporterName;
        mLowTemperature = lowTemp;
        mHighTemperature = highTemp;
    }
    private String mTransporterName;

    public String getTransporterName() {
        return mTransporterName;
    }

    private ArrayList<Medicine> goods;

    public void ship() {
        // Do some shipping!
    }

    private double mLowTemperature, mHighTemperature;
    
    public boolean load(Medicine itemToLoad) {
        if (itemToLoad.isTemperatureRangeAcceptable(mLowTemperature, mHighTemperature)) {
            System.out.println(String.format("Adding a %s to the transporter.", itemToLoad.getMedicineName()));
            goods.add(itemToLoad);
            return true;
        }
        return false;
    }

    public Medicine unload() {
        return goods.remove(0);
    }
    public boolean isEmpty() {
        return goods.isEmpty();
    }
}