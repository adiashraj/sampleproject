package jenkinsonardemo.sampleproject;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    /**
     * Memory Leak Issue
     */
    public static void processHashMap() {
    	Map<String,String> messages = new HashMap<String,String>();
    	for(int i = 0; i <= 10; i++) {
    		messages.put(i + "",i + "");
    	}
    	// processing logic
    	
    	// release logic
    }
    
}
