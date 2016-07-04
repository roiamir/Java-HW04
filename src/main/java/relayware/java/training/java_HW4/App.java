package relayware.java.training.java_HW4;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Bird [] myBirds = new Bird[4];
    	myBirds[0] = new Penguin();
    	myBirds[1] = new Eagle();
    	myBirds[2] = new Chicken();
    	myBirds[3] = new Swallow();
    	
    	for (Bird bird : myBirds) {
    		System.out.println(bird.fly());
    		System.out.println(bird.toString());
    	}
    }
}
