import java.util.Scanner;

public class BT10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a, b, c, d: ");
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble(), d = scanner.nextDouble();

        if (a == 0) {
            solveQuadratic(b, c, d);
        } else {
            solveCubic(a, b, c, d);
        }
        scanner.close();
    }

    static void solveQuadratic(double a, double b, double c) {
        if (a == 0) {
            System.out.println(b == 0 ? (c == 0 ? "Vô số nghiệm" : "Vô nghiệm") : "Nghiệm: x = " + (-c / b));
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta >= 0) {
            System.out.println("Nghiệm: x1 = " + (-b + Math.sqrt(delta)) / (2 * a) + ", x2 = " + (-b - Math.sqrt(delta)) / (2 * a));
        } else {
            System.out.println("Vô nghiệm thực");
        }
    }

    static void solveCubic(double a, double b, double c, double d) {
        double delta0 = b * b - 3 * a * c, delta1 = 2 * b * b * b - 9 * a * b * c + 27 * a * a * d;
        double discriminant = delta1 * delta1 - 4 * delta0 * delta0 * delta0;
        if (discriminant > 0) {
            double C = Math.cbrt((delta1 + Math.sqrt(discriminant)) / 2);
            System.out.println("Nghiệm thực: x = " + (-1 / (3 * a) * (b + C + delta0 / C)));
        } else {
            double theta = Math.acos(delta1 / (2 * Math.sqrt(delta0 * delta0 * delta0)));
            for (int i = 0; i < 3; i++) {
                double x = -2 * Math.sqrt(delta0) * Math.cos((theta + 2 * Math.PI * i) / 3) - b / (3 * a);
                System.out.println("Nghiệm: x = " + x);
            }
        }
    }
}
