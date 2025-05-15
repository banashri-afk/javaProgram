import java.util.Arrays;

public class Shift1and0leftright {
    public static void main (String[]args){

            int[] nm = {1, 0, 1, 0, 1, 0};
            int countones=0;
            for (int n:nm){
                if (n==1){
                    countones++;
                }
            }
          for (int i=0;i<nm.length;i++){
              if (i<countones){
                  nm[i]=1;
              }
              else{
                  nm[i]=0;
              }
          }
        System.out.println(Arrays.toString(nm));
    }
}
