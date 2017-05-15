package hashMapReharse.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by rob on 5/15/17.
 */
public class HashMapMulValTest {

   private static  Map<Boolean,Integer> map;




    public static void main(String[] args) {
        map = new HashMap<Boolean,Integer>();
        Random rand = new Random();
        for(int i=0;i<10;i++) {
            if (i % 2 == 0) {
                map.put(true, new Integer(i));
            } else {
                map.put(false, new Integer(i));
            }
        }
         System.out.print(map.get(false));
         System.out.println();
         System.out.print(map.get(false));
         System.out.print("\n"+map);

        }


    }




