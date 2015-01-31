package Homework1;

public class Ant extends Creature {
	String name=super.getName();
	String className = getClass().getSimpleName();
	
	public Ant(String n)
	{
		super(n);
	}
	public Ant() 
	{
	}
	public void move()
	{
		System.out.println(name+" "+className+" is crawling around");
	}
}
