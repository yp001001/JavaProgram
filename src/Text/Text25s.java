package Text;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Text25s {
    public static void main(String[] args)  {
        Socket socket = null;
        OutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            socket = new Socket(inetAddress,9999);
            outputStream = socket.getOutputStream();
            FileInputStream fileInputStream = new FileInputStream("D:\\IO\\GBK.txt");
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            int len;
            byte[] bytes = new byte[1024];
            while((len = bufferedInputStream.read(bytes)) != -1){
                outputStream.write(bytes,0,len);
            }
            socket.shutdownOutput();
            InputStream inputStream = socket.getInputStream();
            ByteArrayOutputStream byteArrayOutputStream1 = new ByteArrayOutputStream();
            int lens;
            byte[] bytes1 = new byte[5];
            while((lens = inputStream.read(bytes1)) != -1){
               byteArrayOutputStream1.write(bytes1);
            }
            System.out.println(byteArrayOutputStream1.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedInputStream != null){
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(socket != null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream != null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
