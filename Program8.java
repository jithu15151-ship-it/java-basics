
package com.mycompany.program8;
class employee
{
    String name;
    int id;
    int sal;
    employee(){
    
}
    employee(String name,int id,int sal)
    {
        this.name=name;
        this.id=id;
        this.sal=sal;
    }
    employee(employee e)
    {
        this.name=e.name;
        this.id=e.id;
        this.sal=e.sal;
        
    }
}

public class Program8 {

    public static void main(String[] args) {
        employee obj =new employee();
        employee ob =new employee("jithu",22,30000);
        employee o =new employee(ob);
        System.out.println("name:"+obj.name);System.out.println("id:"+obj.id);System.out.println("salary:"+obj.sal);
        System.out.println("name:"+ob.name);System.out.println("id:"+ob.id);System.out.println("salary:"+ob.sal);
        System.out.println("name:"+o.name);System.out.println("id:"+o.id);System.out.println("salary:"+o.sal);
        
        
        
    }
}
