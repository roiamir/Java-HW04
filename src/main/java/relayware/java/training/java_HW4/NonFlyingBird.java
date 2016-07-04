package relayware.java.training.java_HW4;

public class NonFlyingBird extends Bird {
	public NonFlyingBird(String feather, String layEggs) {
		super(feather, layEggs);
	}

	@Override
	public String fly() {
		return "I can't fly :-(";
	}

}
