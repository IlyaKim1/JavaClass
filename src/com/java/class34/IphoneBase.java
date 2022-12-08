package com.java.class34;

public class IphoneBase {
    private String model;
    private String color;
    private int memory;
    private String ios;

    public IphoneBase(String model, String color, int memory, String ios){

        this.model = model;
        this.color = color;
        this.memory = memory;
        this.ios = ios;

    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getIos() {
        return ios;
    }

    public void setIos(String ios) {
        this.ios = ios;
    }


    String iMessage (String userMessage){

        return userMessage;

    }
    String notes (String userNotes){

        return userNotes;

    }

    public String whichIphone(IphoneBase baseIphone){

        baseIphone.getColor();
        baseIphone.getIos();
        baseIphone.getModel();
        baseIphone.getMemory();

        return baseIphone.getModel()+ " " + baseIphone.getColor()+ " " + baseIphone.getMemory()+ " " + baseIphone.getIos();

    }
}
