package strategydesignpattern;

public class Lineman extends Player {
	/**
	 * The lineman class is an extension of a player but 
	 * takes super information from the player class and defensive 
	 * behavior
	 * @param name
	 */
	
	public Lineman(String name) {
		super(name);
//		flyBehavior = new FlyNoWay();
//		quackBehavior = new Squeak();
	}
	
	public void display() {
		System.out.println(name + " ");
	}

	@Override
	protected void turnover() {
		// TODO Auto-generated method stub
		
	}

}
