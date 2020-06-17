package Text;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端
public class Text24 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            //创建服务器端口
            serverSocket = new ServerSocket(1001);
            //获取客户端内容
            accept = serverSocket.accept();
            //创建InputStream类，读取客户端内容
            inputStream = accept.getInputStream();
            //因为是字节流，使用此类防止乱码，将读取到的客户端内容输出到控制台
            byteArrayOutputStream = new ByteArrayOutputStream();
            int len;
            byte[] bytes = new byte[20];
            while((len = inputStream.read(bytes)) != -1){
                byteArrayOutputStream.write(bytes,0,len);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(byteArrayOutputStream != null){
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if(accept != null){
                    try {
                        accept.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }








       /* ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            //创建服务器的端口
            serverSocket = new ServerSocket(2132);
            //获取客服端的数据
            accept = serverSocket.accept();
            byte[] bytes = new byte[5];
            //读取传输过来的内容
            inputStream = accept.getInputStream();
            //因为是字节流，采取此类可以解决中文乱码问题
            byteArrayOutputStream = new ByteArrayOutputStream();
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                byteArrayOutputStream.write(bytes,0,len);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if( accept != null){
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if( byteArrayOutputStream != null){
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(serverSocket != null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }         */
    }
}
