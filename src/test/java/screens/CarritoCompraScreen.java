package screens;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
public class CarritoCompraScreen {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/noTV']")
    private WebElement cantidad;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/priceTV']")
    private WebElement precio;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/totalPriceTV']")
    private WebElement resultado;

    public String obtenerCantidad() {
        return cantidad.getText();
    }

    public String obtenerPrecio() {
        return precio.getText();
    }

    public String obtenerResultado() {
        return resultado.getText();
    }
}


