public class maximum_circular_subarraysum {
    static int function1(int a[])
    {
        int res=a[0];
        int n=a.length;
        for(int i=0;i<a.length;i++)
        {
            int max_sum=a[i];
            int curr_sum=a[i];

            for(int j=1;j<a.length ;j++)
            {
                int index=((i+j)%n);
                curr_sum+=a[index];
                max_sum=Math.max(max_sum,curr_sum);
            }
            res=Math.max(res,max_sum);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]=new int[]{5,-2,3,4};

        System.out.println(function1(a));
    }
}
