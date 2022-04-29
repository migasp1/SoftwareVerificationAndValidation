package allCouplingUsePathsCoverage;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import sut.TST;

public class AllCouplingUsePathsCoverageTests {
		/*
		 * The coupling du pairs (last def first use) that this unit test covers:
		 * (put, key, line 106) -> (contains, key 62)	
		 * (put, val, line 111) -> (put, val, 121)
		 * (put, root, line 111) -> (put, x, 116)
		 * (put, key, line 106) -> (put, key 115)
		 */
		@Test
		public final void testAllCouplingDUPathOne() {
			TST<Integer> tst = new TST<Integer>();
			String inputOne = "chewbacca";
			String inputTwo = "dorothy";
	        tst.put(inputOne, 14);
	        tst.put(inputTwo, 10);
	        assertTrue(tst.contains(inputOne));
	        assertTrue(tst.contains(inputTwo));
		    }	
}
