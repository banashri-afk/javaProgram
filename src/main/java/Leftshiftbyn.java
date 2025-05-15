import java.util.Arrays;

public class Leftshiftbyn {
    public  static  void main(String[] args){
        int [] numbers={1,2,3,4,5,6,7};
        int n=3;
        for (int j=0;j<n;j++){
            int first=numbers[0];
            for (int i=0;i<numbers.length-1;i++){
                numbers[i]=numbers[i+1];
            }
            numbers[numbers.length-1]=first;

        }
        System.out.println(Arrays.toString(numbers));
    }
}
