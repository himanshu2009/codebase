public class Equilibriumpoint {
    public static void main(String[] args) {
        int a[] = new int[]{3, 4, 7,10, -9, 20, 6};
        int lsum = 0;
        int sum = 0;
        int bool = 1;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
            for (int i = 0; i < a.length; i++) {


                if (lsum == sum - a[i]) {
                    bool = 0;
                    System.out.println("equilibrium");
                }
                lsum += a[i];
                sum -= a[i];



        }
        if (bool == 1) {

            System.out.println("not equilibrium");

        }
    }
}
