package Text;

import java.io.File;

public class Text9 {
    public static void main(String args[]){
     /*   File file1 = new File("D:\\IO\\FileIO\\five.txt");
        System.out.println(file1.exists());
        File file2 = new File(file1.getParent());
        boolean delete = file2.delete();   */
     File file1 = new File("D:\\IO");
        String[] list = file1.list();
        for(String str : list){
            if(str.endsWith(".jpg")){
                System.out.println("存在");
            }
        }

    }
}
