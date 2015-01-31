package Homework1;

public class Tiger extends Creature {
	String name=super.getName();
	String className = getClass().getSimpleName();
	
	public Tiger(String n) 
	{
		super(n);
	}
	public Tiger()
	{
	}
	public void move()
	{
		System.out.println(name+" "+className+" has just pounced");
	}
}
