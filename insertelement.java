import java.util.Scanner;

public class insertelement {
    public static void main(String[] args) {
        int element, pos=3, i;
        int size=5;
        element=34;
        Scanner sc=new Scanner(System.in);

        {
            int arr[] = new int [size+1];
            for( i=0;i<size;i++)
            {
                 arr[i]=sc.nextInt();

            }
            pos=pos-1;




            if(pos <= arr.length && pos >= 0)
            {
                //shift all the elements from the last index to pos by 1 position to right
                for(i = size-1; i >=pos; i--)
                    arr[i+1] = arr[i];

                //insert element at the given position
                arr[pos] = element;

                /*
                 * print the new array
                 * the new array size will be size+1(actual size+new element)
                 * so, use i <= size in for loop
                 */
                for(i = 0; i <= size; i++)
                    System.out.println( arr[i]);
            }
            else
                System.out.println(("Invalid Position\n"));


        }
    }
}
