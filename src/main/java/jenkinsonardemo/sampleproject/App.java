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
        Map<String,String> map = prepareHashMap(false);
        if(map != null) {
        	System.out.println("Map is not null");
        }
        for (Map.Entry<String,String> entry : map.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
    }
    /**
     * Memory Leak Issue
     */
    public static Map<String,String> prepareHashMap(boolean flag) {
    	Map<String,String> messages = null;
    	if(flag)
    		messages = 	new HashMap<String,String>();
    	for(int i = 0; i <= 10; i++) {
    		messages.put(i + "",i + "");
    	}
    	return messages;
    }
    
}
