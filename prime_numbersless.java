public class prime_numbersless {
    public static void main(String[] args) {
        int n=10;

        // Corner case
        if (n <= 1)
            return ;

        for(int i=2;i<=n;i++) {
            int j;
            boolean flag = true;
            for (j = 2; j <i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;

                }

            }
            if (flag == true) {
                System.out.println(j);
            }
        }
    }
}
