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
import java.util.Set;
import java.util.TreeMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ruturaj
 */
public class CourseTest {
     List<Student> st = new ArrayList<Student>();
    Student s = new Student("Bill Smith", "c0123456", "male", 89.3 );
      
    
    
    public CourseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // Student s = new Student("Bill Smith", "c0123456", "male", 89.3 );
         st.add(s);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Course.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Student s = new Student("Bill Smith", "c0123456", "male", 89.3 );
        Course instance = new Course();
        instance.add(s);
        assertEquals(st, instance.getAll());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_Student() {
        System.out.println("remove");
        List<Student> expResult1 = new ArrayList<Student>();
        Course instance = new Course(st);
        instance.remove(s);
        assertEquals(expResult1, instance.getAll());
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_String() {
        System.out.println("remove");
        String id = "c0123456";
        Course instance = new Course(st);
        List<Student> expResult1 = new ArrayList<Student>();
        instance.remove(id);
        assertEquals(expResult1, instance.getAll());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Course.
     */
    @Test
    public void testRemove_int() {
        System.out.println("remove");
        
        int postion = 0;
        //Course instance = new Course();
        Course instance = new Course(st);
        instance.remove(postion);
        List<Student> expResult1 = new ArrayList<Student>();
        assertEquals(expResult1, instance.getAll());
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class Course.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
         Course instance = new Course();
        int position = 0;
        instance.insert(s, position);
        assertEquals(st, instance.getAll());
        
 
    }

 
    @Test
    public void testGetAll() {
        
        System.out.println("getAll"); 
        Course instance = new Course(st); 
        List<Student> expResult2 = st; 
        List<Student> result2 = instance.getAll(); 
        assertEquals(expResult2, result2);
        
    }
    
    @Test
    public void testGet() {
        
        System.out.println("get");
        Course instance = new Course(st); 
        String id = "c0123456"; 
        List<Student> expResult2 = st; 
        List<Student> result2 = instance.getAll(); 
        assertEquals(expResult2, result2);
        }
     @Test
    public void testGetPosition() {
        
        System.out.println("GetPosition");
        Student s = new Student();
        Course instance = new Course(st);
        
        String expResult = null;
        int pos= 1;
         if(pos >=st.size()||pos<=st.size()){
            s= instance.getPos(pos);
             
        }
        assertEquals(expResult, s);
        }
     @Test
    public void testGetValidID() {
        
        System.out.println("getValidID");
       
        Course instance = new Course(st);
        List<Student> result2= new ArrayList<Student>();;
         
        
        List<Student> expResult = instance.getAll();
        int pos= 1;
         if(st.contains(s)){
             result2 = instance.getAll();
             
        }
        assertEquals(expResult, result2);
        }

@Test
    public void testGetInValidID() {
        
        System.out.println("GetInvalidID"); 
        Course instance = new Course(st);
        List<Student> result2= new ArrayList<Student>();;
         
        String result="Z123" ;
        List<Student> expResult = null;
        
         if(st.contains(result)){
             
              
        } else{
             result2 = null;
         }
        assertEquals(expResult, result2);
        }

    
    /**
     * Test of getAllByGender method, of class Course.
     */
    @Test
    public void testGetAllByGender() {
        System.out.println("getAllBygender");
        String gender = "male";
        Course instance = new Course(st);
        Set<Student> expResult = new HashSet<Student>();
        expResult.add(s);
        Set<Student> result = instance.getAllByGender(gender);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getGradeMap method, of class Course.
     */
    @Test
    public void testGetGradeMap() {
        System.out.println("getGradeMap");
        Course instance = new Course(st);
        Map<String, Set<Student>> expResult = new TreeMap<>();
        Set<Student> g = new HashSet<Student>();
        g.add(st.get(0));
        expResult.put("A", g);
        Map<String, Set<Student>> result = instance.getGradeMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Course instance = new Course();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        
    }
 @Test
    public void testEqualsContains() {
        System.out.println("equals");
       
        boolean expResult = true;
        boolean result =  false;
       
          Student s3 = new Student("Ruturaj", "99q9", "M", 32.23);
             List<Student> s1= new ArrayList<Student>();
            s3.setName("Ruturaj");
            s3.setId("655987");
            s3.setGender("M");
            s3.setGrade(3.84);
            s1.add(s3);
        Course c1= new Course(s1);
        Course c2 = new Course(s1);
        if(c1.equals(c2)){
            result = true;
        }
         assertEquals(expResult, result);
    }
    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Course instance = new Course(st);
        String expResult = "[\n"+"\t{ \"name\" : \"Bill Smith\", \"id\" : \"c0123456\", \"gender\" : \"male\", \"grade\" : 89.3 }"
                + "\n]";
        String result = instance.toString();
        assertEquals(expResult, result);
     
    }
    
}
