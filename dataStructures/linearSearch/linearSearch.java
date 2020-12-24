public class linearSearch   //Linear Search
{

    static int[] array = { 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,0 };
    public static void main( String args[] )
    {
        for( int i = 0 ;i < array.length ;i++ )
            if( array[i] == 0 )
                System.out.print( "Found At index : " + i );
    }
      
}
