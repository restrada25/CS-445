package Homework1;

public abstract class Creature extends Thing {
	String ate=" ";
	String name=super.getName();
	String className = getClass().getSimpleName();
	
	public Creature(String n)
	{
		super(n);
	}
	public Creature()
	{
	}
	public void eat(Thing t)
	{
		String eaten=t.getClass().getSimpleName();
		ate=eaten;
		System.out.println(name+" "+className+" has just eaten a "+eaten);
	}
	public abstract void move();
	public void whatDidYouEat()
	{
		if(ate.equals(" "))
			System.out.println(name+" "+className+" has had nothing to eat!");
		else
			System.out.println(name+" "+className+" has eaten a "+ate);
	}	
	
}
