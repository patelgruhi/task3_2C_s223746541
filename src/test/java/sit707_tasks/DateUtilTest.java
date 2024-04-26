package sit707_tasks;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;



public class DateUtilTest {

    
	public void testStudentIdentity() 
	{
		 String studentId = "s223746541";
		 org.junit.Assert.assertNotNull(studentId);
	}
		 @Test
	 public void testStudentName() 
	{
		 String studentName = "Gruhi";
		 org.junit.Assert.assertNotNull(studentName);
	}

	
    @Test
    public void tEquivalenceClasses() {
       
    	//Day
        DateUtil daydate1 = new DateUtil(15, 4, 2024);
        daydate1.increment();
        assertEquals(16, daydate1.getDay());

       
        DateUtil daydate2 = new DateUtil(29, 2, 2024);
        daydate2.increment();
        assertEquals(1, daydate2.getDay());

       
        DateUtil daydate3 = new DateUtil(30, 6, 2024);
        daydate3.increment();
        assertEquals(1, daydate3.getDay());

     
        DateUtil daydate4 = new DateUtil(31, 1, 2024);
        daydate4.increment();
        assertEquals(1, daydate4.getDay());
    }

   
    @Test
    public void testMonthEquivalenceClasses() {
       
    	//Month
        DateUtil monthdate1 = new DateUtil(30, 4, 2024);
        monthdate1.increment();
        assertEquals(1, monthdate1.getDay());

        
        DateUtil monthdate2 = new DateUtil(31, 7, 2024);
        monthdate2.increment();
        assertEquals(1, monthdate2.getDay());

        
        DateUtil monthdate3 = new DateUtil(28, 2, 2024);
        monthdate3.increment();
        assertEquals( 29, monthdate3.getDay());
    }

   
    @Test
    public void testYearEquivalenceClasses() {
      
    	//Year
        DateUtil yeardate1 = new DateUtil(28, 2, 2024);
        yeardate1.increment();
        assertEquals(29, yeardate1.getDay());

      
        DateUtil yeardate2 = new DateUtil(28, 2, 2023);
        yeardate2.increment();
        assertEquals(1, yeardate2.getDay());
    }
}
	

