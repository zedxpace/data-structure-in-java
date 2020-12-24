import java.util.Iterator;
import java.util.List;

public class stackOperations    //FILO : First In Last Out
{

    static int[] stack = new int[10];
    static int top = -1 ;

    static void push( int Element )
    {
        top += 1;
        stack[top] = Element;
    }   
    
    static boolean isFull()
    {
        if( top == stack.length)
            return true;
        return false;
    }
    
    static boolean isEmpty()
    {
        if( top == -1)
            return true;
        return false;
    }

    static int pop()
    {   
        int data =  stack[top];
        top -= 1;
        return data;
    }

    static int peak()
    {
        return stack[0];
    }

    static void printStack()
    {
        for( int i = 0 ;i<=top ;i++ )
            System.out.print(stack[i] + " ");
    }

    public static void main( String []args )
    {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        
        printStack();

        System.out.println("poped : "+pop());

        printStack();
    }
}
