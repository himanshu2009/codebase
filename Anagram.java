public class Anagram {
    public static void main(String[] args) {
        String s1="listen";
        String s2="tensli";
        final int CHAR=26;



        char c[]=new char[CHAR];
        if(s1.length()!=s2.length())
        {
            System.out.println("no anagram");
        }

        for (int i = 0; i <s1.length() ; i++) {
             c[s1.charAt(i)-'a']++;

             c[s2.charAt(i)-'a']--;

        }

        boolean flag=false;
        for (int i = 0; i <CHAR ; i++) {
            if(c[i]!=0)
            {
                flag=true;
                System.out.println("no anagram");
            }


        }
        if(flag==false)
        {
            System.out.println("anagram");
        }

    }
}
