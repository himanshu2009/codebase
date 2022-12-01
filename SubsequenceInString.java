public class SubsequenceInString {
    public static void main(String[] args) {
        String s1="abcgfjk";
        String s2="a";
        if(s1.length()<s2.length())
        {
            System.out.println("not possible cause s2>s1");
        }
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        int n=s1.length();
        int m=s2.length();

        int i;
        int j=0;

        for(i=0;i<n&&j<m;i++) {
            if (c1[i] == c2[j]) {
                j++;
            }
        }
            System.out.println(j==m);

    }
}
