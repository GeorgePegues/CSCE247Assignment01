package strategydesignpattern;

import java.util.Random;

public interface DefenceBehavior {
	
	/**
	 * This interface is what will be used throughout the defensive positions
	 * It then gathers all of behaviors from its child classes 
	 * and randomizes them within a string array to provide each postion with random
	 * associated defense position
	 */

	BlockBehavior yes = new BlockBehavior();
	SackBehavior move = new SackBehavior();
	StripBehavior okay = new StripBehavior();
	
	Random r = new Random();
	public String[] play = {yes.play(), move.play(), okay.play()};
	/**
	 * This is the collection of arrays placed in a String array
	 * Then it randomly selects from the assorted list of defensive behavior
	 * @return
	 */
	public static String play()
	{
		return "runs a " + play[r.nextInt(play.length)];
	}
	
//	public static String play()
//	{
//		return yes.play();
//	}
	
	private void Dplay()
	{
		System.out.println("" + yes);
	}

}
