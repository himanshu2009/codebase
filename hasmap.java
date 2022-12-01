

import java.util.HashMap;
import java.util.Map;


public class hasmap {

    static int func(int a[],int k) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i : a) {

            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == k) {
                return entry.getKey();
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int a[]=new int[]{5,5,5,6,7,1,2};
        System.out.println(func(a,3));
    }

}
