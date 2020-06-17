package Text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Text3 {
    public static void main(String args[]){
        int arr[] = new int[10];
        for(int i=0;i<10;i++){
            int x = (int)(Math.random() * 100)+1;
            arr[i] = x;
        }
        List list= new ArrayList();
        for(int i=0;i<10;i++){
            if(arr[i]>10){
                list.add(arr[i]);
            }
        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
