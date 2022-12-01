public class minimumflip_rqre_tosame {

//    1------1 or 0------0  difference by 1;

//  1-------0 or 0-------1 difference by 0
    static void fun(int a[])
    {
  int n= a.length;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]!=a[i-1]) {
                if (a[i] != a[0]) {
                    System.out.print("staring from " + i + " to");
                }
                else {
                    System.out.println(i - 1);
                }
            }
        }
        if(a[n-1]!=a[0])
        {
            System.out.println(n-1);
        }


    }
    public static void main(String[] args) {
        int a[]=new int []{1,1,0,0,0,1};
        fun(a);

    }
}
