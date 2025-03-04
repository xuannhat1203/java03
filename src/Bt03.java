import java.util.Scanner;

public class Bt03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap diem trung binh cua sinh vien: ");
        double n = sc.nextDouble();
        if (n < 5){
            System.out.println("Hoc sinh yeu");
        }else if ( n < 6.5){
            System.out.println("Hoc sinh trung binh");
        }else if ( n < 8.5){
            System.out.println("Hoc sinh kha");
        }else if ( n < 10.0){
            System.out.println("Hoc sinh gioi");
        }else {
            System.out.println("Diem khong hop le");
        }
    }
}
