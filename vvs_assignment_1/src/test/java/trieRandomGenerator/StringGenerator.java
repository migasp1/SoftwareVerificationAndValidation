package trieRandomGenerator;

import java.util.HashMap;
import java.util.LinkedHashMap;
import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class StringGenerator extends Generator<HashMap<String, Integer>> {
	    private int min = 5;
	    private int max = 15;
	    private static final int LIST_SIZE = 5;  
	    
	    // generator respects `@InRange` annotation, defining the size of string
	    public void configure(InRange range) {
	        min = range.minInt();
	        max = range.maxInt();
	    }

	    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";

	    public StringGenerator (Class<HashMap<String, Integer>> type) {
	    	super(type);
	    }

	    @Override
	    public LinkedHashMap<String, Integer> generate(SourceOfRandomness random, GenerationStatus status) {
	    	int size = random.nextInt(min, max);
	    	LinkedHashMap<String, Integer> hashmap = new LinkedHashMap<String, Integer>(); 
	    	for(int k = 0; k < LIST_SIZE; k++) {
	    		StringBuilder sb = new StringBuilder(size);
	    		for (int i = 0; i < size; i++) {
	            int randomIndex = random.nextInt(LOWERCASE_CHARS.length());
	            sb.append(LOWERCASE_CHARS.charAt(randomIndex));
	    		}
	    		hashmap.put(sb.toString(), (int) Math.random() * 50 + 1);
	    	}
	    	return hashmap;
	    }
}
