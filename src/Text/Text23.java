package Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Text23 {
    public static void main(String args[])  {
        File file = new File("D:\\IO\\two.txt");
        Set.Set(file,4);

    }
}
class Set{
   private int number;
    public static void Set(File file,int number){
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(file,"rw");
            int x = (int)file.length();
            char[] c = new char[x-number];
            byte[] bytes = new byte[1024];
            StringBuilder stringBuilder = new StringBuilder();
            int len;
            while((len = randomAccessFile.read(bytes)) != -1){
                String str = new String(bytes,0,len);
                stringBuilder.append(str);
            }
            for(int i=number;i<x;i++){
              c[i-number] = stringBuilder.toString().charAt(i);
            }
            String s = new String(c);
            randomAccessFile.seek(number);
            randomAccessFile.write("wgretr".getBytes());
            randomAccessFile.seek(10);
            randomAccessFile.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(randomAccessFile != null){
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}