public class binarySerach
{
    public  static  void main(String[] args){
        int[] arr={1,2,5,6,7,8,8,9,13,24};

        int key =13;
        int low=0;
        int high=arr.length-1;
        int result=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if (arr[mid]==key){
                result=mid;
                break;
            } else if (arr[mid] <key){
                low=mid+1;
                
            } else if (arr[mid]>key ){
                high=mid-1;

            }
        }
        if (result!=-1){
            System.out.println("found  at index " +result);
        }
        else {
            System.out.println("result not found ");
        }
    }


}
