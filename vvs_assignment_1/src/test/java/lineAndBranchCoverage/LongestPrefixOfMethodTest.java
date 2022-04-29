package lineAndBranchCoverage;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sut.TST;

public class LongestPrefixOfMethodTest {
	
	@Test
	public final void testLongestPrefixOfMethodWithNullArgument() {
		TST<Integer> tst = new TST<Integer>();
		assertThrows(IllegalArgumentException.class,
				()->{
					tst.longestPrefixOf(null);
				});
	}	
	
	@Test
	public final void testLongestPrefixOfMethodReturnNullWithEmptyArguments() {
		TST<Integer> tst = new TST<Integer>();
		assertEquals(null, tst.longestPrefixOf(""));
	}	
	
	@Test
	public final void testLongestPrefixOfMethodReturnsCorrect() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("hypersensitive", 5);
		tst.put("hyperactive", 6);
		tst.put("hyper", 14);
		tst.put("hypercritical", 7);
		assertEquals("hyper", tst.longestPrefixOf("hyperactivity"));
	}	

	@Test
	public final void testLongestPrefixOfMethodWithNullRootReturnsEmptyString() {
		TST<Integer> tst = new TST<Integer>();
		assertEquals("", tst.longestPrefixOf("abc")); //while with true, non evaluated
	}	
	
	@Test
	public final void testLongestPrefixOfMethodWithNullRootReturns() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("hyperactive", 5); //to pass null check
		assertEquals("", tst.longestPrefixOf("hyper")); //while with true false
	}	
}

