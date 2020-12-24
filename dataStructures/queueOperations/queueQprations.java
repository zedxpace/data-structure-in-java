public class queueoperations        //FIFO : First In First Out
{
    static int top =  0;
    static int rear= -1;
    static int[] queue = new int[10];

    static void enqueue( int Element )
    {
        // top += 1;
        rear+= 1;
        queue[rear] = Element;


    }

    static int dequeue()
    {
        int data = queue[top];
        top += 1;
        return data;

    }

    static int peek()
    {
        return queue[0];
    }

    static boolean isFull()
    {
        if( top == queue.length )
            return true;
        return false;
    }

    static boolean isEmpty()
    {
        if( top == -1 )
            return true;
        return false;
    }

    static void printQueue()
    {
        for( int i=0 ;i<top ;i++)
            System.out.print( queue[i] );
    }

    public static void main( String []args )
    {
        enqueue(1);
        
        printQueue();

        enqueue(2);
        
        printQueue();
        
        enqueue(3);
        enqueue(4);

    }
}


