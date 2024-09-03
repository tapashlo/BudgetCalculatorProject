public class BudgetCalculator {
    // Defining constants
    private static final double SALARY = 3000.0;
    private static final double SAVINGS_PERCENT = 0.20;
    private static final double RENT_PERCENT = 0.30;
    private static final double GROCERIES_PERCENT = 0.15;
    private static final double ENTERTAINMENT_PERCENT = 0.10;

    public static void main(String[] args) {
        // Declaring variables
        double monthlySalary = SALARY;
        double savedAmount;
        double rentAmount;
        double groceriesAmount;
        double entertainmentAmount;
        double totalExpenses;
        double remainingBalance;

        // Performing calculations
        savedAmount = monthlySalary * SAVINGS_PERCENT;
        rentAmount = monthlySalary * RENT_PERCENT;
        groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        remainingBalance = monthlySalary - totalExpenses;

        // Displaying results with $ sign

        System.out.println("Monthly salary: $" + monthlySalary);

        System.out.println("Amount saved: $" + savedAmount);

        System.out.println("Amount spent on rent: $" + rentAmount);

        System.out.println("Amount spent on groceries: $" + groceriesAmount);

        System.out.println("Amount spent on entertainment: $" + entertainmentAmount);

        System.out.println("Total expenses: $" + totalExpenses);

        System.out.println("Remaining balance: $" + remainingBalance);
    }
}
