package primePathCoverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import sut.TST;

public class primePathCoverageTests {
	
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
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,8,6,7,10,12,6,13]
	 */
	@Test  
	public final void testEdgePairCoverageFour() {
		TST<Integer> tst = new TST<Integer>();
        tst.put("nougat", 14);
        tst.put("a", null);
        String sut = tst.longestPrefixOf("ambrosia");
        assertEquals("", sut);
	    }	
	
	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,10,11,12,6,7,8,6,13]
	 */
	@Test
	public final void testEdgePairCoverageFive() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("m", 1);
		tst.put("moo", 10);
        String sut = tst.longestPrefixOf("may");
        assertEquals("m", sut);
	    }	

	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,8,6,7,10,11,12,6,13]
	 */
	@Test
	public final void testEdgePairCoverageSix() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("moo", 1);
		tst.put("e", 10);
        String sut = tst.longestPrefixOf("elf");
        assertEquals("e", sut);
	    }	
	
	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,9,6,7,10,11,12,6,13]
	*/
	@Test
	public final void testEdgePairCoverageSeven() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("moo", 10);
		tst.put("o", 10);
        String sut = tst.longestPrefixOf("octupus");
        assertEquals("o", sut);
	    }	 
	

	 /* This test can cover the following test path(s) from the graph: [1,3,5,6,7,10,11,12,6,7,10,12,6,13]
	  * 
	  */
	@Test
	public final void testEdgePairCoverageEight() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("e", 14);
		tst.put("el", null);
        String sut = tst.longestPrefixOf("elijah");
        assertEquals("e", sut);
	    }	

	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,10,11,12,6,7,10,11,12,6,13]
	 */
	@Test
	public final void testEdgePairCoverageNine() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("e", 14);
		tst.put("el", 20);
        String sut = tst.longestPrefixOf("elijah");
        assertEquals("el", sut);
	    }	
	
	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,10,12,6,7,10,11,12,6,13]
	 */
	@Test
	public final void testEdgePairCoverageTen() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("ma", 10);
		tst.put("m", null);
        String sut = tst.longestPrefixOf("may");
        assertEquals("ma", sut);
	    }	
	
	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,10,11,12,6,7,9,6,13]
	*/
	@Test
	public final void testEdgePairCoverageEleven() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("e", 14);
		tst.put("elijah", 20);
        String sut = tst.longestPrefixOf("ez");
        assertEquals("e", sut);
	    }	
	    
	/*
    * This test can cover the following test path(s) from the graph: [1,3,5,6,7,9,6,7,10,12,6,13]
	*/
	@Test
	public final void testEdgePairCoverageTwelve() {
		TST<Integer> tst = new TST<Integer>();
        tst.put("nougat", 14);
        tst.put("o", null);
        String sut = tst.longestPrefixOf("octopus");
        assertEquals("", sut);
	    }	
	
	
	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,10,12,6,7,10,12,6,13]
	*/
	@Test
	public final void testEdgePairCoverageThirteen() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("ma", null);
		tst.put("mars", 20);
        String sut = tst.longestPrefixOf("ma");
        assertEquals("", sut);
	    }	 
	
	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,10,12,6,7,9,6,13]
	*/
	@Test
	public final void testEdgePairCoverageFourteen() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("ma", null);
        String sut = tst.longestPrefixOf("men");
        assertEquals("", sut);
	    }	
	
	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,10,12,6,7,8,6,13]
	 */
	@Test
	public final void testEdgePairCoverageFifteen() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("me", null);
        String sut = tst.longestPrefixOf("may");
        assertEquals("", sut);
	    }	
	
	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,8,6,7,8,6,13]
	 */
	@Test
	public final void testEdgePairCoverageSixteen() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("moo", 10);
		tst.put("go", 10);
        String sut = tst.longestPrefixOf("eduroam");
        assertEquals("", sut);
	    }	
	
	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,8,6,7,9,6,13]
	 */
	@Test
	public final void testEdgePairCoverageSeventeen() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("moo", 10);
		tst.put("alabama", 10);
        String sut = tst.longestPrefixOf("episode");
        assertEquals("", sut);
	    }	
	
	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,9,6,7,9,6,13]
	 */
	@Test
	public final void testEdgePairCoverageEighteen() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("go", 10);
		tst.put("moo", 10);
        String sut = tst.longestPrefixOf("zeta");
        assertEquals("", sut);
	    }	

	
	/*
	 * This test can cover the following test path(s) from the graph: [1,3,5,6,7,9,6,7,8,6,13]
	 */
	@Test
	public final void testEdgePairCoverageNineteen() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("alabama", 10);
		tst.put("moo", 10);
        String sut = tst.longestPrefixOf("episode");
        assertEquals("", sut);
	    }	
}
