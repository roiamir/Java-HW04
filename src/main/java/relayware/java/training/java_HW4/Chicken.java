package relayware.java.training.java_HW4;

public class Chicken extends NonFlyingBird {
	public Chicken() {
		super("Coulorfull", "Every Day");
	}

	@Override
	public String toString() {
		return "I'm a chicken, " + super.toString();
	}

}
