package org.example.pack2;

import org.example.pack1.Student;

public class College extends Student
{
    public static void main(String[] args) {
        College college=new College();
        System.out.println(college.age);
        college.display();
    }
}
