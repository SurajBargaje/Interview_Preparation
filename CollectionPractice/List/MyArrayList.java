package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class MyArrayList {
    
    public static void main(String[] args) {
        ArrayList<Integer>  arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(5);
        
        System.out.println(arrayList);
        Integer a = Collections.binarySearch(arrayList,7);

        // Collections.reverse();
        System.out.println(a);

        System.out.println(arrayList);
            
        // Traversing list through Iterator  
        // @SuppressWarnings("rawtypes")
        // Iterator itr = arrayList.iterator();
        // while (itr.hasNext()) {
        //     System.out.println(itr.next());
            
        // }
 
        // for(int i =0;i<arrayList.size();i++){
        //     System.out.println(arrayList.get(i));
        // }


    }
    
}
