package com.mycompany.program7;
public class Program7 {

    public static void main(String[] args) {
        int units=350;
        if(units<=100)
        {
            System.out.println("low consumption");
        }
        else if(units<=300)
        {
            System.out.println("medium consumtion");
        }
        else
        {
            System.out.println("high consumption");
        }
    }
}
