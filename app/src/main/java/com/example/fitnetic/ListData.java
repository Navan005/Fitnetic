package com.example.fitnetic;

public class ListData {
    private String image;
    private String name;
    private String description;

    public  ListData(){


    }

    public ListData(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;

    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }
}
