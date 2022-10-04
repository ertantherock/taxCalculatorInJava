import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double cost;
        double taxRate = 1.18;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the cost: ");
        cost = input.nextDouble();

        System.out.println("Total cost including VAT: " + cost*taxRate);
    }
}
