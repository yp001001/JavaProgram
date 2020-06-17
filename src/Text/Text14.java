package Text;

import java.io.*;

//解密改路径即可

public class Text14 {
    public static void main(String args[]){
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        try {
            bi = new BufferedInputStream(new FileInputStream(new File("D:\\IO\\FileIO\\1.jpg")));
            bo = new BufferedOutputStream((new FileOutputStream(new File("D:\\IO\\FileIO\\5.jpg"),false)));
            byte[] bytes = new byte[1024];
            int len;
            while((len = bi.read(bytes)) != -1){
                for(int i=0;i<len;i++){
                    bytes[i] = (byte)(bytes[i] ^ 5);
                }
                bo.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(bi != null){
                try {
                    bi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bo != null){
                try {
                    bo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
