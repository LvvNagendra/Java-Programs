package ds;

import java.util.LinkedHashSet;
import java.util.Set;   
public class Sets{   
    public static void main(String[] args)   
    {   
        // creating LinkedHashSet  
        Set<String> data = new LinkedHashSet<String>();   
    
        data.add("This");   
        data.add("Is");   
        data.add("Set");   
        data.add("Example"); 
        data.add("This");
    
        System.out.println(data);   
    }   
}   
