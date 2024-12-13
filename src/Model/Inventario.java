package Model;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public List<Producto> getProductos() {
        return productos;
    }

    public Producto buscarProductoporId(int id) {
        return productos.stream().filter(producto -> producto.getId() == id).findFirst().orElse(null);
    }

}
