import java.util.Scanner;

public class BT07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a==b && a==c){
            System.out.println("tam giac deu");
        }else if (a==b || a==c || b==c){
            System.out.println("tam giac can");
        }else if (a*a == b*b + c*c || b*b == c*c + a*a || c*c == b*b + a*a  ){
            System.out.println("tam giac vuong");
        }else if (a+b>c || a+c > b || a+c > b){
            System.out.println("Khong phai tam giac");
        }else {
            System.out.println("tam giac thuong");
        }
    }
}
