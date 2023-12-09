package modelo;


public class CabeceraVenta {
    
      // Atributos
    private int idCabeceraventa;
    private int idCliente;
    private boolean compraDirecta;  // Nueva propiedad
    private double valorPagar;
    private String fechaVenta;
    private int estado;
    
    // Constructor
    public CabeceraVenta() {
        this.idCabeceraventa = 0;
        this.idCliente = 0;
        this.compraDirecta = false;  // Valor por defecto
        this.valorPagar = 0.0;
        this.fechaVenta = "";
        this.estado = 0;
    }

     //constructor sobrecargado

    public CabeceraVenta(int idCabeceraventa, int idCliente, boolean compraDirecta, double valorPagar, String fechaVenta, int estado) {
        this.idCabeceraventa = idCabeceraventa;
        this.idCliente = idCliente;
        this.compraDirecta = compraDirecta;
        this.valorPagar = valorPagar;
        this.fechaVenta = fechaVenta;
        this.estado = estado;
    }

    public int getIdCabeceraventa() {
        return idCabeceraventa;
    }

    public void setIdCabeceraventa(int idCabeceraventa) {
        this.idCabeceraventa = idCabeceraventa;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isCompraDirecta() {
        return compraDirecta;
    }

    public void setCompraDirecta(boolean compraDirecta) {
        this.compraDirecta = compraDirecta;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "CabeceraVenta{" + "idCabeceraventa=" + idCabeceraventa + ", idCliente=" + idCliente + ", compraDirecta=" + compraDirecta + ", valorPagar=" + valorPagar + ", fechaVenta=" + fechaVenta + ", estado=" + estado + '}';
    }

    
    
}