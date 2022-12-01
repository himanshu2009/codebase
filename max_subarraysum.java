public class max_subarraysum {
    static int resultof(int a[])
    {
        int res=a[0];
        int maxending=a[0];

        for(int i=1;i<a.length;i++)
        {
          maxending= Math.max(maxending+a[i],a[i]);
          res=Math.max(maxending,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]=new int[]{-5,-2,-2};

        System.out.println(resultof(a));
    }
}
