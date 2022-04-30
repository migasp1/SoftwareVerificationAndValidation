package trieRandomGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import com.pholser.junit.quickcheck.generator.GenerationStatus;
import com.pholser.junit.quickcheck.generator.Generator;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.random.SourceOfRandomness;

public class ListGenerator extends Generator<List<String>>{
	private int min = 5;
    private int max = 15;
    private static final int LIST_SIZE = 5;  
    
    // generator respects `@InRange` annotation, defining the size of string
    public void configure(InRange range) {
        min = range.minInt();
        max = range.maxInt();
    }

    private static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";

    public ListGenerator (Class<List<String>> type) {
    	super(type);
    }

    @Override
    public List<String> generate(SourceOfRandomness random, GenerationStatus status) {
    	int size = random.nextInt(min, max);
    	List<String> list = new ArrayList<String>(); 
    	for(int k = 0; k < LIST_SIZE; k++) {
    		StringBuilder sb = new StringBuilder(size);
    		for (int i = 0; i < size; i++) {
            int randomIndex = random.nextInt(LOWERCASE_CHARS.length());
            sb.append(LOWERCASE_CHARS.charAt(randomIndex));
    		}
    		list.add(sb.toString());
    	}
    	return list;
    }
}
