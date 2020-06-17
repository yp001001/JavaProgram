package Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text7 {
    public static void main(String args[]){
        String str = "abcbcbabcbccbd";
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        int i=0;
        if(str.contains(x)){
            while(str.indexOf(x,i) != -1){
                System.out.println(str.indexOf(x,i)+",");
                i = str.indexOf(x,i)+x.length();
            }
        }else{
            System.out.println("该字符串中不含此子类");
        }

        System.out.println("请输入随机生成的字符串长度");
        int n = input.nextInt();
        List list = new ArrayList();
        StringBuilder str2 = new StringBuilder();
        for(int j=0;j<10;j++){
            list.add(j);
        }
        for(char j='a';j<='z';j++){
            list.add(j);
        }
        for(char j='A';j<='Z';j++){
            list.add(j);
        }
     //   System.out.println(list.size());
     //   System.out.println(list);
       for(int j=0;j<n;j++) {
            int m =(int)(Math.random()*62);
            Object obj = list.get(m);
            str2.append(obj.toString());
        }
       System.out.println(str2.toString());
    }
}
