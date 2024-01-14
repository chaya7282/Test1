package exercise_1_24.exercise_1_24;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exe_2.exe_2.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    
    @Test
    public void order_aopproved() {
      // Arrange
      final String expected_result = "Accepted";
      int data=5;
      // Act
      String actual = App.order_number(data);
  
      // Assert
      org.junit.Assert.assertEquals(actual,expected_result);
    }
    @Test
    public void order_not_aopproved() {
      // Arrange
      final String expected_result = "Not accepted";
      int data=20;
      // Act
      String actual = App.order_number(data);
  
      // Assert
      org.junit.Assert.assertEquals(actual,expected_result);
    }
	
}
