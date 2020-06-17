package Text;

import java.io.File;

public class Text10 {
    public static void main(String args[]){
          File file = new File("D:\\IO");
          FindFile.Find(file);
    }
}
class FindFile{
    public static void Find(File file){
        if(file.isDirectory()){   //判断是否是文件目录
            File[] files = file.listFiles();
            for(File file1 : files){
                Find(file1);
            }
        }
        System.out.println(file);
    }
}