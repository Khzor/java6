import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



public class ServicesTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCalculateSum() {
        Services service = new Services();

        int actual = service.calculateSum(sales);
        int expected = 180;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverage() {
        Services service = new Services();

        int actual = service.calculateAverage(sales);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGiveMaxMonth() {
        Services service = new Services();

        int actual = service.maxSales(sales);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGiveMinMonth() {
        Services service = new Services();

        int actual = service.minSales(sales);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGiveLessThanAverageMonthCount() {
        Services service = new Services();

        int actual = service.lessThanAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGiveMoreThanAverageMonthCount() {
        Services service = new Services();

        int actual = service.lessThanAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }
}