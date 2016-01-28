/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd.pkg4414.assignment.pkg2.techconnect;

 
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
/**
 *
 * @author c0665336
 */
 
public class Course extends Student{
    private List<Student> students = new ArrayList<>();
 Student s = new Student("Bill Smith", "c0123456", "male", 89.3 );
    public Course() {
       //super("", "", "", 0);
    }

    public Course(List<Student> student) {
        this.students = student;
    }
     
    public void add(Student student){
         students.add(student);
     }
    public void remove(Student student){
        students.remove(student);
    } 
    public void remove(String id){
           for(int i=0; i<students.size();i++){
            
            if(id.equals(students.get(i).getId())){
                 
                this.students.remove(students.get(i));
            }
            
        }
    }
    public void remove(int position){
         for(int i=0; i<students.size();i++){
            
            if(position==i){
                 
                this.students.remove(students.get(i));
            }
            
        }
    }
    public void insert(Student student, int position){
        students.add(position,student);
    }
 
    public Student getPos(int position){
        
        if(position>=students.size()){
            return null;
        }  
        return students.get(position);
         
    }
    
    public Student get(String id){
        students.add(s);
        
        if(students.contains(id)){
           Course c = new Course();
          return  (Student) c.getAll();
        }
        return null ;
    }
    public List<Student> getAll(){
 
         
            return this.students;
       
    }
 
     public Set<Student> getAllByGender(String gender){
         
         Set<Student> studentGender = new HashSet<Student>();
        
        for(int i=0; i<this.students.size();i++){
            
            if(this.students.get(i).getGender().equals(gender)){
                
                studentGender.add(this.students.get(i));
            }
        }
       // System.out.println(studentGender);
        return studentGender;
                 
     }
     public Map<String, Set<Student>> getGradeMap(){
        Map<String, Set<Student>> grade = new TreeMap<>();
        
        Set<Student> gradeA = new HashSet<Student>();
        Set<Student> gradeB = new HashSet<Student>();
        Set<Student> gradeC = new HashSet<Student>();
        Set<Student> gradeD = new HashSet<Student>();
        Set<Student> gradeF = new HashSet<Student>();
        
        for(int i =0;i<this.students.size(); i++){
            
            if(this.students.get(i).getGrade()>=80 && this.students.get(i).getGrade()<=100){
                
                gradeA.add(this.students.get(i));
            }
            
           else if(this.students.get(i).getGrade()>=60 && this.students.get(i).getGrade()<=79){
                
                gradeB.add(this.students.get(i));
            }
            
           else if(this.students.get(i).getGrade()>=50 && this.students.get(i).getGrade()<=59){
                
                gradeC.add(this.students.get(i));
            }
            
           else if(this.students.get(i).getGrade()>=50 && this.students.get(i).getGrade()<=49){
                
                gradeD.add(this.students.get(i));
            }
            
           else {
                
                gradeF.add(this.students.get(i));
            }
                
            
        }
        
        if (!gradeA.isEmpty())
        grade.put("A",gradeA);
        
        if (!gradeB.isEmpty())
        grade.put("B",gradeB);
        
        if (!gradeC.isEmpty())
        grade.put("C",gradeC);
        
        if (!gradeD.isEmpty())
        grade.put("D",gradeD);
        
        if (!gradeF.isEmpty())
        grade.put("F",gradeF);
        
       
        
         return grade;
     }

    @Override
    public boolean equals(Object obj) {
       
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        this.setName("Kalal");
       
         Course c = new Course(students);
         c.setName("RR");
        if(this.getName()==c.getName() && this.getId()== c.getId()&& this.getGender()==c.getGender() && this.getGrade() == c.getGrade()){
            return true;
        }
        if (!Objects.equals(this.students, other.students)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
         String msg="";
      for(int i =0;i<this.students.size();i++){  
          if(i!=this.students.size()-1){
        msg= msg +"\t{ \"name\" : \"" + this.students.get(i).getName() + "\", "
                + "\"id\" : \"" + this.students.get(i).getId() +"\", "
                + "\"gender\" : \"" +this.students.get(i).getGender() + "\", "
                + "\"grade\" : "+ this.students.get(i).getGrade() +" },\n";
          }
        else{
           msg= msg +"\t{ \"name\" : \"" + this.students.get(i).getName() + "\", "
                + "\"id\" : \"" + this.students.get(i).getId() +"\", "
                + "\"gender\" : \"" +this.students.get(i).getGender() + "\", "
                + "\"grade\" : "+ this.students.get(i).getGrade() +" }\n"; 
        }
      }
        System.out.println(msg);
        return "[\n"+msg+"]";
    }
    
    
    
    
    
}

