package Homework1;

import static org.junit.Assert.*;
import org.junit.Test;

public class thingTest {
	Thing t1 = new Thing("Thing0");
	
	@Test
	public void toStringTest() {
		String actual = t1.toString();
		String expected = "It's name is Thing0 Thing";
		
		assertEquals(expected,actual);		
	}
}
