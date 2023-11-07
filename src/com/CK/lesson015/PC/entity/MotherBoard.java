package com.CK.lesson015.PC.entity;

public class MotherBoard extends MainInfo{

    public MotherBoard(String mPortals, double mSize, String mElectricalConnection, String mModel){
        super(mPortals,mSize,"Power Supply",mModel);
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "portals='" + portals + '\'' +
                ", size=" + size +
                ", electricalConnection='" + electricalConnection + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
