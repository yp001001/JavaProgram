package Text;

import java.util.HashMap;
import java.util.Set;

public class Text2 {
    public static void main(String args[]){
        StringBuffer str = new StringBuffer();
        for(int i=0;i<4;i++) {
            while(str.length()<8) {
                int x = (int) (Math.random() * 10);
                String X = String.valueOf(x);
                str.append(x);
            }
            System.out.println(str.toString());
            str.delete(0,8);
        }
        HashMap a = new HashMap();
        Set set = a.entrySet();
    }
}
