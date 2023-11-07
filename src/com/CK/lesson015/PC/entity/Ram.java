package com.CK.lesson015.PC.entity;

public class Ram extends MainInfo{

    private String type;

    public Ram(String mPortals, double mSize, String mElectricalConnection, String mModel){
        super(mPortals,mSize,"Mother board", mModel);
        System.out.println(ramQuality(mModel));
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String ramQuality(String mModel){
        String quality = null;
        if (mModel.equals("DDR4")){
            quality = "Known for fast data transfer speeds and low energy consumption";
        }
        if (mModel.equals("DDR3")) {
            quality = "It is an older standard and can still be found on many older computers.";
        }
        if (mModel.equals("DDR2")) {
            quality = "It can often be found on obsolete or antique computers.";
        }
        return quality;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "type='" + type + '\'' +
                ", portals='" + portals + '\'' +
                ", size=" + size +
                ", electricalConnection='" + electricalConnection + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
