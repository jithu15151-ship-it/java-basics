package com.mycompany.program5;

public class Program5 {

    public static void main(String[] args) {
        int[]score={54,23,65,87,34};
        int highest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int x:score)
        {
            if(x>highest)
            {
                second=highest;
                highest=x;
            }
            else if(x>second&&x!=highest){
                second=x;
            }
        }
        System.out.print("highest mark is :"+(highest));
    }
        
    
}
