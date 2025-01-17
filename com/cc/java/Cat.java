package com.cc.java;

public class Cat {

    public String firstName;
    public String furColor;
    public int age; 

    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;


    }



    public Cat getInstanceVariable(){
       return this;
    }
    


}
