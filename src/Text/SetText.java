package Text;

import java.util.*;

public class SetText {
    public static void main(String args[]){
   /*     int x;
        List list = new ArrayList();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<10;i++) {
            System.out.println("请输入你的第" + (i + 1) + "个数");
            x = input.nextInt();
            list.add(x);
        }
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);   */

       Map map = new HashMap();
       map.put(100,"小明");
       map.put(99,"小章");
       map.put(93,"小杨");
       map.put(87,"小孙");
       Collection y = map.keySet();
    /*   Comparator c= new Comparator() {
           @Override
           public int compare(Object o1, Object o2) {
               if (o1 instanceof HashMap && o2 instanceof HashMap) {
                   HashMap o3 = (HashMap) o1;
                   HashMap o4 = (HashMap) o2;
                   if (o3.)
               }
               throw new RuntimeException("类型不一致");
           }
       };  */
       System.out.println(y);
       for(int i=0;i<3;i++){
           System.out.println(map.get(Collections.max(y)));
           y.remove(Collections.max(y));
       }

    }
}