import java.util.Scanner;

public class TipCalc {
    public static void main(String[] args) {
        System.out.print("please input your bill: $");
        Scanner calculator = new Scanner(System.in);
        double bill = calculator.nextDouble();

        System.out.print("please input your desired tip percent: ");
        double tipPercent = calculator.nextDouble();

        System.out.print("please input number of people in your party: ");
        int numOfPpl = calculator.nextInt();

        double tipPerPerson = Math.round(((tipPercent/100.00) * bill) * 100.00) / 100.00;


        double totalPerPerson = Math.round((tipPerPerson + bill / numOfPpl) * 100.00) / 100.00;

        System.out.println("Tip per person: $" + tipPerPerson);
        System.out.println("Total per person: $" + totalPerPerson);
    }
}
