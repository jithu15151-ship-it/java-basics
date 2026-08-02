
package com.mycompany.divisible;
import java.util.Scanner;
public class Divisible {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num=sc.nextInt();
         String nums=((num%5==0)&&(num%3==0))?"welcome":
         (num%3==0)?"hi":
         (num%5==0)?"hello":"not divisile by 3 and 5";
                System.out.println(nums);
                 
        
    }
}
