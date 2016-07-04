package relayware.java.training.java_HW4;

public abstract class Bird {
	protected String feather;
	protected String layEggs;
	
	public abstract String fly();
	public Bird(String feather, String layEggs)	{
		this.feather = feather;
		this.layEggs = layEggs;
	}
	
	
	@Override
	public String toString() {
		return fly() + ". " +
				"[Feather: " + feather + "] " +
				"[Lay Eggs: " + layEggs +"]";
	}
}
