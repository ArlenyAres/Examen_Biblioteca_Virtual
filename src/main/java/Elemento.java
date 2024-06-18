public abstract class Elemento {
    protected String id;
    protected double precio;
    protected double iva;

    public Elemento(String id, double precio, double iva) {
        this.id = id;
        this.precio = precio;
        this.iva = iva;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


}
