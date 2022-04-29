package lineAndBranchCoverage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Test;

import sut.TST;

public class KeysMethodTest {
	
	@Test
	public final void testKeysMethodReturnsCorrectKeys() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("test", 5);
		Queue<String> testQueue = new LinkedList<>();
		testQueue.add("test");
		LinkedList<String> sut = (LinkedList<String>) tst.keys();
		assertEquals(testQueue.element(), sut.element());
	}	 
}
