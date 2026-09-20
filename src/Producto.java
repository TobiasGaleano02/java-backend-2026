public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public static void main(String[] args) {

        Producto producto1 = new Producto("leche", 12000, 5);

        System.out.println(producto1.getNombre());
        System.out.println(producto1.getPrecio());
        System.out.println(producto1.getStock());

        producto1.setStock(50);
        System.out.println(producto1.getStock());

        producto1.setStock(-20);
        System.out.println(producto1.getStock());
    }
}