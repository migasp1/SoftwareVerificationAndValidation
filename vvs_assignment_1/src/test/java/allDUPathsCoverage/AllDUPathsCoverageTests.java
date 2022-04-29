package allDUPathsCoverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import sut.TST;

public class AllDUPathsCoverageTests {
		/*
	    * This test can cover the following test path(s) from the graph: [1,3,5,6,7,10,12,6,13]
	    */
		@Test
		public final void testAllDUPathsSeven() {
			TST<Integer> tst = new TST<Integer>();
	        tst.put("o", null);
	        String sut = tst.longestPrefixOf("octopus");
	        assertEquals("", sut);
		    }	
	
		/*
	    * This test can cover the following test path(s) from the graph: [1,3,5,6,7,9,6,13]
	    */
		@Test
		public final void testAllDUPathsEight() {
			TST<Integer> tst = new TST<Integer>();
	        tst.put("a", 14);
	        String sut = tst.longestPrefixOf("barbecue");
	        assertEquals("", sut);
		    }	

		
		/*
	    * This test can cover the following test path(s) from the graph: [1,3,5,6,7,10,11,12,6,13]
		*/
		@Test
		public final void testAllDUPathsNine() {
			TST<Integer> tst = new TST<Integer>();
	        tst.put("o", 14);
	        String sut = tst.longestPrefixOf("octopus");
	        assertEquals("o", sut);
		    }	
		
		/*
		 * This test was added after the execution of PIT tool
		 */
		@Test
		public final void testAfterPITExecution() {
			TST<Integer> tst = new TST<Integer>();
			assertThrows(IllegalArgumentException.class,
					()->{
						tst.longestPrefixOf(null);
					});
		}	

		/*
		 * This test was added after the execution of PIT tool
		 */	 
		@Test
		public final void testAfterPITExecutionTwo() {
			TST<Integer> tst = new TST<Integer>();
			assertEquals(null, tst.longestPrefixOf(""));
		}	
		
		/*
		 * This test was added after the execution of PIT tool
		 */
		@Test
		public final void testAfterPITExecutionThree() {
			TST<Integer> tst = new TST<Integer>();
			tst.put("hyperactive", 5); 
			assertEquals("", tst.longestPrefixOf("hyper")); 
		}	
}
