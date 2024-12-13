
import Model.Cliente;
import Model.Factura;
import Model.Producto;

public class Main {
    public static void main(String[] args) {

        //instanciar cliente

        Cliente cliente = new Cliente("Jonathan","Vahos", 1020407765,"300362896","vahos030@gmail.com");

        cliente.mostrarInfoCliente();

        // instanciar precio

        Producto producto1 = new Producto(1, "Arroz", 5000, 5);
        Producto producto2 = new Producto(2,"Frijoles",9000, 2);

        producto1.mostrarInfoProducto();
        producto2.mostrarInfoProducto();

        Factura factura = new Factura(1);

        factura.AgregarProducto(producto1, 2);
        factura.AgregarProducto(producto2, 1);

        //calcular el total

        double total = factura.calcularTotal();

        //mostrar la informacion de la factura

        System.out.println("NUmero de Factura"+ factura.getId());
        System.out.println("Fecha: "+factura.getFecha());
        System.out.println("Total: "+total);

        // Mostrar los productos en la factura

        for (Producto producto : factura.getProductos())
        { System.out.println(producto.getNombre() + " - Cantidad: " + producto.getCantidad()
                + " - Precio: $" + producto.getPrecio()); }

    }
}