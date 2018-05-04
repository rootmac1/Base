package luis.munayco.com.myapplication.Objetos;

public class Inventario {
    double precio;
    String nombre;
    String codigo;
    int    stock;

    public Inventario() {
    }

    public Inventario(double precio, String nombre, String codigo, int stock) {
        this.precio = precio;
        this.nombre = nombre;
        this.codigo = codigo;
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}


