package mystack;

/**
 * @author Omar Alcantar
 *
 */

// Stack using generics
public class MyStack<T> {

    private class MyNode<T1> {
        T1 val;
        MyNode<T1> next;

        MyNode(T1 v, MyNode<T1> n) {
            val = v;
            next = n;
        }
    }

    private MyNode<T> theStack = null;

    /**
     * Default constructor
     */
    public MyStack() {
    }

    /**
     * Push a value onto the stack
     * 
     * @param v the value to push
     */
    public void push(T v) {
        MyNode<T> newNode = new MyNode<>(v, theStack);
        theStack = newNode; // Update the top of the stack
    }

    /**
     * Pop the value from the top of the stack
     * 
     * @return the value popped, or null if the stack is empty
     */
    public T pop() {
        if (theStack == null) {
            return null; // Stack is empty
        }
        T value = theStack.val; // Get the top value
        theStack = theStack.next; // Move to the next node
        return value;
    }

    /**
     * Check if the stack is empty
     * 
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return theStack == null;
    }

    public static void main(String[] args) {
        
        MyStack<Integer> intStack = new MyStack<>();
        intStack.push(1);
        intStack.push(2);
        System.out.println("Popped from intStack: " + intStack.pop()); // Expect 2
        intStack.push(5);
        System.out.println("Popped from intStack: " + intStack.pop()); // Expect 5

        
        MyStack<Person> personStack = new MyStack<>();
        Person p1 = new Person("Your Name");
        Person p2 = new Person("My Name");
        personStack.push(p1);
        personStack.push(p2);
        System.out.println("Popped from personStack: " + personStack.pop()); // Expect p2
        System.out.println("Popped from personStack: " + personStack.pop()); // Expect p1
    }
}


class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
