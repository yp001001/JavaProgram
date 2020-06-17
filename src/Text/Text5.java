package Text;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Text5 {
    public static void main(String args[]){
        String arr[] = {"12345","67891","2631139135","67891","10232011","12346","12345"};
        HashSet hashSet = new HashSet();
        for(int i=0;i<arr.length;i++){
            hashSet.add(arr[i]);
        }
        for(Object obj : hashSet){
            System.out.println(obj);
        }
    }
}
