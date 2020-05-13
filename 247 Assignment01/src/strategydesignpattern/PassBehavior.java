package strategydesignpattern;

import java.util.Random;

public class PassBehavior implements OffenceBehavior {

	/**
	 * PassBehavior takes the offence behavioral class and 
	 * provides a random array of offense options for the reciever
	 */
	Random r = new Random();
	private String[] Pass = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
	
	public String play()
	{
		return "Throws a " + Pass[r.nextInt(Pass.length)];
	}
}
