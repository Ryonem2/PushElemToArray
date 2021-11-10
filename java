import java.util.*;

public class addElement {

    public static int[] addX(int len, int arr[], int a, int pos) {
        int i;

        int newarr[] = new int[len+1];

        if (pos < 0 || pos > len) {
            for(i=0;i<len;i++) {
                newarr[i] = arr[i];
            }
                newarr[len] = a;
        } else {
            for (int j = 0; j < pos; j++) {
                newarr[j] = arr[j];
            }
            newarr[pos] = a;
            for (int k = pos+1; k < len+1; k++) {
                newarr[k] = arr[k-1];
            }
        }

            return newarr;
    }
    public static void main (String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //pos -1 == last index
        int pos = sc.nextInt();
        int len = arr.length;

        int newarr[];
        newarr = addX(len,arr,a,pos);

        System.out.println(Arrays.toString(newarr));

        sc.close();

    }
}
