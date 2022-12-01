public class countingfrequencyinsorted {

   static int find_occu(int a[],int s){

       int l=0;
       int r=a.length-1;
       int first=-1;
       int second=-1;
       while (l<=r)
       {
           int mid=(l+(r-l)/2);
           if(a[mid]==s)
           {
               first=mid;
               r=mid-1;
           }
           else if(a[mid]>s)
           {
               r=mid-1;
           }
           else{
               l=mid+1;
           }
       }

       int l1=0;
       int r1=a.length-1;
       while (l1<=r1)
       {
           int mid=(l1+(r1-l1)/2);
           if(a[mid]==s)
           {
               second=mid;
               l1=mid+1;
           }
           else if(a[mid]>s)
           {
               r1=mid-1;
           }
           else{
               l1=mid+1;
           }
       }
       if(first==-1||second==-1)
       {
           return -1;
       }

       return second-first+1;



    }

    public static void main(String[] args) {
        int a[]=new int[]{2,4,5,5,5,5,5,7,8,9};
      int no_count= find_occu(a,1);
        System.out.println(no_count);


    }
}
