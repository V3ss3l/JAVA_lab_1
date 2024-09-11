package exercise_1;

import java.util.Scanner;

public class ReshenieKvadratnihUravnenii {

    public static void reshenie(){
        System.out.println("---- Начало работы первого задания ----");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tВведите коэффициенты в формате a,b,c");
        String line = scanner.nextLine();
        String[] separatedLine = line.split(",");
        var result = resultValue(Double.parseDouble(separatedLine[0]),
                Double.parseDouble(separatedLine[1]), Double.parseDouble(separatedLine[2]));
        System.out.printf("---- Решение уравнения - %s, %s\n", result.getFirstRoot(), result.getSecondRoot());
    }

    private static ResultRoots<Double, Double> resultValue(double a, double b, double c){
        var D = Discriminant.discriminantValue(a, b, c);
        if(D < 0) return new ResultRoots<>(0.0, 0.0);
        else if(D > 0) new ResultRoots<>(firstRoot(D, a, b), secondRoot(D, a, b));
        else new ResultRoots<>(specialRoot(a, b), 0.0);
        return null;
    }

    private static double firstRoot(double discriminant, double a, double b){
        return (-b - Math.sqrt(discriminant)) / 2*a;
    }

    private static double secondRoot(double discriminant, double a, double b){
        return (-b + Math.sqrt(discriminant)) / 2*a;
    }

    private static double specialRoot(double a, double b){
        return (-b) / 2*a;
    }

    protected static class Discriminant {
        static double discriminantValue(double a, double b, double c){
            return Math.pow(b, 2) - 4 * a * c;
        }
    }
}
