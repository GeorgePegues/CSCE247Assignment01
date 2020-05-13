package strategydesignpattern;

import java.util.Random;
/**
 * This class is to account for the reciever who should run routes when the quarterback
 * throws the ball
 * @author Georg
 *
 */
public class ReceiveBehavior implements OffenceBehavior {

	Random r = new Random();
	private String[] Recieve = {"slant route", "out route", "seem route", "screen pass", "hail mary"};
	
	public String play()
	{
		return "Runs a " + Recieve[r.nextInt(Recieve.length)];
	}
}
