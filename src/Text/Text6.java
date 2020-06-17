package Text;

import java.util.HashMap;

public class Text6 {
    public static void main(String args[]){
        HashMap hashMap = new HashMap();
        hashMap.put("Lisa",123);
        hashMap.put("java",124);
        Object obj = hashMap.values();
        System.out.println(obj);

    }
}
