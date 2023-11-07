package com.CK.lesson015.PC.entity;

public class HardDisk extends MainInfo {

    public HardDisk(String mPortals, double mSize, String mElectricalConnection, String mModel){
        super(mPortals,mSize,"Mother board", mModel);
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "portals='" + portals + '\'' +
                ", size=" + size +
                ", electricalConnection='" + electricalConnection + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
