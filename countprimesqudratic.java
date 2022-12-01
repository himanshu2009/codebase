public class countprimesqudratic {
   static int func1(int n){
       if (n <= 1)
           return 0;
       int count=0;

       for(int i=2;i<n;i++) {
           int j;
           boolean flag = true;
           for (j = 2; j <i; j++) {
               if (i % j == 0) {
                   flag = false;
                   break;

               }

           }
           if (flag == true) {
               count++;
           }




       }
       return count;
   }
    public static void main(String[] args) {
        System.out.println(func1(50));

    }
}
