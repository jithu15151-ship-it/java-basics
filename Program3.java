package com.mycompany.program3;
class bank
{
   int a[]={11,12,25,34,56,76,25};
   void display()
   { for(int x:a)
   {
   if(x%2==0)
   {
   System.out.println(x);
}
}
   }
}
public class EvenNumberFilter {

    public static void main(String[] args) {
        bank o=new bank();
        o.display();
    }
}
