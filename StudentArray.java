import java.util.Scanner;

class Student
{
    private int register_number;
    private String name;
    private int m1;
    private int m2;
    private int m3;
    private int age;
    private double avg;

    // Constructor
    public Student(int age, int m1, int m2, int m3,
                   String name, int register_number, double avg)
    {
        this.age = age;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.name = name;
        this.register_number = register_number;
        this.avg = avg;
    }

    // Getters

    public int getRegisterNumber()
    {
        return this.register_number;
    }

    public String getName()
    {
        return this.name;
    }

    public int getM1()
    {
        return this.m1;
    }

    public int getM2()
    {
        return this.m2;
    }

    public int getM3()
    {
        return this.m3;
    }

    public int getAge()
    {
        return this.age;
    }

    public double getAvg()
    {
        return this.avg;
    }

    // Setters

    public void setRegisterNumber(int register_number)
    {
        this.register_number = register_number;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setM1(int m1)
    {
        this.m1 = m1;
    }

    public void setM2(int m2)
    {
        this.m2 = m2;
    }

    public void setM3(int m3)
    {
        this.m3 = m3;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setAvg(double avg)
    {
        this.avg = avg;
    }
}

public class StudentArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int num = sc.nextInt();

        Student[] arr = new Student[num];

        for(int i = 0; i < num; i++)
        {
            System.out.println("\nEnter Student " + (i + 1) + " Details");

            System.out.print("Enter Register Number: ");
            int register_number = sc.nextInt();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Mark 1: ");
            int m1 = sc.nextInt();

            System.out.print("Enter Mark 2: ");
            int m2 = sc.nextInt();

            System.out.print("Enter Mark 3: ");
            int m3 = sc.nextInt();

            sc.nextLine(); // Clear leftover Enter

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            // Calculate average
            double avg = (m1 + m2 + m3) / 3.0;

            // Create Student object
            arr[i] = new Student(
                age,
                m1,
                m2,
                m3,
                name,
                register_number,
                avg
            );
        }

        // Display student details
        System.out.println("\n========== STUDENT DETAILS ==========");

        for(int i = 0; i < num; i++)
        {
            System.out.println("\nStudent " + (i + 1));

            System.out.println("Register Number : "
                    + arr[i].getRegisterNumber());

            System.out.println("Name            : "
                    + arr[i].getName());

            System.out.println("Age             : "
                    + arr[i].getAge());

            System.out.println("Mark 1          : "
                    + arr[i].getM1());

            System.out.println("Mark 2          : "
                    + arr[i].getM2());

            System.out.println("Mark 3          : "
                    + arr[i].getM3());

            System.out.println("Average         : "
                    + arr[i].getAvg());
        }

        sc.close();
    }
}
