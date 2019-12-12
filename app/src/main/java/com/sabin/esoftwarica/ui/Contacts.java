package com.sabin.esoftwarica.ui;

public class Contacts {
    private int imageId;
    private String name;
    private String age;
    private String gender;
    private String location;
    private String delimgID;


    public Contacts(String name, String age, String gender, String location, int imageId, String delimgID){
        this.imageId = imageId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.delimgID = delimgID;

    }

    public int getImageId() { return imageId; }
    public void setImageId(int imageId) { this.imageId = imageId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }


    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getLocation() { return location; }
    public void getlocation(String location) { this.location = location; }


    public String getDelimgID() { return delimgID; }
    public void setDelimgID(String delimgID) { this.delimgID = delimgID;}
}
