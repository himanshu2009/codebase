public class callbyrefernce {

    static void func1(int a[])
    {
        a[2]+=4;
    }



    public static void main(String[] args) {
        int a[]=new int[]{
                1,2,3};

        func1(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
