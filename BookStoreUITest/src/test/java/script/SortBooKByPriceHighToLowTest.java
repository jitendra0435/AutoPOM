package script;
import base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.SortBookByPriceHighToLow;

@Listeners(listners.BookListNers.class)
public class SortBooKByPriceHighToLowTest extends Base {

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void givenMethodForSortingBookByAscendingOrder() throws InterruptedException {
            SortBookByPriceHighToLow check=new SortBookByPriceHighToLow(driver);
            check.selectHighToLow();
            Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
