package Text;

import java.io.*;
import java.util.Properties;

public class Text26 {
    public static void main(String[] args) throws IOException {
//        Properties p = new Properties();
        //方式一
//        FileReader fileReader = new FileReader("src//Jdbc");
//        p.load(fileReader);
//        String name = p.getProperty("name");
//        String id = p.getProperty("id");
//        System.out.println(name+":"+id);
        //方式二
//        ClassLoader classLoader = Text26.class.getClassLoader();
//        InputStream resourceAsStream = classLoader.getResourceAsStream("Jdbc");//getResourceAsStream方法获取内容
//        InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream);
//        p.load(inputStreamReader);
//        String name = p.getProperty("name");
//        String id = p.getProperty("id");
//        System.out.println(name+":"+id);
        Properties properties = new Properties();
    /*    FileInputStream fileInputStream = new FileInputStream("src//Jdbc");
        properties.load(fileInputStream);
        //需要使用转换流：防止乱码
        String name = properties.getProperty("name");
        String id = properties.getProperty("id");
        System.out.println(name+":"+id);   */
      ClassLoader classLoader = Text26.class.getClassLoader();
        InputStream jdbc = classLoader.getResourceAsStream("Jdbc");
        properties.load(jdbc);
        //下面一样


    }
}
