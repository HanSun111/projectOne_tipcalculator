import java.util.Scanner;

public class TipCalc {
    public static void main(String[] args) {
        System.out.print("please input your bill: ");
        Scanner calculator = new Scanner(System.in);
        double bill = calculator.nextDouble();

        System.out.print("please input your desired tip percentage: ");
        double tipPercent = calculator.nextDouble();
    }
}
