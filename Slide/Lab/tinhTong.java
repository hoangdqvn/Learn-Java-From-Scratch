import javax.swing.*;

public class tinhTong{
    public static void main(String[] args) {
        String soR;
        int i;
        Double t,sum=0.0;
        do {
            soR = JOptionPane.showInputDialog(null, "Nhap so thuc: ",
                    "Input", JOptionPane.INFORMATION_MESSAGE);
            t=Double.parseDouble(soR);
            sum+=t;
            i = JOptionPane.showConfirmDialog(null,
                    "Co nhap tiep hay khong?", "Xac nhan nhap tiep",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        } while (i == JOptionPane.YES_OPTION);
        JOptionPane.showMessageDialog(null,  "Tong la:" + sum,
               "Message", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

