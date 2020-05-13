package strategydesignpattern;

import java.util.Random;

/**
 * This class is the base class that implements the Defence Behavior class
 * Its purpose to randomly choose a defense option from the string array
 * @author Georg
 *
 */

public class BlockBehavior implements DefenceBehavior {
	Random r = new Random();
	private String[] blocks = {"kick", "punt", "pass", "catch"};
	/**
	 * This is the method where the random generator will
	 * select a string from the array based on the string 
	 * arrays length.
	 * @return
	 */
	public String play()
	{
		return "block a" + blocks[r.nextInt(blocks.length)];
	}

}