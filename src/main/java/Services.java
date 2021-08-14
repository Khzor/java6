public class Services {

    public int calculateSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(long[] sales) {
        int salesAverage = calculateSum(sales) / sales.length;
        return salesAverage;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public int lessThanAverage(long[] sales) {
        int monthCount = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < calculateAverage(sales)) {
                monthCount++;
            }
            month++;
        }
        return monthCount;
    }

    public int moreThanAverage(long[] sales) {
        int monthCount = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > calculateAverage(sales)) {
                monthCount++;
            }
            month++;
        }
        return monthCount;
    }
}
