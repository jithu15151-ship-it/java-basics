package com.mycompany.program2;
class arthematic
       {
 int a,b;
 void add()
 {
     System.out.println("addition="+(a+b));
 }
 void sub()
 {
     System.out.println("subraction="+(a-b));
 }
 void mul()
 {
     System.out.println("multiplication="+(a+b));
 }
 void div()
 {
     System.out.println("division"+(a/b));
 }
}

public class Program2 {

    public static void main(String[] args) {
        arthematic object = new arthematic();
      object.a=10;
      object.b=5;
      object.add();
      object.sub();
      object.mul();
      object.div();
    }
}
