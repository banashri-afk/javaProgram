public class CheckArraySorted {
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5,6,7,8};
        boolean acending=true;
        boolean decending=true;
        for (int i=0;i<numbers.length-1;i++) {
            if (numbers[i] > numbers[i + 1]) {
                acending = false;
            } else if (numbers[i] < numbers[i + 1]) {
                decending = false;

            }
        }
            if(acending){
                System.out.println("the numbers are acending");
            } else if (decending) {
                System.out.println("the numbers are decending");
            }
            else{
                System.out.println("the numbers are not in order");
            }
        }
    }

