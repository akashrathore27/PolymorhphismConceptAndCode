package org.example.pack1;

public class Department extends Student
{
    protected String department="MCA";

    public void displayDept()
    {

        System.out.println("Department is "+department);
    }

    public static void main(String[] args) {
        Department student=new Department();

        student.displayDept();
        student.display();

    }


}
