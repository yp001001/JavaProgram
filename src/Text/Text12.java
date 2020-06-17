package Text;

import java.io.*;

public class Text12 {
    public static void main(String args[]) {
        File file1 = null;
        FileReader fileReader = null;
        File file2 = null;
        FileWriter fileWriter = null;
        try {
             file1 = new File("D:\\IO\\FileIO\\five.txt");
            fileReader = new FileReader(file1);
            file2 = new File(file1.getParent(),"six.txt");
            fileWriter = new FileWriter(file2,false);
            int len;
            char[] c = new char[5];
            while((len = fileReader.read(c)) != -1){
                for(int i=0;i<len;i++){
                    fileWriter.write(c[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                if(fileWriter != null)
                fileWriter.close();
                if(fileReader != null)
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
