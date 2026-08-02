package com.mycompany.mark;

import java.util.Scanner;

public class Mark {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A MARK:");
        int mark =sc.nextInt(); 
    String marks = (mark>85)?"medical course":
            (mark>=75)?"Engineering course":
            (mark>=60)?"arts and science":
            (mark>=40)?"diplamo":
            (mark>=35)?"pass":"fail";
    System.out.println(marks);
    }
}
