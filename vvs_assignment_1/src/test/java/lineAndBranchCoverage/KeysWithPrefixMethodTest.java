package lineAndBranchCoverage;
import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import java.util.Queue;
import org.junit.jupiter.api.Test;
import sut.TST;

public class KeysWithPrefixMethodTest {

	@Test
	public final void testKeysWithPrefixMethodWithNullArgument() {
		TST<Integer> tst = new TST<Integer>();
		assertThrows(IllegalArgumentException.class,
				()->{
					tst.keysWithPrefix(null);
				});
	}	
	 
	@Test
	public final void testKeysWithPrefixMethodReturnsEmptyQueue() {
		TST<Integer> tst = new TST<Integer>();
		Queue<String> testQueue = new LinkedList<>();
		Queue<String> sut = (LinkedList<String>) tst.keysWithPrefix("test");
		assertEquals(testQueue, sut);
	}	
	
	@Test
	public final void testKeysWithPrefixReturnsCorrectQueue() {
		TST<Integer> tst = new TST<Integer>();
		Queue<String> testQueue = new LinkedList<>();
		tst.put("hyperactive", 6);
		testQueue.add("hyperactive");	
		Queue<String> sut = (LinkedList<String>) tst.keysWithPrefix("hyp");
		assertEquals(sut.element(), testQueue.element());
	}	
	
	@Test
	public final void testKeysWithPrefixHasItself() {
		TST<Integer> tst = new TST<Integer>();
		Queue<String> testQueue = new LinkedList<>();
		tst.put("hyp", 6);
		testQueue.add("hyp");	
		Queue<String> sut = (LinkedList<String>) tst.keysWithPrefix("hyp");
		assertEquals(sut.element(), testQueue.element());
	}	
}
