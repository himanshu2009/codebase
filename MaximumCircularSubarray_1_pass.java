public class MaximumCircularSubarray_1_pass {
   static  int func2(int a[])
   {
       boolean flag=false;
       int Largest=a[0];

       if(a[0]>0){
           flag=true;
       }
       int minleading=a[0];
       int res=a[0];
       int sum=a[0];


       for (int i = 1; i <a.length; i++) {
           if(a[i]>0){
               flag=true;

           }
           Largest=Math.max(a[i],Largest);
           sum=sum+a[i];

         minleading= Math.min(minleading+a[i],a[i]);
         res=Math.min(res,minleading);

       }
       if(flag==false)
       {
           return Largest;
       }
       return sum-res;
   }


   static int Maximumsum(int a[])
   {

    int maxleading=a[0];
    int res=a[0];

       for (int i = 1; i <a.length; i++) {

           maxleading= Math.max(maxleading+a[i],a[i]);
           res=Math.max(res,maxleading);

       }
       return res;

       }


    public static void main(String[] args) {

        int a[]=new int[]{-1,-2,-2,-3,-5};

        System.out.println(Math.max (func2(a),Maximumsum(a)));

    }
}
