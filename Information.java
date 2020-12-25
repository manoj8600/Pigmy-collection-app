package com.example.pigme;

public class Information {

    private String name;
    private String phone;

    public Information(){
    }

    public Information(String name, String phone){
        this.name = name;
        this.phone = phone;

    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(){
        this.phone = phone;
    }

}
