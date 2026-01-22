// Write a java program to implement the concept of function overloading by performing different bussiness related operations.
// Create a class which contains a method named 'calculate' to perform the following operations:
// 1. Calculate profit (Given cost price and selling price)
// 2. Calculate loss percentage (Given cost price and selling price)
// 3. Calculate price after discount (Given marked price and discount percentage)
// 4. Calculate Simple Interest (Given principal amount, rate of interest and time)
// Use function overloading to implement the 'calculate' method for each of the above operations.

package Simply;
public class BusinessCalculator {

    // 1. Calculate Profit
    // Signature: (int, int)
    public void calculate(int costPrice, int sellingPrice) {
        if (sellingPrice > costPrice) {
            int profit = sellingPrice - costPrice;
            System.out.println("--- Profit Calculation ---");
            System.out.println("Cost Price: " + costPrice);
            System.out.println("Selling Price: " + sellingPrice);
            System.out.println("Total Profit: " + profit);
        } else {
            System.out.println("No profit made (Selling Price must be greater than Cost Price).");
        }
        System.out.println();
    }

    // 2. Calculate Loss Percentage
    // Signature: (double, double)
    public void calculate(double costPrice, double sellingPrice) {
        if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            double lossPercentage = (loss / costPrice) * 100;
            
            System.out.println("--- Loss Percentage Calculation ---");
            System.out.printf("Cost Price: %.2f%n", costPrice);
            System.out.printf("Selling Price: %.2f%n", sellingPrice);
            System.out.printf("Loss Percentage: %.2f%%%n", lossPercentage);
        } else {
            System.out.println("No loss made (Cost Price must be greater than Selling Price).");
        }
        System.out.println();
    }

    // 3. Calculate Price after Discount
    // Signature: (double, int) - Differentiated by using int for the percentage
    public void calculate(double markedPrice, int discountPercentage) {
        double discountAmount = (markedPrice * discountPercentage) / 100;
        double priceAfterDiscount = markedPrice - discountAmount;

        System.out.println("--- Discount Calculation ---");
        System.out.printf("Marked Price: %.2f%n", markedPrice);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.printf("Price after Discount: %.2f%n", priceAfterDiscount);
        System.out.println();
    }

    // 4. Calculate Simple Interest
    // Signature: (double, double, double) - Differentiated by number of arguments (3)
    public void calculate(double principal, double rate, double time) {
        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("--- Simple Interest Calculation ---");
        System.out.printf("Principal: %.2f%n", principal);
        System.out.printf("Rate: %.2f%%%n", rate);
        System.out.printf("Time: %.1f years%n", time);
        System.out.printf("Simple Interest: %.2f%n", simpleInterest);
        System.out.println();
    }

    // Main method to test the overloading
    public static void main(String[] args) {
        BusinessCalculator calc = new BusinessCalculator();

        // 1. Calculating Profit (Passing integers calls the first method)
        calc.calculate(5000, 7500);

        // 2. Calculating Loss % (Passing doubles calls the second method)
        calc.calculate(1000.00, 800.00);

        // 3. Calculating Discount (Passing double and int calls the third method)
        calc.calculate(2500.00, 15);

        // 4. Calculating Simple Interest (Passing three arguments calls the fourth method)
        calc.calculate(10000.00, 5.5, 2.0);
    }
}
