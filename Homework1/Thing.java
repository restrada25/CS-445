package Homework1;

public class Thing {
	String name;
	
	public Thing(String n){
		name=n;
	}
	public Thing(){
		name=" ";
	}

	public void setName(String n){
		name=n;
	}
	public String getName()
	{
		return name;
	}
	
	public String toString(){
		String className = getClass().getSimpleName();
		String output="It's name is "+name+" "+className;
		return output;
	}
}
