package Text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Text13 {
    public static void main(String args[]){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File file1 = new File("D:\\IO\\FileIO\\1.jpg");
            fileInputStream = new FileInputStream(file1);
            File file2 = new File(file1.getParent(),"2.jpg");
            fileOutputStream = new FileOutputStream(file2);
            int len;
            byte[] bytes = new byte[10];
            while((len = fileInputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
