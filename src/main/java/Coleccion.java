import java.util.ArrayList;
import java.util.List;

public class Coleccion {
    private static int idCounter = 0;
    private int id;
    private String nombre;
    private NivelAcceso nivelAcceso;
    private double valorTotal;
    private List<Libro> libros;
    private List<RecursoDigital> recursosDigitales;

    public Coleccion( String nombre, NivelAcceso nivelAcceso, double valorTotal, List<Libro> libros, List<RecursoDigital> recursosDigitales) {
        this.id = ++id;
        this.nombre = nombre;
        this.nivelAcceso = nivelAcceso;
        this.valorTotal = 0.0;
        this.libros = new ArrayList<>();
        this.recursosDigitales = new ArrayList<>();
    }

    public Coleccion(String nombre, NivelAcceso nivelAcceso, double valorTotal) {
        this.id = ++id;
        this.nombre = nombre;
        this.nivelAcceso = nivelAcceso;
        this.valorTotal = 0.0;
        this.libros = new ArrayList<>();
        this.recursosDigitales = new ArrayList<>();
        this.nivelAcceso = nivelAcceso;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Coleccion.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NivelAcceso getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(NivelAcceso nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<RecursoDigital> getRecursosDigitales() {
        return recursosDigitales;
    }

    public void setRecursosDigitales(List<RecursoDigital> recursosDigitales) {
        this.recursosDigitales = recursosDigitales;
    }


    public void agregarLibro(Libro libro) {
        libros.add(libro);
        valorTotal += libro.calcularIVA(libro.getPrecio());
    }

    public void agregarRecursoDigital(RecursoDigital recurso) {
        recursosDigitales.add(recurso);
        valorTotal += recurso.calcularIVA(recurso.getPrecio());
    }
}
