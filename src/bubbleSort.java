import java.lang.reflect.Array;

public class bubbleSort {

    public static void main (String[] Args){

        int[] a = {54,239,53,7893,45};

        int n = 5;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++)
                if (a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
        }

        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);



    }

}
