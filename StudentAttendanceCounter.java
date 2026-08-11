

package com.mycompany.program6;

public class StudentAttendanceCounter {

    public static void main(String[] args) {
         
       int attendence[][]={{1,0,1,0,1,1},{0,1,0,1,0,1}};
       for( int i = 0;i<attendence.length;i++)
       {int presentdays=0;
           for(int j =0;j<attendence[i].length;j++)
           {if(attendence[i][j]==1)
       {
            presentdays++;
       }
              
               
           }
            System.out.println("student="+(i+1)+"presentdays="+presentdays);
       }
       
      
    }
    
}
