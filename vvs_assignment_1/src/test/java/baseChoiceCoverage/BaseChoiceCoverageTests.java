package baseChoiceCoverage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import sut.TST;

public class BaseChoiceCoverageTests {
	@Test
	public final void testBaseChoiceOne() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("chew", 5);
		tst.put("chord", 6);
		String newKey = "chew";
		tst.put(newKey, 14);
		int trieSize = tst.size();
		assertEquals(trieSize, 2);
	}	 
	
	@Test
	public final void testBaseChoiceTwo() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("drain", 5);
		tst.put("chew", 6);
		String newKey = "chew";
		tst.put(newKey, 14);
		int trieSize = tst.size();
		assertEquals(trieSize, 2); 
	}	 

	@Test
	public final void testBaseChoiceThree() {
		TST<Integer> tst = new TST<Integer>();
		tst.put("drain", 5);
		tst.put("chewbacca", 6);
		String newKey = "chew";
		tst.put(newKey, 14);
		int trieSize = tst.size();
		assertEquals(trieSize, 3); 
	}	  
	
	@Test
    public void testBaseChoiceFour(){
        TST<Integer> tst = new TST<>();
        tst.put("flame", 5);
        tst.put("flamingo", 20);
        String newKey = "flamingo";
        tst.put(newKey, 14);
        int trieSize = tst.size();
		assertEquals(trieSize, 2);
    }
	
	@Test
    public void testBaseChoiceFive(){
		//typical still needed
        TST<Integer> tst = new TST<>();
        tst.put("code", 5);
        tst.put("drill", 15);
        tst.put("frightening", 20);
        String newKey = "drill";
        tst.put(newKey, 14);
        int trieSize = tst.size();
		assertEquals(trieSize, 3);
    }
}
