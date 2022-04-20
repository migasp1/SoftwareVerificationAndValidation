package lineAndBranchCoverage;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sut.TST;

public class SizeMethodTest {

	@Test
	public final void testSizeWithRandomArgs() {
	        TST<Integer> tst = new TST<Integer>();
	        tst.put("test", 5);
	        assertEquals(1, tst.size());
	    }		
}

