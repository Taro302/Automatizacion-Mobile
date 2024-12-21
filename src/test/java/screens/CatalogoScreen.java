package screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CatalogoScreen extends PageObject {


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='App logo and name']")
    private WebElement tittle;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@content-desc='Displays all products of catalog']")
    private WebElement productList;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Sauce Labs Backpack']")
    private WebElement sauceLabsBackpack;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Sauce Labs Bike Light']")
    private WebElement sauceLabsBikeLight;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Sauce Labs Onesie']")
    private WebElement sauceLabsOnesie;

    public void seleccionarProducto(String nombreProducto) {
        switch (nombreProducto) {
            case "Sauce Labs Backpack":
                sauceLabsBackpack.click();
                break;
            case "Sauce Labs Bike Light":
                sauceLabsBikeLight.click();
                break;
            case "Sauce Labs Onesie":
                sauceLabsOnesie.click();
                break;
            default:
                throw new IllegalArgumentException("Producto no reconocido: " + nombreProducto);
        }
    }


    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Sauce Labs Backpack']")
    private WebElement Sauce_Labs_Backpack;

    public void Sauce_Labs_Backpack() {
        Sauce_Labs_Backpack.click();
    }

    // Método que espera que el título esté visible y habilitado
    public boolean titulo() {
        waitFor(ExpectedConditions.visibilityOf(tittle));
        return tittle.isEnabled();
    }

    // Método que espera que la lista de productos esté visible y habilitada
    public boolean listaProducto() {
        waitFor(ExpectedConditions.visibilityOf(productList));
        return productList.isEnabled();
    }
}

