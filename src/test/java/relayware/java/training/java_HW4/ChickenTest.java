package relayware.java.training.java_HW4;

import junit.framework.TestCase;

public class ChickenTest extends TestCase {

	public final void testToString() {
		Chicken chicken = new Chicken();
		assertEquals("I'm a chicken, I can't fly :-(. [Feather: Coulorfull] [Lay Eggs: Every Day]", chicken.toString());
	}
}
