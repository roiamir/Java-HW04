package relayware.java.training.java_HW4;

public class FlyingBird extends Bird {
	public FlyingBird(String feather, String layEggs) {
		super(feather, layEggs);
	}

	@Override
	public String fly(){
		return "I believe i can fly!";
	}

}
