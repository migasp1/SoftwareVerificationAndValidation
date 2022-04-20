package lineAndBranchCoverage;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sut.TST;

public class GetMethodTest {

	@Test
	public final void testGetMethodWithNullArgument() {
		TST<Integer> tst = new TST<Integer>();
		assertThrows(IllegalArgumentException.class,
				()->{
					tst.get(null);
				});
	}	

	@Test
	public final void testGetMethodWithZeroSizedKey() {
		TST<Integer> tst = new TST<Integer>();
		assertThrows(IllegalArgumentException.class,
				()->{
					tst.get("");
				});
	}	

	@Test
	public final void testGetMethodReturnsNull() {
		TST<Integer> tst = new TST<Integer>();
		assertEquals(null, tst.get("test"));
	}	

	@Test
	public final void testGetMethodReturnsNonNullValue() {
		TST<Integer> tst = new TST<Integer>();
		int val = 5;
		tst.put("test", val);
		assertEquals(Integer.valueOf(val), tst.get("test"));
	}	
}