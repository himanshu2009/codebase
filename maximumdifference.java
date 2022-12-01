public class maximumdifference {
    static int findElement(int a[])
    {
//        int res=a[1]-a[0];
//        for(int i=0;i<a.length-1;i++)
//        {
//            for(int j=i+1;j<a.length;j++)
//            {
//                res= Math.max(a[j]-a[i],res);
//            }
//        }
//        return res;
        int maxelement=a[1]-a[0];
        int min=a[0];

        for(int i=1;i<a.length;i++)
        {    min=Math.min(min,a[i]);
            maxelement=Math.max(maxelement,a[i]-min);

        }
       return maxelement;
  }
    public static void main(String[] args) {
        int a[]=new int[]{2,3,10,6,4,8,1};
        System.out.println(findElement(a));

    }
}
