package javaQuickCheckCoverage;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import org.junit.runner.RunWith;
import com.pholser.junit.quickcheck.From;
import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import sut.TST;
import trieRandomGenerator.ListGenerator;
import trieRandomGenerator.PrefixGenerator;
import trieRandomGenerator.StringGenerator;

@RunWith(JUnitQuickcheck.class)
public class JavaQuickCheckCoverageTests {

	@Property(trials=1)
	public final void testQuickCheckOne(@InRange(minInt = 10, maxInt = 30) @From(StringGenerator.class) LinkedHashMap<String, Integer> hashmap) {
	        TST<Integer> tst = new TST<Integer>();
	        TST<Integer> tst2 = new TST<Integer>();
	        System.out.println();
	        for(int i = 0; i < hashmap.size(); i++) {
	        	String key = hashmap.keySet().toArray()[i].toString();
	        	tst.put(hashmap.keySet().toArray()[i].toString(), hashmap.get(key));
	        }
	        
	        List<String> keys = new ArrayList<String>(hashmap.keySet());
	        Collections.shuffle(keys);
	        LinkedHashMap<String, Integer> hashmap2 = new LinkedHashMap<String, Integer>();
      
	        for(int i = 0; i < keys.size(); i++) {
	        	String key = keys.get(i).toString();
	        	hashmap2.put(key, hashmap.get(key));
	        }
	        
	        for(int i = 0; i < hashmap2.size(); i++) {
	        	String key = hashmap2.keySet().toArray()[i].toString();
	        	tst2.put(hashmap2.keySet().toArray()[i].toString(), hashmap2.get(key));
	        } 
	         
	        assertTrue(tst.equals(tst2));
	    }	 
	
	@Property(trials=14)
	public final void testQuickCheckTwo(@InRange(minInt = 10, maxInt = 30) @From(ListGenerator.class) List<String> list) {
	        TST<Integer> tst = new TST<Integer>();
	        for(int i = 0; i < list.size(); i++) {
	        	tst.put(list.get(i), (int) Math.random() * 50 + 1);
	        }
	        
	        for(int i = 0; i < list.size(); i++) {
	        	tst.delete(list.get(i));
	        }
	        List<String> finalList = (List<String>) tst.keys();
	        assertTrue(finalList.isEmpty());
	    }	
	   
	
	@Property(trials=14)
	public final void testQuickCheckThree(@InRange(minInt = 10, maxInt = 30) @From(ListGenerator.class) List<String> list) {
	        TST<Integer> initialValueTST = new TST<Integer>();
	        for(int i = 0; i < list.size(); i++) {
	        	initialValueTST.put(list.get(i), i);
	        }
	        TST<Integer> differentTST = new TST<Integer>();
	        for(int i = 0; i < list.size(); i++) {
	        	differentTST.put(list.get(i), i);
	        }
	        
	        differentTST.put("test", 50); 
	        differentTST.delete("test");
	        
	        assertTrue(differentTST.equals(initialValueTST));
	    }	
	
	@Property(trials=14)
	public final void testQuickCheckFour(@From(PrefixGenerator.class) List<String> list) {
	        TST<Integer> tst = new TST<Integer>();
	        
	        for(int i = 0; i< list.size(); i++) {
	        	tst.put(list.get(i), 14);
	        }
	        
	        List<String> content = (List<String>) tst.keysWithPrefix("su");
	        
	        List<String> content2 = (List<String>) tst.keysWithPrefix("sub");
	        
	        assertTrue(content.containsAll(content2));
	    }	
	    
}
