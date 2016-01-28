/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd.pkg4414.assignment.pkg2.techconnect;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cyril Dsouza
 */
public class CPD4414Assignment2TechConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<Course> s =   new ArrayList<Course>();
       
           Student s2 = new Student("Ruturaj", "999", "M", 32.23);
            Student s4 = new Student("Ruturaj", "a999", "M", 32.23);
            Student s3 = new Student("Ruturaj", "99q9", "M", 32.23);
            
            List<Student> s1= new ArrayList<Student>();
            List<Student> sl1= new ArrayList<Student>();
            List<Student> sl12= new ArrayList<Student>();
            sl12.add(s4);
            
            s2.setName("Ruturaj");
            s2.setId("655987");
            s2.setGender("M");
            s2.setGrade(3.84);
            
           
            
            s3.setName("Ruturaj");
            s3.setId("655987");
            s3.setGender("M");
            s3.setGrade(3.84);
            
            s1.add(s3);
            s1.add(s2);
            s4.setName("Ruturaj");
           
  
             Course c=new Course(s1);
             Course c2=new Course(sl12);
         
        
             Course c1 = new Course(sl1);
 
            c1.add(s4);
        
            System.out.println( c1.toString());
            System.out.println( c1.getName());
            
            System.out.println(c.toString());
            
            System.out.println("heloooo"+c.getGradeMap());
        
            c.add(s3);
        
            c.add(c);
        
            c.add(c);
       
            c.add(c);
        
            c.add(c);
        
        c.remove(c);
        c.getId();
        c1.add(s3);
        c.getAllByGender("M");
        System.out.println(c.getAllByGender("M"));
        System.out.println(c.getGender().toString());
        System.out.println(c.getGrade());
        System.out.println("Hello");
        System.out.println( c.getPos(0).toString());
        System.out.println( c1.getPos(1).toString());
        System.out.println("toString"+c1.toString());
        System.out.println("Get All"+c1.getAll().toString());
    }
    
}
