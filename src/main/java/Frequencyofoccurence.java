import java.util.HashMap;
import java.util.Iterator;

public class Frequencyofoccurence {
    public  static  void main (String[] args){
        String input="hello word";

        HashMap <Character, Integer>frencynum=new HashMap<>();

        for (char c:input.toCharArray()){
            if(c==' '){
                continue;
            }
          else  if (frencynum.containsKey(c)){
               frencynum.put(c,frencynum.get(c)+1);

           }
           else{
               frencynum.put(c,1);
           }
        }
        System.out.println(frencynum);
    }
}
