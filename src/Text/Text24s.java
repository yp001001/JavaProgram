package Text;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Text24s {
    public static void main(String[] args){
   /*     Socket socket = null;
        OutputStream outputStream = null;
        FileInputStream fileInputStream = null;
        try {
            //服务器IP
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            //服务器端口
            socket = new Socket(inetAddress,1001);
            //创建OutputStream类，写入到服务器
            outputStream = socket.getOutputStream();
            //寻找文件
            fileInputStream = new FileInputStream("D:\\IO\\GBK.txt");
            int len;
            byte[] bytes = new byte[20];
            while((len = fileInputStream.read(bytes)) != -1){
                outputStream.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if( socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(outputStream != null){
                    try {
                        outputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if( fileInputStream != null){
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }   */














        Socket socket = null;
        OutputStream outputStream = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress,2132);
            outputStream = socket.getOutputStream();
            outputStream.write("我是一名中国人".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if( socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
