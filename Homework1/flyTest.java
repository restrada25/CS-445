package Homework1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class flyTest {
	Creature c1 = new Fly("Buzzer");
	String separator = System.getProperty("line.separator");
	
	@Test
	public void eatTest1() {
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		Creature t = new Tiger("Tigger");
		String expected = "Buzzer Fly won't eat a Creature";
		
		c1.eat(t);
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
	
	@Test
	public void eatTest2() {
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		Thing t = new Thing("Thing0");
		String expected = "Buzzer Fly has just eaten a Thing";
		
		c1.eat(t);
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
	
	@Test
	public void moveTest() {
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		String expected = "Buzzer Fly is buzzing around in flight";
		
		c1.move();
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
	
	@Test
	public void whatDidYouEatTest1() {
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		String expected = "Buzzer Fly has had nothing to eat!";
		
		c1.whatDidYouEat();
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
	
	@Test
	public void whatDidYouEatTest2() {
		Thing t = new Thing("Thing0");
		c1.eat(t);
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		String expected = "Buzzer Fly has eaten a Thing";
		
		c1.whatDidYouEat();
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
}
