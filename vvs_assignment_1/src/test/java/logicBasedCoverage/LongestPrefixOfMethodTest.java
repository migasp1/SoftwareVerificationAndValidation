package logicBasedCoverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import sut.TST;

public class LongestPrefixOfMethodTest {
	/* 
	 * This test can cover the following predicates and clauses(requirements):
	 * C1
	 */
	@Test
	public final void testLongestPrefixOfMethodLogic1() {
		TST<Integer> tst = new TST<Integer>();
		assertThrows(IllegalArgumentException.class,
				()->{
					tst.longestPrefixOf(null);
				});
	}	
	
	/* 
	 * This test can cover the following predicates and clauses(requirements):
	 * C2
	 */
	@Test
	public final void testLongestPrefixOfMethodLogic2() {
		TST<Integer> tst = new TST<Integer>();
		assertEquals(null, tst.longestPrefixOf(""));
	}	



	/* 
	 * This test can cover the following predicates and clauses (requirements):
	 * !C1
	 * !C2
	 * !C3 and C4
	 */
	@Test
	public final void testLongestPrefixOfMethodLogic3() {
		TST<Integer> tst = new TST<Integer>();
		assertEquals("", tst.longestPrefixOf("try"));
	}	
	
	/*
	 * This test can cover the following predicates and clauses(requirements):
	 * !C1
	 * !C2
	 * C3 and C4
	 * C5, C6, C7
	 * !C3 and C4
	 */ 
	@Test
	public final void testLongestPrefixOfMethodLogic4() {
		TST<Integer> tst = new TST<Integer>();
        tst.put("nougat", 14);
        tst.put("al", 11);
        tst.put("a", 10);
        String sut = tst.longestPrefixOf("ambrosia");
        assertEquals("a", sut);
	    }	
	
	
	/* 
	 * This test can cover the following predicates and clauses(requirements):
	 * !C1
	 * !C2
	 * C3 and C4
	 * !C3 and !C4
	 * !C7
	 */
	@Test
	public final void testLongestPrefixOfMethodLogic6() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("biscuit", null); 
		assertEquals("", tst.longestPrefixOf("biscuit")); 
	}	
	
	/* 
	 * This test can cover the following predicates and clauses(requirements):
	 * !C1
	 * !C2
	 * C3 and !C4
	 * C3 and C4
	 */
	@Test
	public final void testLongestPrefixOfMethodLogic7() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("hyperactive", 5); 
		assertEquals("", tst.longestPrefixOf("hyper")); 
	}	
}
