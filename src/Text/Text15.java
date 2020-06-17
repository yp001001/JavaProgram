package Text;

import java.io.*;
import java.nio.CharBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Text15 {
    public static void main(String args[]) throws IOException {
       Map<Character,Integer> map = new HashMap<>();
       File file = new File("D:\\IO\\two.txt");
        FileReader fi = new FileReader(file);
        int len;
       char[] c = new char[1];
        while((len = fi.read(c)) !=-1){
            if(map.get(c[0]) == null){
                map.put(c[0],1);
            }else{
                map.put(c[0],((int)map.get(c[0]))+1);
            }
        }
       File file2 = new File("D:\\IO\\eight.txt");
        FileWriter fw = new FileWriter(file2);
        Set<Character> characters = map.keySet();
        Iterator<Character> iterator = characters.iterator();
        while(iterator.hasNext()){
            char x =iterator.next();
            int i = map.get(x);
            fw.write(x+"="+i+"\n");
        }
        fi.close();
        fw.close();
    }
}

