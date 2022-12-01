import java.util.LinkedHashMap;
import java.util.Map;

public class first_element_to_occut_k_times {
    public static void main(String[] args) {
        int a[] = new int[]{
                4, 2, 2, 2, 3, 4, 4, 4, 3, 2
        };

        int k = 3;


        int firstele = -1;
        Map<Integer, Integer> map = new LinkedHashMap();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                map.put(a[i], 1 + map.get(a[i]));
            } else {
                map.put(a[i], 1);
            }
            if (map.get(a[i]) == k) {
                firstele = a[i];
                break;
            }

        }
        System.out.println(firstele);
    }
}