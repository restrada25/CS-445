package Homework1;

public class Fly extends Creature implements Flyer {
	String name=super.getName();
	String className = getClass().getSimpleName();
	
	public Fly(String n)
	{
		super(n);
	}
	public Fly() 
	{
	}
	public void move()
	{
		this.fly();
	}
	public void eat(Thing t)
	{
		String eaten=t.getClass().getSuperclass().getSimpleName();
		if(eaten.equals("Creature"))
			System.out.println(name+" "+className+" won't eat a "+eaten);
		else 
			super.eat(t);
	}
	public void fly()
	{
		System.out.println(name+" "+className+" is buzzing around in flight");
	}
}
