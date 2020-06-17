package Text;

import java.io.*;

public class Text16 {
    public static void main(String args[]){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            File file1 = new File("D:\\IO\\three.txt");
            File file2 = new File("D:\\IO\\GBK.txt");
            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            isr = new InputStreamReader(fis,"utf-8");
            osw = new OutputStreamWriter(fos,"gbk");

            int len;
            char[] c = new char[100];
            while((len = isr.read(c)) != -1){
                osw.write(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
           if( isr != null){
               try {
                   isr.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
           if( osw != null){
               try {
                   osw.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
        }
    }
}
