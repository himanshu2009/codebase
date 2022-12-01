public class moveallnegative {//move all negative to starting and posituve at ending;

    public static void main(String[] args) {
        int a[]=new int[]{3,-5};

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                for(int j=i+1;j<a.length;j++)
                {
                     if(a[j]<0){
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;

                    }
                     else{
                         continue;
                     }
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }

    }

}
