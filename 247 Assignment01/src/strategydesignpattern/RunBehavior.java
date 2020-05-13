package strategydesignpattern;

import java.util.Random;
/**
 * This class is utilizd to account for offence behavior when a player
 * will run the ball they have 4 options that will be randomized
 * however when their are on defense it will be nullified
 * @author Georg
 *
 */

public class RunBehavior implements OffenceBehavior {

	Random r = new Random();
	private String[] runs = {"drive(up the gut)", "draw", "pitch", "reverse"};
	
	public String play()
	{
		return " runs a " + runs[r.nextInt(runs.length)];
	}
}
