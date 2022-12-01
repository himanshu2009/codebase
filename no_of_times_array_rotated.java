public class no_of_times_array_rotated {
    static int fungun(int a[])
    {
        int l=0;
        int n=a.length;
        int r=a.length-1;


        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int prev=(mid+n-1)%n;


            int next=(mid+1)%n;

         if(a[mid]<a[prev]&&a[mid]<a[next])
         {
             return mid;
         }

         else if(a[mid]>a[0])
         {
             l=mid+1;
         }
         else if(a[mid]<a[a.length-1]){
             r=mid-1;


         }


//         else if(a[mid]<a[0])
//         {
//             r=mid-1;
//         }
//         else if(a[mid]<a[a.length-1]){
//             r=mid-1;
//
//
//         }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int a[]=new int[]{6,7,8,9,1,2,3,4,5};
       int ans= fungun(a);
        System.out.println(ans);
    }
}
