package strategydesignpattern;

public  abstract class Player {
	
	/**
	 * The Duck class provided as a structure for this class
	 * It sets attributes such as name, offensive, and defensive behavior. 
	 */
	
	protected String name;
	DefenceBehavior defenceBehavior;
	OffenceBehavior offenceBehavior;
	
	public Player(String name) {
		this.name = name;
	}
	
	public String play()
	{
	//	return QuarterBack.Pjlay();
	//	return OBlockBehavior.play;
		return OffenceBehavior.play();
	}
	public String[] defense()
	{
		return DefenceBehavior.play;
	}
	
	
	public abstract void display();
	
//	public  String play() 
//	{
//		return offenceBehavior;
		
		
//	}
	
	public OffenceBehavior setOffenceBehavior()
	{
		return offenceBehavior;
	}
	
	public DefenceBehavior setDefenceBehavior()
	{
		return defenceBehavior;
	}
	
//	public void quack() {
//		offenceBehavior.quack();
//	}
	
	public void swim() {
		System.out.println("swimming");
	}

	protected abstract void turnover();
}


