import javax.swing.*;

public class Ex4 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Write A:");
        String b = JOptionPane.showInputDialog("Write B:");
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int s = 0;
        for (int i = 0; i < b1; i++) {
            s += a1;
        }
        JOptionPane.showMessageDialog(null, "Result: " + s);
    }
}
