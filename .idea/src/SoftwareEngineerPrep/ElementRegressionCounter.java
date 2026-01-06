import java.util.List;

class ElementRegressionCounter {
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {


        // Constraint check:
        if (responseTimes.isEmpty()){
            return 0;
        }

        double average = 0;
        int dayCount = 0;

        for(int i = 0; i < responseTimes.size(); i++) {


            // Constraint check : handles invalid data type
            if (responseTimes.get(i) < 1) {
                return 0;
            }

            if (i == 0) {
                average += responseTimes.get(i);
                continue;
            }

            if(responseTimes.get(i) > (average / i)) {
                dayCount++;
            }

            average += responseTimes.get(i);

        }

        return dayCount;
    }
}

