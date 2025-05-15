import java.util.*;

public class RemoveDuplactesfromlist
{
    public  static void main(String[] args){
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,5,4,4,5,6,8,9));
        Set<Integer> set=new HashSet<>(list);

        List<Integer> list1=new ArrayList<>(set);

        System.out.println(list1);
    }
}
