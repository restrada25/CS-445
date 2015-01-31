package Homework1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class tigerTest {
	Creature c1 = new Tiger("Tigger");
	String separator = System.getProperty("line.separator");
	
	@Test
	public void eatTest() {
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		Thing t = new Thing("Thing0");
		String expected = "Tigger Tiger has just eaten a Thing";
		
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

		String expected = "Tigger Tiger has just pounced";
		
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

		String expected = "Tigger Tiger has had nothing to eat!";
		
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

		String expected = "Tigger Tiger has eaten a Thing";
		
		c1.whatDidYouEat();
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
}

