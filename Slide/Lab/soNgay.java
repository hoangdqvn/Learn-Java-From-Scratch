import java.util.Scanner;

public class soNgay {
    public static void main(String[] args) {
        int thang, nam;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap thang : ");
            thang = sc.nextInt();
        } while (!(thang >= 1 && thang <= 12));
        do {
            System.out.println("Nhap nam : ");
            nam = sc.nextInt();
        }while (!(nam>0));


        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang ==12) {
            System.out.println("Thang " + thang + " co 31 ngay");} 
	else if (thang == 2) {
            if ((nam % 4 == 0) && (nam % 100 != 0) || (nam % 400 == 0)) {
                System.out.println("Thang 2 co 29 ngay");
            } else {
                System.out.println("Thang 2 co 28 ngay");
            }}
	else {
            System.out.println("Thang " + thang + " co 30 ngay");
        }
    }
}
