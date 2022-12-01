public class Prime {

   static boolean checkPrime(int a)
   {

       for (int i = 2; i < Math.sqrt(a); i++) {
           if(a%i==0){

               return false;
           }



       }
       return true;
   }
    public static void main(String[] args) {
        int a = 3;
        if(checkPrime(a))
        {
            System.out.println(a+" "+ "is prime number");
        }
        else{
            System.out.println(a+" is not prime number");

        }


        }

    }

