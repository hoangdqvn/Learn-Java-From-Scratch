import java.util.Scanner;

public class giaiPT{
    public void ptBacMot(float a, float b) {
        if (a == 0 && b == 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (a == 0 && b != 0) {
            System.out.println("Vo nghiem");
        } else {
            System.out.println("Phuong trinh co nghiem x = " + (-b / a));
        }
    }

    public void ptBacHai(float a, float b, float c) {
        float d, x1, x2;
        if (a == 0) {
            System.out.println("Vo nghiem");
        } else {
            d = b * b - 4 * a * c;
            if (d < 0) {
                System.out.println("Vo nghiem");
            } else if (d == 0) {
                System.out.println("Phuong trinh co nghiem kep x =" + (-b / (2 * a)));
            } else {
                x1 = (float) ((-b - Math.sqrt(d)) / (2 * a));
                x2 = (float) ((-b + Math.sqrt(d)) / (2 * a));
                System.out.println("Phuong trinh co 2 nghiem phan la:");
                System.out.println("x1="+x1);
                System.out.println("x2="+x2);
            }
        }

    }

    public static void main(String[] args) {
        float a, b, c;
        int ch;
        Giaiphuongtrinh Giaiphuongtrinh = new Giaiphuongtrinh();
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Phuong trinh bac nhat:ax+b=0");
        System.out.println("2.Phuong trinh bac hai:ax^2+bx+c=0");
        System.out.println("3.Thoat");

        while (true) {
            System.out.println("Chon: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Nhap a,b: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    Giaiphuongtrinh.BacNhat(a, b);
                    break;
                case 2:
                    System.out.println("Nhap a,b,c: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    c = sc.nextInt();
                    Giaiphuongtrinh.BacHai(a, b, c);
                    break;
                case 3:
                    return;
            }
        }
    }
}
