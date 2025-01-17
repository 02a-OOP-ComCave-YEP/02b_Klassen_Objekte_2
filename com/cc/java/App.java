package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat ("Grizabella", "white", 29);
        // output("Blick von aussen: " + cat);
        // output("Blick von innen: " + cat.getInstanceVariable());

    

        // Werte ausgeben
        output(cat.firstName);
        output(cat.furColor);
        output(Integer.toString(cat.age)); // EXPLIZITE Typkonvertierung

        output("-----------------------");

        Cat cat2 = new  Cat("Alonzo", "grey", 35);
        // output("Blick von aussen: " + cat2);
        // output("Blick von innen: " + cat2.getInstanceVariable());
     
        


        output(cat2.firstName);
        output(cat2.furColor);
        output(Integer.toString(cat2.age));

    }

  
    public static void output(String outputStr){
        System.out.println(outputStr);
    }


}

