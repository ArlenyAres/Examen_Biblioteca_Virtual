public class Libro extends Elemento implements Calculator {
    private String titulo;
    private int tiempoEstimadoLectura;
    private String categoria;


    public Libro(String id, double precio, double iva, String titulo, int tiempoEstimadoLectura, String categoria) {
        super(id, precio, iva);
        this.titulo = titulo;
        this.tiempoEstimadoLectura = tiempoEstimadoLectura;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTiempoEstimadoLectura() {
        return tiempoEstimadoLectura;
    }

    public void setTiempoEstimadoLectura(int tiempoEstimadoLectura) {
        this.tiempoEstimadoLectura = tiempoEstimadoLectura;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    @Override
    public double calcularIVA(double precio) {
        return precio * 0.1;
    }
}
