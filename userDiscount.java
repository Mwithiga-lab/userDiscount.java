import java.util.Scanner;

// userDiscount class
class userDiscount{

    // Method/Function to get the discount
    public static double get_discount(double amountSpend) {
        double discount;
        // To find discount in a boolean expression
        if (amountSpend > 5000) {
            discount = (10 * amountSpend) / 100;
        } else if (amountSpend > 1000 && amountSpend <= 5000) {
            discount = (5 * amountSpend) / 100;
        } else {
            discount = 0;
        }
        return discount;
    }

//Prompting the user to input there amount
    public static void main(String[] args) {
//Storing the input into the function
        try (Scanner disc = new Scanner(System.in)) {
            double amountSpend;
            System.out.println("Enter the amount: ");
            // Scan the input
            amountSpend = disc.nextDouble();

            double discount = get_discount(amountSpend);
            System.out.println("The discount is: " + discount);
        }
    }
}
