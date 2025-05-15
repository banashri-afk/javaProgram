public class arraycontainsspecific {
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 6, 8};
        int target = 2;
        boolean found = false;
        for (int n : num) {
            if (n == target) {
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("found");
        }
        else {
            System.out.println("not found");
        }
    }
}


