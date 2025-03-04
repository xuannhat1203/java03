import java.util.Scanner;

public class BT09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số (100-999): ");
        int n = scanner.nextInt();

        if (n < 100 || n > 999) {
            System.out.println("Số không hợp lệ");
        } else {
            String[] words = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
            System.out.println(words[n / 100] + " trăm " + (n % 100 == 0 ? "" : (n % 100 < 10 ? "lẻ " : "") + (n % 100 < 20 ? "mười " : words[(n / 10) % 10] + " mươi ") + (n % 10 == 0 ? "" : (n % 10 == 1 && n / 10 > 1 ? "mốt" : (n % 10 == 5 && n / 10 > 1 ? "lăm" : words[n % 10])))));
        }

        scanner.close();
    }
}
