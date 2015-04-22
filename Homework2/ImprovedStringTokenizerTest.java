import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;

public class ImprovedStringTokenizerTest {

	@Test
	public void TokenArraytest() {
		ImprovedStringTokenizer stk = new ImprovedStringTokenizer("This class is easy");
		String[] actual=stk.TokenArray();
		String[] expected=new String[]{"This","class","is","easy"};
		
		assertTrue(Arrays.equals(actual,expected));
	}

}
