package Text;

import java.io.File;

public class Text8 {
    public static void main(String args[]){
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\IO");

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getName());  //获取名称
        System.out.println(file1.getPath());   //获取路径
        System.out.println(file1.getParent());  //获取上一层路径
        System.out.println(file1.length());   //获取文件长度
        System.out.println(file1.lastModified());  //获取最后一次修改时间
        System.out.println();

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getName());  //获取名称
        System.out.println(file2.getPath());   //获取路径
        System.out.println(file2.getParent());  //获取上一层路径
        System.out.println(file2.length());   //获取文件长度
        System.out.println(file2.lastModified());  //获取最后一次修改时间

        String[] list = file2.list();
        for(String str : list){
            System.out.println(str);
        }
        System.out.println();
        File[] files = file2.listFiles();
        for(File file5 : files){
            System.out.println(file5);
        }

    }
}
