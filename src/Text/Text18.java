package Text;

import java.io.*;
import java.util.Scanner;

public class Text18 {
    public static void main(String args[]) {
        BufferedReader bfd = null;  //isr为Reader类型
        Scanner input = new Scanner(System.in);
        try {
            InputStreamReader isr = new InputStreamReader(System.in);//System.in返回值为InputStream类型
            bfd = new BufferedReader(isr);
            while(true){
                String str = bfd.readLine();
                if("e".equals(str) || "exict".equals(str)){
                    System.out.println("退出程序");
                    break;
                }else{
                    int choose;
                    choose = input.nextInt();
                    input.nextLine();
                    switch(choose){
                        case 1:
                            System.out.println(Stream.BeInt(str));
                            break;
                        case 2:
                            System.out.println(Stream.BeBoolean(str));
                            break;
                        case 3:
                            System.out.println(Stream.BeByte(str));
                            break;
                        case 4:
                            System.out.println(Stream.BeChar(str));
                            break;
                        case 5:
                            System.out.println(Stream.BeFloat(str));
                            break;
                        default:
                            System.out.println("参数类型不一致");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(bfd != null){
                try {
                    bfd.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class Stream{

    public static int BeInt(String str){
        return Integer.parseInt(str);
    }
    public static char[] BeChar(String str){
        return str.toCharArray();
    }
    public static boolean BeBoolean(String str){
        return Boolean.parseBoolean(str);
    }
    public static float BeFloat(String str){
        return Float.parseFloat(str);
    }
    public static byte[] BeByte(String str){
        return str.getBytes();
    }
}

