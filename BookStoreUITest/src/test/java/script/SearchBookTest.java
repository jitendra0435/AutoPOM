package script;
import base.ConfigFiles;
import base.Base;
import base.JSONReader;
import org.testng.annotations.*;
import pages.SearchBook;
import java.io.IOException;

@Listeners(listners.BookListNers.class)
public class SearchBookTest extends Base {

    @DataProvider(name = "BookName")
    public Object[][] passData() throws IOException {
        return JSONReader.getdata(ConfigFiles.FILEPATH,"BooksName", 3, 1);
    }

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test(dataProvider = "BookName")
    public void givenMethodForSearchBook(String BookName) throws InterruptedException {
        SearchBook search=new SearchBook(driver);
        search.searchBook(BookName);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}


