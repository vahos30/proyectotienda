package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Factura {
    private int id;
    private Date fecha;
    private List<Producto> productos;
    private double total;

    public Factura(int id) {
        this.id = id;
        this.fecha = new Date();
        this.productos = new ArrayList<>();
        this.total = 0.0;
    }

    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void AgregarProducto(Producto producto, int cantidad) {
        if (cantidad <= producto.getCantidad()){
            productos.add(new Producto(producto.getId(), producto.getNombre(),producto.getPrecio(),cantidad));
        }
    }

    public double calcularTotal(){
        total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * producto.getCantidad();
        }
        return total;
    }

}
