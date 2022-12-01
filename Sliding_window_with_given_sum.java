
//this works for only non-negative numbers


import java.util.ArrayList;

public class Sliding_window_with_given_sum {
   static ArrayList<Integer> ans=new ArrayList();

   static ArrayList<Integer> result(int a[], int sum)
   {
       int curr_sum=a[0];
       int n=a.length;
       int s=0;
       for(int e=1;e<=a.length;e++)
       {
         while (curr_sum>sum&&s<e-1)
         {
             curr_sum-=a[s];
             s++;
         }

         if(curr_sum==sum)
         {
             ans.add(s);
             ans.add(e-1);
             return ans;
         }

         if(e<n)
         {
           curr_sum+=a[e];
         }
       }
       return  ans;


   }
    public static void main(String[] args) {
        int a[]=new int[]{15,18,2,7,5,1,10,3,2};
        System.out.println(result(a,30));
    }
}
