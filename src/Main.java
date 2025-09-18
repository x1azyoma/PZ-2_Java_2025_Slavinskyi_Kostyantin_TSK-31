public class Main {
    public static void main(String[] args) {
        // Вираз 1
        double a1 = 2.54, b1 = 1.23, c1 = -0.23 , d1 = -0.23; //причина NaN в доданку: c1 = -2.14 аргумент Math.acos(...) повинен бути в межах [−1,1], тому я замінив його на -0.23, це найпростіше рішення цієї помилки
        double y1 = 2 * Math.cos(Math.pow(a1, b1))
                + Math.abs(Math.acos(-Math.sqrt(c1 / d1)));
        System.out.println("Результат вираз 1 (y1): " + y1);

        // Вираз 2
        double a2 = 1.25 , b2 = -1 , c2 = 4.25 , d2 = 0.56 ;
        double y2 = 2 * Math.sqrt(Math.tan(a2) / Math.abs(Math.acos(b2))) // Щоб формула працювала, треба, щоб b2 було в діапазоні [-1,1], тому аргумент я замінив
                - 3 * Math.cbrt(Math.exp(c2 - a2) * Math.sinh(d2));
        System.out.println("Результат вираз 2 (y2): " + y2);

        // Вираз 3
        double a3 = 2.98, b3 = 5.55, c3 = 0.045, d3 = 0.129;
        double y3 = (Math.pow(a3, b3) / Math.cosh(Math.abs(b3))) + 4 * (Math.log10(c3) / Math.pow(d3, 0.5));
        System.out.println("Результат вираз 3 (y3): " + y3);
    }
}