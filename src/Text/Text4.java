package Text;

import java.util.ArrayList;
import java.util.List;

public class Text4 {
    public static void main(String args[]){
        List list = new ArrayList();
        list.add(21);
        list.add(29);
        list.add(10);
        list.add(22);
        ListText.ListText(list,21);
    }
}
class ListText{
    public static void ListText(List list,Object obj){
        System.out.println(list.contains(obj));
    }
}