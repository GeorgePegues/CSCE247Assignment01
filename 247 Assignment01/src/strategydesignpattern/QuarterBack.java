package strategydesignpattern;

import java.util.Random;

public class QuarterBack extends Player{
	/**
	 * Quarter backs can run or pass so this class accounts for both instances
	 * with options for both I implement in a public 'play' method so it can be accessed
	 * from any class.
	 */
	
	static RunBehavior yes = new RunBehavior();
	static PassBehavior tip = new PassBehavior();
	
	static Random r = new Random();
	public static String[] Play = {yes.play(), tip.play()};
	
	public static String Pjlay()
	{
		return  Play[r.nextInt(Play.length)];
	}
	
	public QuarterBack(String name) {
		super(name);
		
		RunBehavior yes = new RunBehavior();
		PassBehavior tip = new PassBehavior();
		
		
//		offense = Play();
//		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println(name + " is a");
	}

	@Override
	protected void turnover() {
		// TODO Auto-generated method stub
		
	}

}
