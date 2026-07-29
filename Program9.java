package com.mycompany.program9;
class shape
{
     int shape(int square)
    {
        return square*square;
    }

int shape(int len,int brth)
{
    return len*brth;
}
        }
public class Program9 {

    public static void main(String[] args) {
  shape obj=new shape();
  int a1=obj.shape(10);
  int a2=obj.shape(10,20);
  System.out.println("the are of square is:"+a1+"\n"+"area of rectangle:"+a2);
    }
}
