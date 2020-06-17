package Text;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Text22 {
    public static void main(String args[]){
        RandomAccessFile rda = null;
        try {
            rda = new RandomAccessFile(new File("D:\\IO\\two.txt"),"r");
            int len;
            byte[] bytes = new byte[5];
            while((len = rda.read(bytes)) != -1){
                String str = new String(bytes);
                char[] c = new char[5];
                c = str.toCharArray();
                String str2 = new String(c,0,len);
                System.out.print(str2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(rda != null){
                try {
                    rda.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
