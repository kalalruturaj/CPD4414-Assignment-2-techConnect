/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd.pkg4414.assignment.pkg2.techconnect;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cyril Dsouza
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Student.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Student.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "R";
        Student instance = new Student();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Student.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Student.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        Student instance = new Student();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Student.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Student.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Student instance = new Student();
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGrade method, of class Student.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Student instance = new Student();
        double expResult = 0.0;
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setGrade method, of class Student.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        double grade = 0.0;
        Student instance = new Student();
        instance.setGrade(grade);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Student.
     */
 
    /**
     * Test of equals method, of class Student.
     */
  
     @Test
    public void testEqualsSameObject() {
        System.out.println("equals");
        Student instance = new StudentImp();
        Student instance1 = new StudentImp();
           boolean expResult = true;
         boolean result=false;
         
         if(instance.equals(instance1)){
             result = true;
         }
          
             assertEquals(instance, instance1);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testEqualsSameNameAndId() {
        System.out.println("equals");
          
        Student instance = new Student();
        Student instance1 = new Student();
       instance.setName("Ruturaj");
         instance1.setName("Ruturaj");
         instance.setId("10");
         instance1.setId("10");
         boolean result = false;
         boolean expResult = true;
       
         if(instance.getName()==instance1.getName() && instance.getId()==instance1.getId()){
            result= true;
        }
             assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
        @Test
    public void testEqualsSameNameAndDiffID() {
        System.out.println("equals");
        
        Student instance = new Student();
        Student instance1 = new Student();
       instance.setName("Ruturaj");
         instance1.setName("Ruturaj");
         instance.setId("101");
         instance1.setId("10");
         boolean result = true;
         boolean expResult = false;
       
         if(instance.getName()==instance1.getName() && instance.getId()!=instance1.getId()){
            result= false;
        }
             assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     @Test
    public void testEqualsDiffNameAndDiffID() {
        System.out.println("equals");
        Student instance = new Student();
        Student instance1 = new Student();
       instance.setName("Ruturaj");
         instance1.setName("Kalal");
         instance.setId("10");
         instance1.setId("110");
         boolean result = true;
         boolean expResult = false;
       
         if(instance.getName()!=instance1.getName() && !instance.getId().equals(instance1.getId())){
            result= false;
        }
             assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("Bill Smith", "c0123456", "male", 89.3);
        
        String expResult = "{ \"name\" : \"Bill Smith\", \"id\" : \"c0123456\", \"gender\" : \"male\", \"grade\" : 89.3 }";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
     
  public class StudentImp extends Student{
         
     }
    
   
}
