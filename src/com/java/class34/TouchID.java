package com.java.class34;

public class TouchID extends IphoneBase {

    public TouchID(String model, String color, int memory, String ios) {
        super(model, color, memory, ios);
    }

    String fingerPrintData[] = {"sdfq13"};

    public boolean getUserTouchID(String userFingerPrint){
        boolean isUnlock = false;
        for (int i = 0; i < fingerPrintData.length; i++) {
            if (userFingerPrint.equals(fingerPrintData[i])) {
                isUnlock = true;
            }
        }
        return isUnlock;
    }
}