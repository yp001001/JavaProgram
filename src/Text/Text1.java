package Text;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Text1 {
    public static void main(String args[]){
        HashSet hashSet = new HashSet();
        ArrayList a = new ArrayList();
        ArrayList arrayList = M.Z(a);
        while(hashSet.size()<10) {
            int x = (int) (Math.random() * 62);
            int y = (int) (Math.random() * 62);
            int z = (int) (Math.random() * 62);
            Object str1 = arrayList.get(x);
            Object str2 = arrayList.get(y);
            Object str3 = arrayList.get(z);
            String str4 = String.valueOf(str1);
            String str5 = String.valueOf(str2);
            String str6 = String.valueOf(str3);
            String str = str4 + str5 + str6;
            hashSet.add(str);
        }
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

class M{

     public static ArrayList Z(ArrayList arrayList) {
         for (char i = 'a'; i <= 'z'; i++) {
             arrayList.add(i);
         }
         for (char i = 'A'; i <= 'Z'; i++) {
             arrayList.add(i);
         }
         for (char i = '0'; i <= '9'; i++) {
             arrayList.add(i);
         }
           return arrayList;
     }
}