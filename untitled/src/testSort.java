import java.util.Arrays;

/**
 * @version v1.0
 * @Author zhy
 * Description 默认
 */
public class testSort {


    public static void main(String[] args) {
        int[] arr = new int[]{5,3,7,2,9,8,1,4};
        new testSort().qucik(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public void qucik(int[] arr,int l,int r){
        if(l >= r) return;
        int i = partition(arr, l, r);
        qucik(arr,l,i-1);
        qucik(arr,i+1,r);
    }

    public int partition(int[] arr,int l,int r){
        int i = l;
        int pv = arr[r];
        for(int j = i;j<r;j++){
            if(arr[j] <= pv)
                swap(arr,j,i++);
        }
        swap(arr,i,r);
        return i;
    }

    public void swap(int[] arr,int j,int i){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
