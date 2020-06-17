package Text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Integer.compare;

public class Text34 {
    public static void main(String[] args) {
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println("1111111111111");
           }
       };
       runnable.run();
       Runnable runnable2 =()-> {
            System.out.println("2222222222222222");
        };
       runnable2.run();

        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare(100,99));
        Comparator<Integer> comparator1 = (o1,o2) ->{
                return o1.compareTo(o2);
        };
        System.out.println(comparator1.compare(99, 100));
    }

}
