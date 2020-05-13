package strategydesignpattern;
/**
 * This class takes attributes from Player since reciever is a child class
 * of Player
 * @author Georg
 *
 */
public class Reciever extends Player {
	
	public Reciever(String name) {
		super(name);
//		setOffenceBehavior = new OffenceBehavior();
//		setDefenceBehavior = new DefenceBehavior();
	}

	public void display() {
	//	System.out.println(name + " is a redheaded duck");
	}

	@Override
	protected void turnover() {
		// TODO Auto-generated method stub
		
	}

}
