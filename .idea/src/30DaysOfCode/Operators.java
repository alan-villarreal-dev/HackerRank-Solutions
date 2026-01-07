public class Operators {

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Constraint check: for invalid input
        if (meal_cost < 0 || tip_percent < 0 || tax_percent < 0) {
            System.out.println(0);
        }

        double tip_total = (meal_cost / 100) * tip_percent;
        double tax_total = (meal_cost/  100) * tax_percent;
        double total_cost = meal_cost + tip_total + tax_total;

        System.out.println(Math.round(total_cost));
    }

}
