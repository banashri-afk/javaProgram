public class IndexOfarray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30; // Element to find

        int index=-1;
        for (int i=0;i<numbers.length-1;i++){
            if (numbers[i]==target){
                index=i;
            }
        }
        if(index!=-1){
            System.out.println(index);
        }
        else{
            System.out.println("not found");
        }
    }
}
