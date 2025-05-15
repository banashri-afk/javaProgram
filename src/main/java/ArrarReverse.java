import java.util.Arrays;

public class ArrarReverse {
    public static  void main(String[] args){
        int[]arr={1,0,1};
        int left=0;int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;

        }
        System.out.println(Arrays.toString(arr));
    }
}
