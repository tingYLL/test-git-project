import java.util.Arrays;

/**
 * @version v1.0
 * @Author zhy
 * Description 默认
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{5,3,7,2,9,8,1,4};
        quick(a,0, a.length-1);
        System.out.println(Arrays.toString(a));
    }

    public static void quick(int[] a,int l,int h){
        if(l == h) return;

//        根据这次排序的基准点p，确定左右分区的上下限
        int p = partition(a,l,h);
//        递归
        partition(a,l,p-1);
        partition(a,p+1,h);
    }

    private static int partition(int[] a,int l,int h){
        int i = l;
        for(int j = l;j<h;j++){
            if(a[j] <= a[h]){
                swap(a,i++,j);
            }
        }
        swap(a,i,h);

//        经过这轮分区，可以下标为i的区间的左分区都比i下标所对应的元素小，右分区...大
        return i;
    }

    private static void swap(int[] a,int i,int h){
        int temp = a[h];
        a[h] = a[i];
        a[i] = temp;
    }

}
