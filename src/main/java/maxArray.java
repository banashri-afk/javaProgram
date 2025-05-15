public class maxArray {
    public  static  void main(String[] args){
        int[] arr={1,2,34,5,6,7,9};
        int max=arr[0];
        int min=arr[0];
        for(int num:arr){
            if (num>max){
                max=num;
            } else if (num<min) {
                min=num;
            }

            }
        System.out.println(max);
        System.out.println(min);

    }
}
