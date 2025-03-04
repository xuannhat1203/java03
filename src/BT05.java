import java.util.Scanner;

public class BT05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        char n3 = sc.next().charAt(0);
        switch (n3) {
            case '*':
                System.out.println(n1 + " * " + n2 + " = " + (n2 * n1));
                break;
            case '/':
                if (n2 == 0){
                    System.out.println("Khong the chia cho 0");
                }else {
                    System.out.println(n1 + " / " + n2 + " = " + (n2 / n1));
                }
                break;
            case '+':
                System.out.println(n1 + " + " + n2 + " = " + (n2 + n1));
                break;
            case '-':
                System.out.println(n1 + " - " + n2 + " = " + (n2 - n1));
                break;
            default:
                System.out.println("Phep toan khong hop le");
                break;
        }
    }
}
