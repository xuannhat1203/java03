import java.util.Scanner;

public class BT01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap so can kiem tra: ");
        int n = sc.nextInt();
        sc.nextLine();
        if (n%2==0){
            System.out.println("So"+" "+n + " " + "la so chan");
        }else if (n%2 != 0){
            System.out.println("So"+" "+n + " " + "la so le");
        }else{
            System.out.println("Khong phai la so chan cung khong phai la so le");
        }
    }
}
