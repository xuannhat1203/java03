import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap he so a: ");
        double a = sc.nextDouble();

        System.out.print("Nhap he so b: ");
        double b = sc.nextDouble();

        System.out.print("Nhap he so c: ");
        double c = sc.nextDouble();

        System.out.print("Nhap he so d: ");
        double d = sc.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println(d == 0 ? "Phuong trinh co vo so nghiem" : "Phuong trinh vo nghiem");
                } else {
                    System.out.println("Nghiem cua phuong trinh la: x = " + (-d / c));
                }
            } else {
                double delta = c * c - 4 * b * d;
                if (delta > 0) {
                    double x1 = (-c + Math.sqrt(delta)) / (2 * b);
                    double x2 = (-c - Math.sqrt(delta)) / (2 * b);
                    System.out.println("Phuong trinh co hai nghiem phan biet: x1 = " + x1 + ", x2 = " + x2);
                } else if (delta == 0) {
                    System.out.println("Phuong trinh co nghiem kep: x = " + (-c / (2 * b)));
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
        } else {
            double f = ((3 * c / a) - (b * b / (a * a))) / 3;
            double g = ((2 * Math.pow(b, 3) / Math.pow(a, 3)) - (9 * b * c / Math.pow(a, 2)) + (27 * d / a)) / 27;
            double h = (Math.pow(g, 2) / 4) + (Math.pow(f, 3) / 27);

            if (h > 0) {
                double R = -(g / 2) + Math.sqrt(h);
                double S = Math.cbrt(R);
                double T = -(g / 2) - Math.sqrt(h);
                double U = Math.cbrt(T);
                double x1 = (S + U) - (b / (3 * a));
                System.out.println("Phuong trinh co mot nghiem thuc duy nhat: x1 = " + x1);
            } else if (h == 0 && f == 0 && g == 0) {
                double x1 = -Math.cbrt(d / a);
                System.out.println("Phuong trinh co mot nghiem thuc duy nhat: x1 = " + x1);
            } else {
                double i = Math.sqrt((Math.pow(g, 2) / 4) - h);
                double j = Math.cbrt(i);
                double k = Math.acos(-(g / (2 * i)));
                double L = -j;
                double M = Math.cos(k / 3);
                double N = Math.sqrt(3) * Math.sin(k / 3);
                double P = -(b / (3 * a));

                double x1 = 2 * j * Math.cos(k / 3) - (b / (3 * a));
                double x2 = L * (M + N) + P;
                double x3 = L * (M - N) + P;

                System.out.println("Phuong trinh co ba nghiem thuc: x1 = " + x1 + ", x2 = " + x2 + ", x3 = " + x3);
            }
        }
        sc.close();
    }
}
