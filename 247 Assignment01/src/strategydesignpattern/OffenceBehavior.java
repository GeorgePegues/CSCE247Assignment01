package strategydesignpattern;

import java.util.Random;

public interface OffenceBehavior {
	/**
	 * Offense Behavior is similiar to the defense behavior class 
	 * in the sense that it gathers all defensive behavior
	 * into a larger parent class then randomizes the array
	 * then selects options from aforementioned array.
	 */
	
//	private void play()
//	{
		
		//System.out.println("" + yes);
//	}
	OBlockBehavior okay = new OBlockBehavior();
	RunBehavior yes = new RunBehavior();
	PassBehavior tip = new PassBehavior();
	ReceiveBehavior huh = new ReceiveBehavior();
	
	Random r = new Random();
	public String[] play = {yes.play(), tip.play(), okay.play(), huh.play()};
	
	public static String play()
	{
		return  play[r.nextInt(play.length)];
	}
			
	
//	public static OffenceBehavior playsd()
//	{
//		public String[] dfdsf = yes;
//		return yes;
//	}
	
//	Random r = new Random();
//	public String[] plays = {"drive(up the gut)", "draw", "pitch", "reverse"};
	
//	public static String plays()
//	{
	//	return "runs a " + plays[r.nextInt(plays.length)];
//	}

}
