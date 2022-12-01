public class frequencyInSorted {
    public static void main(String[] args) {
        int a[]=new int[]{10,10,40,40,60,70};
        int i=1;
        int n= a.length;
        int freq=1;

        while(i<n)
        {
            while(i<n&&a[i-1]==a[i])
            {
                freq++;
                i++;
            }
            System.out.println(a[i-1]+" "+ freq);
            i++;
            freq=1;
        }
        if(a.length==1||a[n-2]!=a[n-1])//first and last element handled here
        {
            System.out.println(a[n-1]+" "+freq);
        }
    }
}
