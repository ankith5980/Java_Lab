// Write a java program to implement the concept of function overloading by performing different bussiness related operations.
// Create a class which contains a method named 'calculate' to perform the following operations:
// 1. Calculate profit (Given cost price and selling price)
// 2. Calculate loss percentage (Given cost price and selling price)
// 3. Calculate price after discount (Given marked price and discount percentage)
// 4. Calculate Simple Interest (Given principal amount, rate of interest and time)

package Simply;

public class Bussiness {
    // Method to calculate profit
    public double calculate(double costPrice, double sellingPrice) {
        return sellingPrice - costPrice;
    }

    // Method to calculate loss percentage
    public double calculateLossPercentage(double costPrice, double sellingPrice) {
        if (sellingPrice >= costPrice) {
            return 0.0;
        }
        double loss = costPrice - sellingPrice;
        return (loss / costPrice) * 100;
    }

    // Method to calculate price after discount
    public double calculatePriceAfterDiscount(double markedPrice, double discountPercentage) {
        double discountAmount = (discountPercentage / 100) * markedPrice;
        return markedPrice - discountAmount;
    }

    // Method to calculate Simple Interest
    public double calculate(double principal, double rateOfInterest, double time) {
        return (principal * rateOfInterest * time) / 100;
    }

    public static void main(String[] args) {
        Bussiness bussiness = new Bussiness();

        // Calculate profit
        double profit = bussiness.calculate(5000, 7000);
        System.out.println("Profit: " + profit);

        // Calculate loss percentage
        double lossPercentage = bussiness.calculateLossPercentage(7000, 5000);
        System.out.println("Loss Percentage: " + lossPercentage + "%");

        // Calculate price after discount
        double priceAfterDiscount = bussiness.calculatePriceAfterDiscount(10000, 15);
        System.out.println("Price after Discount: " + priceAfterDiscount);

        // Calculate Simple Interest
        double simpleInterest = bussiness.calculate(10000, 5, 2);
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
