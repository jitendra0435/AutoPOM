package script;
import base.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AddToCart;

@Listeners(listners.BookListNers.class)
public class AddToCartTest extends Base {

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void givenMethodForBookAddIntoCartOrNot() throws InterruptedException {
        AddToCart cart=new AddToCart(driver);
        cart.setAddToBag();
        cart.setAddToBag1();
        cart.getCartButton();
    }
}
