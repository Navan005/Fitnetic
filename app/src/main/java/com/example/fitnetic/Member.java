package com.example.fitnetic;

public class Member {
    private String Image;
    private String Name;
    private String Description;


    public  Member(){


    }

    public String getName() {
        return Name;
    }

    public String getDescription() {
        return Description;
    }

    public String getImage() {
        return Image;
    }

    public void setName(String name){
        Name= name;
    }



    public void setDescription(String description) {
        Description = description;
    }



    public void setImage(String image) {
        Image = image;
    }
}
