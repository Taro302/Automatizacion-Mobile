package steps;

import org.junit.Assert;
import screens.CarritoCompraScreen;
import screens.CatalogoScreen;
import screens.ProductScreen;

public class CatalogoSteps {
    CatalogoScreen catalogoScreen;
    ProductScreen productScreen;
    CarritoCompraScreen carritoCompraScreen;

    public void titulo(){
        Assert.assertTrue("No se inicio de forma exitosa",catalogoScreen.titulo());
    }
    public void cargaProducto(){
        Assert.assertTrue("Los productos no se cargaron correctamente", catalogoScreen.listaProducto());
    }
public void validar_compra(){
    String cantidadEsperada = "1";
    String cantidadActual = carritoCompraScreen.obtenerCantidad();
    Assert.assertEquals("La cantidad de productos en el carrito no es la esperada", cantidadEsperada, cantidadActual);
}
    public void agregar_producto(int cantidad, String producto) {
        catalogoScreen.seleccionarProducto(producto);

        for (int i = 0; i < cantidad; i++) {
            productScreen.aumentarCantidad();
        }
        productScreen.agregarAlCarrito();
        productScreen.hacerClickEnCarrito();
}
}
