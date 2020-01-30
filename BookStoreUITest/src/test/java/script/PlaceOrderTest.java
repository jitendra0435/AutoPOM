package script;

import base.ConfigFiles;
import base.Base;
import base.JSONReader;
import org.testng.annotations.*;
import pages.AddToCart;
import pages.PlaceOrder;
import java.io.IOException;

@Listeners(listners.BookListNers.class)
public class PlaceOrderTest extends Base {

    @DataProvider(name = "customerDetail")
    public Object[][] passData() throws IOException {
        return JSONReader.getdata(ConfigFiles.CustomerDetails,"customerDetail", 2, 7);
    }

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test(dataProvider = "customerDetail")
    public void givenMethodForOrderIsPlacedOrNot(String name,String phone,String email,
                                                 String city,String address,String pincode,String landmark) throws InterruptedException {

        PlaceOrder getOrder=new PlaceOrder(driver);
        AddToCart cart=new AddToCart(driver);

        cart.setAddToBag();
        cart.getCartButton();
        getOrder.setOrderButton();
        getOrder.setName(name);
        getOrder.setPincode(pincode);
        getOrder.setAddress(address);
        getOrder.setCity(city);
        getOrder.setEmail(email);
        getOrder.setLandmark(landmark);
        getOrder.setPhone(phone);

        getOrder.setRadioButton();
        getOrder.setContinueButton();
        getOrder.setCheckOut();
        getOrder.setContShoppingButton();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
