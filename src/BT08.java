import java.util.Scanner;

public class BT08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x;
        if (a==0 && b==0){
            if(c==0){
                System.out.println("Phuong trinh vo nghiem");
            }else{
                System.out.println("Phuong trinh vo so nghiem");
            }
        }else if (a==0 && b!=0){
            System.out.println((-c/b));
        }
        if (a!=0){
            double delta = b*b - 4*a*c;
            if (delta<0){
                System.out.println("Phuong trinh vo nghiem");
            }else if (delta==0){
                System.out.println(-b/2*a);
            }else {
                System.out.println("x1 = "+(-b+Math.sqrt(delta))/2*a + " x2 = "+(-b-Math.sqrt(delta))/2*a);
            }
        }
    }
}
