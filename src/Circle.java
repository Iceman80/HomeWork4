import java.util.Scanner;

class Circle {
    public double x; // абсцисса центра
    public double y; // ордината центра
    public double r; // радиус

    public Circle(double a, double b, double s) {
        x = a;
        y = b;
        r = s;
    }

    // №8
    public Circle() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Task 8");
        System.out.println(" Введите абсциссу центра");
        x = sc.nextDouble();
        System.out.println(" Введите ординату центра");
        y = sc.nextDouble();
        System.out.println(" Введите радиус");
        r = sc.nextDouble();
    }

    public void printCircle() {
        System.out.println("Окружность с центром (" + x + ";" + y + ") и радиусом " + r);
    }

    public void moveCircle(double a, double b) {
        double x1 = x + a;
        double y1 = y + b;
        System.out.println("Центр окружности перемещен в точку с координатами x " + x1 + ", y " + y1);
    }

    // №6
    public void circleLength() {
        System.out.printf("Длина окружности радиусом %.2f равна %.2f \n", r, (2 * Math.PI * r));
    }

    // №7
    public void moveGenerator() {
        double a1 = Math.round(((Math.random() * 200) - 100) * 100.0) / 100.0;
        double a2 = Math.round(((Math.random() * 200) - 100) * 100.0) / 100.0;
        moveCircle(a1, a2);
    }

    public static void main(String[] args) {
        Circle o2 = new Circle(1, -1, 14);
        o2.printCircle(); // Окружность с центром (1.0;-1.0) и радиусом 14.0
        System.out.println(" Task 6");
        o2.circleLength();
        System.out.println(" Task 7");
        o2.moveGenerator();
        Circle o1 = new Circle();
        // №9
        o1.printCircle();
        System.out.println(" Task 9");
        double dis = Math.hypot(o2.x - o1.x, o2.y - o1.y);
        System.out.printf("The distance between the center of the circle %.2f \n", dis);
        System.out.println(" Task 10");
        // №10
        if (Math.abs(o2.r + o1.r)<dis || Math.abs(o2.r - o1.r) > dis) {
            System.out.println("Окружности не пересекаются");
        } else if (Math.abs(o2.r + o1.r)==dis || Math.abs(o2.r - o1.r) == dis) {
            System.out.println("Окружности пересекаются в одной точке");
        } else System.out.println("Окружности пересекаются в 2 точках");

    }
}