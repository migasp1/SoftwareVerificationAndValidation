package lineAndBranchCoverage;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import sut.TST;

public class PutMethodTest {
	
	@Test
	public final void testPutMethodWithNullArgument() {
		TST<Integer> tst = new TST<Integer>();
		assertThrows(IllegalArgumentException.class,
				()->{
					tst.put(null, 5);
				});
	}	
	
	@Test
	public final void testPutMethodWithNonExistentKey() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("test", 5);
		tst.put("test1", 6);
		tst.put("test1", 7);
		assertEquals(tst.get("test"), Integer.valueOf(5));
	}	
}
