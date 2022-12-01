public class windowsliding {
    static int outputsum(int a[],int k)
    {
        int curr_sum=0;
        for(int i=0;i<k;i++)
        {
            curr_sum+=a[i];
        }
        int max_sum=curr_sum;

        for(int i=k;i<a.length;i++)
        {
            curr_sum+=(a[i]-a[i-k]);
            max_sum=Math.max(curr_sum,max_sum);
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int a[]=new int[]{1,8,30,-5,20,7};
        int k=3;
        System.out.println(outputsum(a,k));
    }
}
