
package com.mycompany.program1;
class student
{
     String name;
    int rno;
    void display()
    {
        System.out.println("name:"+name);
         System.out.println("roll no:"+rno);
    }
}
public class Program1 {
       public static void main(String[] args) {
        student obj=new student();
        obj.name="jithu";
        obj.rno=022;
        obj.display();
    }
}
