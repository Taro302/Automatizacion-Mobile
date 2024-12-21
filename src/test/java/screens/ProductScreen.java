package screens;
import stepdefinitions.MyStepdefs;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class ProductScreen {
    MyStepdefs myStepdefs;
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Increase item quantity']")
    private WebElement cantidadClicks;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc='Tap to add product to cart']")
    private WebElement addToCart;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Displays number of items in your cart']")
    private WebElement clickCart;

    public void aumentarCantidad() {

        cantidadClicks.click();
    }

    public void agregarAlCarrito() {
        addToCart.click();
    }

    public void hacerClickEnCarrito() {
        clickCart.click();
    }
}
