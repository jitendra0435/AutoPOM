package script;

import base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.RemoveBookFromCart;

public class RemoveBookFromCartTest extends Base {

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void givenMethodForIsBookRemoveFromCartOrNot() throws InterruptedException {
        RemoveBookFromCart cart=new RemoveBookFromCart(driver);
        AddToCart addCart=new AddToCart(driver);

        addCart.setAddToBag();
        addCart.setAddToBag1();
        addCart.getCartButton();
        Thread.sleep(3000);
        cart.setRemove();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
