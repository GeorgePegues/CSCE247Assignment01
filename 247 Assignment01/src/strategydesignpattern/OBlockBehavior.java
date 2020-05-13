package strategydesignpattern;

public class OBlockBehavior implements OffenceBehavior {

	/**
	 * Simple OBlock Behavior that implements the information from 
	 * offence behavior.
	 * @return
	 */
	public String play()
	{
		return "Block Defenders";
	}
}
