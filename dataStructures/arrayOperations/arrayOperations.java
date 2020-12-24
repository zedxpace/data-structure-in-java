public class arrayOperations
{
    
    static int[] addElement( int[] arr ,int index ,int value )
    {
        System.out.println();
        int[] newArr = new int[ arr.length  ];
        int i = 0;
        int j = 0;

        while(j != arr.length)
        {
            
            if( i == index )
            {
                newArr[index] = value;
                int temp = arr[i];
                i+=1;
                newArr[++j] = temp;
                ++j;
            }
            else
            {
                newArr[j] = arr[i];
                
                i++;
                j++;
            }
        }
        printArray(newArr, newArr.length);
        return newArr; 
        
    }

    static int[] removeElement( int[] arr ,int index )
    {

        for( int i = index ;i < arr.length-1 ;i++ )
            arr[i] = arr[i+1];
        return arr ;
    
    }
    
    static void printArray( int[] arr ,int len )
    {

        System.out.println();
        for ( int i = 0 ;i < len ;i++ )
            System.out.print( arr[i] + " " );
    
    }

    public static void main( String []args )
    {
        
        int[] array = { 1 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ,0 };
        
        printArray( array ,array.length );
        int [] arr = removeElement( array ,4 );
        printArray(arr ,arr.length-1);
        int [] Arr = addElement(arr, 4, 6);
        // printArray(Arr, Arr.length);
    }
}