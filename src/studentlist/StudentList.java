/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author fnoko
 */
public class StudentList {
    public static void main(String[] args) 
    {
    // store and print student list
        Student[] list = new Student[3];
        
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setAge(21);
        
        Student s2 = new Student();
        s2.setName("Freddie");
        s2.setAge(39);
        
        Student s3 = new Student();
        s3.setName("John");
        s3.setAge(21);
        
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getAge());
        }
    }
}
