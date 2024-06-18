public class RecursoDigital extends Elemento implements Calculator {
    private String descripcion;
    private String tipoFormato;

    public RecursoDigital(String id, double precio, double iva, String descripcion, String tipoFormato) {
        super(id, precio, iva);
        this.descripcion = descripcion;
        this.tipoFormato = tipoFormato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoFormato() {
        return tipoFormato;
    }

    public void setTipoFormato(String tipoFormato) {
        this.tipoFormato = tipoFormato;
    }

    @Override
    public double calcularIVA(double precio) {
        return precio * 0.21;
    }
}
