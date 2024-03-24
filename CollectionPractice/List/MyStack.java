package List;
import java.util.*;
public class MyStack {

    public static void main(String[] args) {

        Stack<String> myStack = new Stack<String>();

        myStack.push("Suraj");
        myStack.push("Dhiraj");
        myStack.push("Shivali");
        myStack.push("Ajay");

        System.out.println(myStack);
        // myStack.add("Sanju");
        // myStack.addFirst("mama");
        // .peek() Looks at the object at the top of this stack without removing it from the stack.
        System.out.println(myStack.peek());
        System.out.println(myStack);

        @SuppressWarnings("rawtypes")
        Iterator itr = myStack.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
            
        }
        
    }

    
    

    }
