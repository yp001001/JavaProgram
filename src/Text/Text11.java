package Text;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Text11 {
    public static void main(String args[])  {
        try {
            File file = new File("D:\\IO\\FileIO\\five.txt");
            FileReader read = new FileReader(file);
            char[] c = new char[5];
            int len;   //len获取读取长度，若到文件末尾无内容不能读取了返回-1
            while((len = read.read(c)) != -1){
               //错误写法
             /*  for(int i=0;i<c.length;i++){
                   System.out.print(c[i]);
               }  会将原来的字符覆盖，由于最后字符数不够，则开始的最后几个不能覆盖的字符仍然保留在c中，输出会一起输出     */

             //正确写法--------->方式一
           //    for(int i=0;i<len;i++){
           //        System.out.print(c[i]);
            //   }

               //错误写法二------------>原因与一一致
             //  String str = new String(c);
             //  System.out.print(str);

               //正确写法二
               String str = new String(c,0,len);
               System.out.print(str);
           }
            if(read != null)
            read.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
