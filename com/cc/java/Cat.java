package com.cc.java;

public class Cat {

    private String firstName;
    private String furColor;
    private int age; 

    public Cat(String firstName, String furColor, int age) {
        this.firstName = firstName;
        this.furColor = furColor;
        this.age = age;

    }

    public String getFirstName() {
        if (getPermission()) {
            return firstName;
        } else {
            return "Sorry, no permission!";
        }
    
    }

        // GETTER
    public String getFurColor() {
        return furColor;
    }


    public int getAge() {
        return age;
    }


        // SETTER

        public void setAge(int age) {
            this.age = age;
        }

    public Cat getInstanceVariable(){
       return this;
    }

    
    private boolean getPermission(){
        return true;
        // return false;

}

}
