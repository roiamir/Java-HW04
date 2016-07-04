package relayware.java.training.java_HW4;

public class Penguin extends NonFlyingBird{
	public Penguin() {
		super("Black and White", "once a year");
	}

	@Override
	public String toString() {
		return "I'm a penguin, " + super.toString();
	}

}
