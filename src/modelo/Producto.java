package modelo;


public class Producto {
    
    //Atributos
    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precio;
    private int codigo ;
    private int porcentajeIva;
    private int idCategoria;
    private int estado;
    
    //Contructor
    public Producto(){
        this.idProducto = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0.0;
        this.codigo = 0;
        this.porcentajeIva = 0;
        this.idCategoria = 0;
        this.estado = 0;
    }

    public Producto(int idProducto, String nombre, int cantidad, double precio, int codigo, int porcentajeIva, int idCategoria, int estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.codigo = codigo;
        this.porcentajeIva = porcentajeIva;
        this.idCategoria = idCategoria;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(int porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}