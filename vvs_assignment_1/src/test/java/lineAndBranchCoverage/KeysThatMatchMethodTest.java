package lineAndBranchCoverage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Test;

import sut.TST;

public class KeysThatMatchMethodTest {
	
	@Test
	public final void testKeysThatMatchMethodReturnsCorrectKeys() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("hyper", 5);
		Queue<String> testQueue = new LinkedList<>();
		testQueue.add("hyper");
		LinkedList<String> sut = (LinkedList<String>) tst.keysThatMatch(".y.e.");
		assertEquals(testQueue.element(), sut.element());
	}	
}
