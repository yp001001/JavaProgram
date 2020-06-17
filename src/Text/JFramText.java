package Text;

import javax.swing.*;
import java.awt.*;

public class JFramText {
    public static void main(String args[]) {
        final JFrame jframe = new JFrame();
        jframe.setVisible(true);
        jframe.setSize(500, 300);
        jframe.setLocation(400, 400);
        jframe.setTitle("我的窗口");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Button but1 = new Button("按钮");
        Container c = jframe.getContentPane();//获取窗体容器
        c.add(but1);
    }
}
