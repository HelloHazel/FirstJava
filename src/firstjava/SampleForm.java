package firstjava;

import javax.swing.*;
import java.util.Locale;

public class SampleForm {
    public static void main(String[] args) {
        var frm = new JFrame("테스트");
        frm.setSize(500,400);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var txt1 = new JTextField();
        frm.add("North", txt1);

        var txt2 = new JTextField();
        frm.add("South", txt2);

        var btn = new JButton("대문자");
        frm.add(btn);

        btn.addActionListener(ae ->
                txt2.setText(txt1.getText().toLowerCase()));

        frm.setVisible(true);

    }
}
