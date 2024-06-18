import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Coleccion> colecciones;

    public Inventario() {
        this.colecciones = new ArrayList<>();
    }

    public void crearColeccion(String nombre, NivelAcceso nivelAcceso, double valorTotal) throws ClassNotFoundException, ColeccionDuplicadaException {
        for (Coleccion coleccion : colecciones) {
            if (coleccion.getNombre().equals(nombre)) {
                throw new ColeccionDuplicadaException("Esta coleccion ya esta en el sistema");
            }
        }
        colecciones.add(new Coleccion(nombre, nivelAcceso, valorTotal));
    }

    public Coleccion encontarColeccion(String nombre){
        return colecciones.stream().filter(c -> c.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public void agregarLibroAColeccion(String nombreColeccion, Libro libro) throws ColeccionNoEncontradaException {
        Coleccion coleccion = encontarColeccion(nombreColeccion);
        if (coleccion != null){
            coleccion.agregarLibro(libro);
        }
        throw new ColeccionNoEncontradaException("La coleccion no se encuentra, indique una coleccion correcta");
    }

}
