public class Maxlengthofevenandodd {
    static int output(int a[])
    {
        int res=1;
        int curr=1;
        for(int i=1;i<a.length;i++)
        {
            if((a[i-1]%2==0&&a[i]%2!=0)||(a[i-1]%2!=0&&a[i]%2==0))
            {
                curr++;
                res=Math.max(curr,res);
            }
            {
                curr=1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]=new int[]{5,10,20,6,3,8};
        System.out.println( output(a));
    }
}

