package Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Text17 {
    public static void main(String args[]){
        BufferedReader  bef = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            bef = new BufferedReader(isr);
            while(true){
                String str = bef.readLine();
                if("e".equals(str)  || "enter".equals(str) ){
                    break;
                }else{
                    str = str.toUpperCase();
                    System.out.println(str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bef != null){
                try {
                    bef.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
