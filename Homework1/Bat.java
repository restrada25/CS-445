package Homework1;

public class Bat extends Creature implements Flyer {
	String name=super.getName();
	String className = getClass().getSimpleName();
	
	public Bat(String n)
	{
		super(n);
	}
	public Bat() 
	{
	}
	public void eat(Thing t)
	{
		String tclass=t.getClass().getSimpleName();
		String tsuperclass=getClass().getSuperclass().getSimpleName();
		if(tclass.equals("Thing"))
			System.out.println(name+" "+className+" won't eat a "+tclass);
		else if(tsuperclass.equals("Creature"))
			super.eat(t);
		else
			System.out.println("The bat is silent and didn't eat");
	}
	public void move()
	{
		this.fly();
	}
	public void fly()
	{
		System.out.println(name+" "+className+" is swooping through the dark");
	}
}
