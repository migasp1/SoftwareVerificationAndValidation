package edgePairCoverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import sut.TST;

public class EdgePairCoverageTests {
	
	/*
	 * This test can cover the following test path(s) from the graph: [1, 2]
	 */
	@Test
	public final void testEdgePairCoverageOne() {
	        TST<Integer> tst = new TST<Integer>();
	        assertThrows(IllegalArgumentException.class,
	                ()->{
	                	tst.longestPrefixOf(null);
	                });
	    }	
	
	/*
	 * This test can cover the following test path(s) from the graph: [1, 3, 4]
	 */
	@Test
	public final void testEdgePairCoverageTwo() {
		TST<Integer> tst = new TST<Integer>();
		String sut = tst.longestPrefixOf("");
		assertEquals(null, sut);
	    }	

	/*
	 * This test can cover the following test path(s) from the graph: [1, 3, 5, 6, 13]
	*/
	@Test
	public final void testEdgePairCoverageThree() { 
	        TST<Integer> tst = new TST<Integer>();
	        String sut = tst.longestPrefixOf("test");
			assertEquals("", sut);
	    }	

	/*
	 * This test can cover the following test path(s) from the graph: [1, 3, 5, 6, 7, 8, 6, 13]
	 */
	@Test
	public final void testEdgePairCoverageFour() {
		TST<Integer> tst = new TST<Integer>();
        tst.put("nougat", 14);
        String sut = tst.longestPrefixOf("fairy");
        assertEquals("", sut);
	    }	 
	
	/*
	 * This test can cover the following test path(s) from the graph: [1, 3, 5, 6, 7, 9, 6, 7, 10, 12, 6, 13]
	 */
	@Test
	public final void testEdgePairCoverageFive() {
		TST<Integer> tst = new TST<Integer>();
        tst.put("nougat", 14);
        tst.put("o", null);
        String sut = tst.longestPrefixOf("octopus");
        assertEquals("", sut);
	    }	

	/*
	 * This test can cover the following test path(s) from the graph: [1, 3, 5, 6, 7, 8, 6, 7, 10, 11, 12, 6, 7, 9, 6, 13]
	 */
	@Test
	public final void testEdgePairCoverageSix() {
		TST<Integer> tst = new TST<Integer>();
        tst.put("nougat", 14);
        tst.put("al", 11);
        tst.put("a", 10);
        String sut = tst.longestPrefixOf("ambrosia");
        assertEquals("a", sut);
	    }	
	
	/*
	 * This test was added after the execution of PIT tool
	 */
	@Test
	public final void testEdgePairCoverageSeven() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("hyperactive", 5); 
		assertEquals("", tst.longestPrefixOf("hyper")); 
	}	
}
