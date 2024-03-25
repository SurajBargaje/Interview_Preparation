package SET;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        Set mySet = new HashSet<>();

        mySet.add("Hello");
        mySet.add("Suraj");
        mySet.add("Hello");
        mySet.add("Bargaje");
        mySet.add("AAAA");
        mySet.add("BBB");

        
        System.out.println(mySet);
        // it is unorderd
        // contain unique values

        
        Iterator itr = mySet.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
    }
    
}
