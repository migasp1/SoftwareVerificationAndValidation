package lineAndBranchCoverage;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import sut.TST;

public class ContainsMethodTest {
	@Test
	public final void testContainsWithNullArgument() {
	        TST<Integer> tst = new TST<Integer>();
	        assertThrows(IllegalArgumentException.class,
	                ()->{
	                	tst.contains(null);
	                });
	    }	
	
	@Test
	public final void testContainsReturnsTrue() {
	        TST<Integer> tst = new TST<Integer>();
	        String key = "test";
	        tst.put(key, 5);
	        assertTrue(tst.contains(key));
	    }	
}