package OOPLab3;


import OOPLab3.Stack.ArrayStackUp;
import OOPLab3.Stack.LinkedStack;

public class Main {
    public static void main(String[] args){
        System.out.println("ArrayUpStack");
        ArrayStackUp aus = new ArrayStackUp();
        aus.push(10);
        aus.push(5);
        aus.push(90);
        System.out.println("Top element: " + aus.peek());
        System.out.println("Popped element: " + aus.pop());


        System.out.println("Is the stack empty? " + aus.isEmpty());

        for (int i = 1; i < 19; i++) {
            aus.push(i * 5);
        }
        System.out.println("All the elements of the stack ");
        aus.elements();

//-----------------------------------------------------------------------------------------------------------------------
        System.out.println("LinkedStack");
        LinkedStack stack = new LinkedStack();

        // Push elements onto the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Peek: " + stack.peek()); // Output: Peek: 3
        System.out.println("Pop: " + stack.pop()); // Output: Pop: 3

        stack.elements();
        System.out.println("Is the stack empty? " + stack.isEmpty());


        stack.clear();
        stack.elements();
        System.out.println("Is the stack empty after clearing? " + stack.isEmpty()); // Output: Is the stack empty after clearing? true

    }

}