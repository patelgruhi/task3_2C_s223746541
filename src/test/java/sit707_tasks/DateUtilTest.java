package sit707_tasks;

import static org.junit.Assert.*;
import org.junit.Test;

public class DateUtilTest {
	@Test
	public void testStudentIdentity() 
	{
		 String studentId = "s223746541";
		 org.junit.Assert.assertNotNull(studentId);
		 System.out.println(studentId);
	}
		 @Test
	 public void testStudentName() 
	{
		 String studentName = "Gruhi";
		 org.junit.Assert.assertNotNull(studentName);
		 System.out.println(studentName);
	}

    // Equivalence class: Valid day (1 <= Day <= 31)
    @Test
    public void testIncrement_ValidDay() {
        DateUtil dateUtil = new DateUtil(10, 5, 2023);
        System.out.println(dateUtil);
        dateUtil.increment();
        System.out.println("after increment :-" + dateUtil);
        assertEquals("Day after increment should be 11", 11, dateUtil.getDay());
    }

    // Equivalence class: Invalid day (Day < 1)
    @Test(expected = RuntimeException.class)
    public void testIncrement_InvalidDay() {
        DateUtil dateUtil = new DateUtil(-1, 5, 2023);
        System.out.println(dateUtil);
        dateUtil.increment();
        System.out.println("after increment :-" + dateUtil);
        
    }

    // Equivalence class: Valid month (1 <= Month <= 12)
    @Test
    public void testIncrement_ValidMonth() {
        DateUtil dateUtil = new DateUtil(31, 12, 2023);
        System.out.println(dateUtil);
        dateUtil.increment(); // Incrementing should change month to January
        System.out.println("after increment :-" + dateUtil);
        
        assertEquals("Month after increment should be 1", 1, dateUtil.getMonth());
    }

    // Equivalence class: Invalid month (Month > 12)
    @Test(expected = RuntimeException.class)
    public void testIncrement_InvalidMonth() {
        DateUtil dateUtil = new DateUtil(1, 13, 2023);
        System.out.println(dateUtil);
        dateUtil.increment();
        System.out.println("after increment :-" + dateUtil);
        
    }

    // Equivalence class: Valid year (1700 <= Year <= 2024)
    @Test
    public void testIncrement_ValidYear() {
        DateUtil dateUtil = new DateUtil(31, 12, 2023);
        System.out.println(dateUtil);
        dateUtil.increment();
        System.out.println("after increment :-" + dateUtil);
        assertEquals("Year after increment should be 2024", 2024, dateUtil.getYear());
    }

    // Equivalence class: Invalid year (Year < 1700)
    @Test(expected = RuntimeException.class)
    public void testIncrement_InvalidYear() {
        DateUtil dateUtil = new DateUtil(1, 1, 1699);
        System.out.println(dateUtil);
        dateUtil.increment();
        System.out.println("after increment :-" + dateUtil);
        
    }

    // Test decrementing from a valid date
    @Test
    public void testDecrement_Valid() {
        DateUtil dateUtil = new DateUtil(2, 5, 2023);
        System.out.println(dateUtil);
        dateUtil.decrement();
        System.out.println("after decrement :-" + dateUtil);
      
        assertEquals("Day after decrement should be 1", 1, dateUtil.getDay());
        assertEquals("Month after decrement should be 5", 5, dateUtil.getMonth());
        assertEquals("Year should remain the same", 2023, dateUtil.getYear());
    }

    // Test decrementing from the first day of the month
    @Test
    public void testDecrement_FirstDayOfMonth() {
        DateUtil dateUtil = new DateUtil(1, 5, 2023);
        System.out.println(dateUtil);
        dateUtil.decrement();
        System.out.println("after decrement :-" + dateUtil);
      
        assertEquals("Day after decrement should be 30", 30, dateUtil.getDay());
        assertEquals("Month after decrement should be 4", 4, dateUtil.getMonth());
        assertEquals("Year should remain the same", 2023, dateUtil.getYear());
    }

    // Test decrementing from the first day of January
    @Test
    public void testDecrement_FirstDayOfYear() {
        DateUtil dateUtil = new DateUtil(1, 1, 2023);
        System.out.println(dateUtil);
        dateUtil.decrement();
        System.out.println("after decrement :-" + dateUtil);
      
        assertEquals("Day after decrement should be 31", 31, dateUtil.getDay());
        assertEquals("Month after decrement should be 12", 12, dateUtil.getMonth());
        assertEquals("Year after decrement should be 2022", 2022, dateUtil.getYear());
    }
    
        // Equivalence class: February in a leap year
        @Test
        public void testIncrement_FebruaryLeapYear() {
            DateUtil dateUtil = new DateUtil(28, 2, 2020); // February 28, 2020 (leap year)
            System.out.println(dateUtil);
            dateUtil.increment();
            System.out.println("after increment :-" + dateUtil);
            

            assertEquals("Day after increment should be 29", 29, dateUtil.getDay());
            assertEquals("Month should remain February", 2, dateUtil.getMonth());
            assertEquals("Year should remain 2020", 2020, dateUtil.getYear());
        }

        // Equivalence class: February in a non-leap year
        @Test
        public void testIncrement_FebruaryNonLeapYear() {
            DateUtil dateUtil = new DateUtil(28, 2, 2021); // February 28, 2021 (non-leap year)
            System.out.println(dateUtil);
            dateUtil.increment();
            System.out.println("after increment :-" + dateUtil);
            
            assertEquals("Day after increment should be 1", 1, dateUtil.getDay());
            assertEquals("Month should change to March", 3, dateUtil.getMonth());
            assertEquals("Year should remain 2021", 2021, dateUtil.getYear());
        }

        // Equivalence class: February 29 in a leap year
        @Test
        public void testIncrement_February29LeapYear() {
            DateUtil dateUtil = new DateUtil(29, 2, 2020); // February 29, 2020 (leap year)
            System.out.println(dateUtil);
            dateUtil.increment();
            System.out.println("after increment :-" + dateUtil);
            

            assertEquals("Day after increment should be 1", 1, dateUtil.getDay());
            assertEquals("Month should change to March", 3, dateUtil.getMonth());
            assertEquals("Year should remain 2020", 2020, dateUtil.getYear());
        }

        // Equivalence class: February 29 in a non-leap year (invalid date)
        @Test(expected = RuntimeException.class)
        public void testIncrement_February29NonLeapYear() {
            DateUtil dateUtil = new DateUtil(29, 2, 2021); // February 29, 2021 (non-leap year)
            System.out.println(dateUtil);
            dateUtil.increment();
            System.out.println("after increment :-" + dateUtil);
            

        }
    

}


