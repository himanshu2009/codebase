import java.util.HashMap;

public class RemoveduplicateUNsorted {

   static HashMap<Integer,Boolean>hs=new HashMap();
    public static void main(String[] args) {
        int arr[]=new int[]{1,5,2,7,4,1,2,4};

        for(int i=0;i<arr.length;i++)
        {
            if(hs.get(arr[i])==null)
            {
                System.out.println(arr[i]);
            }
            hs.put(arr[i],true);
        }





    }
}
