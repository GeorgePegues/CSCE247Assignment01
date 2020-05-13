package strategydesignpattern;
/**
 * Strip Behavior only has one instance where it should be intiated
 * when it is accessd from the random array, there is no array in this class
 * there is only one String option for this class
 * @author Georg
 *
 */
public class StripBehavior implements DefenceBehavior {
	
	public String play()
	{
		return " Strip a ball from runners hand";
	}

}
