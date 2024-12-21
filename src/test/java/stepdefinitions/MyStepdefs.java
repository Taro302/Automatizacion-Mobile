package stepdefinitions;

import steps.CatalogoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;


public class MyStepdefs {

    @Steps
    CatalogoSteps catalogoSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoy_en_la_aplicación_de_sauce_labs() {

    }

    @And("valido que carguen correctamente los productos en la galería")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        catalogoSteps.cargaProducto();
    }

    @When("agrego {} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(int cantidad, String producto) {
    catalogoSteps.agregar_producto(cantidad,producto);
    }

    @Then("valido que el carrito de compra actualice correctamente")
    public void validoQueElCarritoDeCompraActualiceCorrectamente() {
    catalogoSteps.validar_compra();
    }
}
