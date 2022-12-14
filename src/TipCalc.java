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

        double totalTip = Math.round(((tipPercent / 100.00) * bill) * 100.00) / 100.00;
        double totalPerPerson = Math.round(((totalTip + bill) / numOfPpl) * 100.00) / 100.00;
        double tipPerPerson = totalTip / numOfPpl;
        System.out.println("Total tip: $" + String.format("%.2f", totalTip));
        System.out.println("Tip per person: $" + String.format("%.2f", tipPerPerson));
        System.out.println("Total amount: $" + String.format("%.2f", totalTip + bill));
        System.out.println("Total per person: $" + String.format("%.2f", totalPerPerson));


    }
}