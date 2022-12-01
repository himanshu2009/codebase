public class Majority {
    static int findmajority(int a[]) {

        int n = a.length / 2;
        for (int i = 0; i < a.length - 1; i++) {
            int count = 1;

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }

                if (count > n) {
                    return i;
                }

            }


        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]=new int[]{4,2,5,5,5};
        System.out.println(findmajority( a));
    }
}
