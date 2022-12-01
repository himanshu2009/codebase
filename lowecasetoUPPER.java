public class lowecasetoUPPER {
    static String convetii(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                char p = (char) ( s.charAt(i)-32 );
                result += p;

            }

        }
        return result;
    }
    public static void main(String[] args) {
        String s="himanshu";
        System.out.println(convetii(s));
    }
}
