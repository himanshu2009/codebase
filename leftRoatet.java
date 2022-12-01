public class leftRoatet {

    //left rotate by d
    static void reversed(int p,int q ,int a[])
    {
        int l=p;
        int h=q;
        while(l<h)
        {
            int temp=a[l];
             a[l]=a[h];
             a[h]=temp;
             l++;
             h--;

        }
    }
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        int n=a.length;
        int d=2;

            reversed(0,d-1,a);
            reversed(d,n-1,a);
            reversed(0,n-1,a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");

        }

    }

}
