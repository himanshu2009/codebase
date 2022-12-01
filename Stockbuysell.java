public class Stockbuysell {
    public static void main(String[] args) {
        int a[]=new int[]{5,2,6,1,4};
        int minSoFar=a[0];
        int profit=0;
        int maxProfit=0;

        for(int i=0;i<a.length;i++)
        {
            minSoFar=Math.min(a[i],minSoFar);
            profit=a[i]-minSoFar;
            maxProfit=Math.max(maxProfit,profit);
        }
        System.out.println(maxProfit);
    }
}
