import org.testng.annotations.Test;
import ru.netology.stats.StatsService;

import static org.testng.AssertJUnit.assertEquals;

public class StatsServiceTest {

    @Test
    public void totalOfAllSales() {
        StatsService service = new StatsService();


        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        assertEquals(expected, actual);
    }

    @Test
    public void averageAmountOfSalesMonth() {
        StatsService service = new StatsService();


        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        assertEquals(expected, actual);
    }

    @Test
    public void maxSales () {
        StatsService service = new StatsService();

        int actual = service.maxSales();
        int expected = maxMonth + 1;

        assertEquals(actual, expected);
    }

    @Test
    public void minSales () {
        StatsService service = new StatsService();

        int actual = service.minSales();
        int expected = minMonth + 1;

        assertEquals(actual, expected);
    }



}

