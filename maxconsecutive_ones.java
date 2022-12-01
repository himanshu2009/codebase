public class maxconsecutive_ones {
    static int counting(int a[]) {
        int i = 0;
        int count = 0;
       int  maxcount=0;
       int n=a.length;

        while (i < n) {

            if (a[i] == 1) {
                count++;
                maxcount=Math.max(maxcount,count);

            }
            else {
                count = 0;


            }

            i++;
        }
        return  maxcount;
    }

    public static void main(String[] args) {
        int a[] = new int[]{ 0,0,1,1};


        System.out.println(counting(a));

    }
}
