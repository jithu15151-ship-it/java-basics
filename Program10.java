package com.mycompany.program10;
class add
{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
}
public class AdditionOverloading {

    public static void main(String[] args) {
       add o = new add();
       int ad=o.add(10,21);
       int ad1=o.add(23,32,32);
       System.out.println("ADDITION OF TWO NUMBERS:"+ad+"\n"+"ADDITION OF THREE NUMBERS:"+ad1);
    }
}
