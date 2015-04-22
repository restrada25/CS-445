import static org.junit.Assert.*;
import org.junit.Test;

public class ImprovedRandomTest {

	@Test
	public void nextIntBetweentest() {
		int para1=3;
		int para2=11;
		ImprovedRandom rnd=new ImprovedRandom();
		int actual = rnd.nextIntBetween(para1,para2);
		System.out.println(actual);
		assertTrue((actual>=3)&&(actual<=11));
	}
}
