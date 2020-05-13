package strategydesignpattern;
/**
 * Simply method with one possible option. 
 * Sack behavior can only be one thing, to sack the QB
 * @author Georg
 *
 */
public class SackBehavior implements DefenceBehavior {

		public String play()
		{
			return " Sack the Quarterback";
		}

	

}
