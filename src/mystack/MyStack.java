package mystack;

/**
 * @author Omar Alcantar
 *
 */


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


    public MyStack() {
    }

    /**
     * 
     * 
     * @param v the value to push
     */
    public void push(T v) {
        MyNode<T> newNode = new MyNode<>(v, theStack);
        theStack = newNode; // Update the top of the stack
    }

    /**
     * 
     * 
     * 
     */
    public T pop() {
        if (theStack == null) {
            return null; 
        }
        T value = theStack.val; 
        theStack = theStack.next; 
        return value;
    }


    public boolean isEmpty() {
        return theStack == null;
    }

    public static void main(String[] args) {
        
        MyStack<Integer> intStack = new MyStack<>();
        intStack.push(1);
        intStack.push(2);
        System.out.println("Popped from intStack: " + intStack.pop()); 
        intStack.push(5);
        System.out.println("Popped from intStack: " + intStack.pop()); 

        
        MyStack<Person> personStack = new MyStack<>();
        Person p1 = new Person("Your Name");
        Person p2 = new Person("My Name");
        personStack.push(p1);
        personStack.push(p2);
        System.out.println("Popped from personStack: " + personStack.pop()); 
        System.out.println("Popped from personStack: " + personStack.pop()); 
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
