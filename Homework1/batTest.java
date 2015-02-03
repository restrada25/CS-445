package Homework1;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class batTest {
	Creature c1 = new Bat("Vampire");
	String separator = System.getProperty("line.separator");
	
	@Test
	public void eatTest1() {
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		Thing t = new Thing("Thing0");
		String expected = "Vampire Bat won't eat a Thing";
		
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

		Creature t = new Tiger("Tigger");
		String expected = "Vampire Bat has just eaten a Tiger";
		
		c1.eat(t);
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
	
	@Test
	public void eatTest3() {
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		Creature t = new Ant("Tiny");
		String expected = "Vampire Bat has just eaten a Ant";
		
		c1.eat(t);
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
	
	@Test
	public void eatTest4() {
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		Creature t = new Bat(" ");
		String expected = "Vampire Bat has just eaten a Bat";
		
		c1.eat(t);
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
	
	@Test
	public void eatTest5() {
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		Creature t = new Fly(" ");
		String expected = "Vampire Bat has just eaten a Fly";
		
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

		String expected = "Vampire Bat is swooping through the dark";
		
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

		String expected = "Vampire Bat has had nothing to eat!";
		
		c1.whatDidYouEat();
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
	
	@Test
	public void whatDidYouEatTest2() {
		Creature t = new Fly("Buzzer");
		c1.eat(t);
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		String expected = "Vampire Bat has eaten a Fly";
		
		c1.whatDidYouEat();
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
	
	@Test
	public void whatDidYouEatTest3() {
		Creature t = new Tiger();
		c1.eat(t);
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		String expected = "Vampire Bat has eaten a Tiger";
		
		c1.whatDidYouEat();
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
	
	@Test
	public void whatDidYouEatTest4() {
		Creature t = new Bat();
		c1.eat(t);
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		String expected = "Vampire Bat has eaten a Bat";
		
		c1.whatDidYouEat();
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
	
	@Test
	public void whatDidYouEatTest5() {
		Creature t = new Ant();
		c1.eat(t);
		PrintStream originalOut = System.out;
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);

		String expected = "Vampire Bat has eaten a Ant";
		
		c1.whatDidYouEat();
		assertEquals(expected+separator,os.toString());	
		System.setOut(originalOut);		
	}
}
