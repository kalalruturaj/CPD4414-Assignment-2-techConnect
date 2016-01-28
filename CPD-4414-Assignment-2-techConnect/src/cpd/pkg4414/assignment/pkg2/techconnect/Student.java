/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd.pkg4414.assignment.pkg2.techconnect;

/**
 *
 * @author c0655987
 */

public class Student {
   private String name;
   private String id;
   private String gender;
   private double grade;

    public Student() {
           name="";
           id="";
           gender ="";
           grade=0;
    }

    public Student(String name, String id, String gender, double grade) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.grade = grade;
    }

   
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

   
    @Override
    public boolean equals(Object obj) {
        
        
         boolean rs=false;
        if(obj instanceof Student){
            Student p = (Student) obj;
        
            if(this.name.equals(p.name) && this.id == p.id){
                System.out.println("Name & ID same");
                return true;
            } else
            if(this.name ==p.name && this.id !=p.id){
                System.out.println("ID is not same");
                return false;
                 
            } 
            //this.name="AAAA";
            if(this.name !=p.name && this.id ==p.id){
                System.out.println("Name is not same");
               return  false;
            } else
            if(this.name !=p.name && this.id !=p.id){
                System.out.println("ID is not same");
                System.out.println("Diff");
                return false;
            }
           
              else
            {
                rs= false;
                
            } 
             
         
        }
         return true;
       
    }

    @Override
    public String toString() {
        return "{" + " \"name\" : \"" + name + "\", \"id\" : \"" + id + "\", \"gender\" : \"" + gender + "\", \"grade\" : " + grade +" }";
    }

    
   
    
}
