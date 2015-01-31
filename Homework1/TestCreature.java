package Homework1;

public class TestCreature { 
	public static void main(String [] args){
		int CREATURE_COUNT = 4;		
		Creature carr[] = new Creature[CREATURE_COUNT];
		carr[0] = new Tiger("Tigger");
		carr[1] = new Ant("Tiny");
		carr[2] = new Fly("Buzzer");
		carr[3] = new Bat("Vampire");
		Thing t = new Thing("Thing0");
		
		for(int a=0;a<CREATURE_COUNT;a++)
		{
			System.out.println(carr[a]);
		}
		System.out.println(t+"\n");
		
		carr[0].whatDidYouEat();
		carr[0].eat(t);
		carr[0].whatDidYouEat();
		carr[0].move();
		
		System.out.println("\n");
		carr[1].whatDidYouEat();
		carr[1].eat(carr[2]);
		carr[1].whatDidYouEat();
		carr[1].move();
		
		System.out.println("\n");
		carr[2].whatDidYouEat();
		carr[2].eat(t);
		carr[2].eat(carr[0]);
		carr[2].whatDidYouEat();
		carr[2].move();
		
		System.out.println("\n");
		carr[3].whatDidYouEat();
		carr[3].eat(t);
		carr[3].eat(carr[0]);
		carr[3].whatDidYouEat();
		carr[3].move();
	}
}
