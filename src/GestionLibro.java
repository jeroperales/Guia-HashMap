import java.lang.classfile.instruction.ReturnInstruction;
import java.util.ArrayList;
import java.util.HashMap;

public class GestionLibro {

    private HashMap<String, Libro> inventario;

    public GestionLibro() {
        this.inventario = new HashMap<>();
    }

    public void agregarLibro(Libro libro) {
        inventario.put(libro.getTitulo(), libro);

    }

    public void eliminarLibro(String titulo) {
        inventario.remove(titulo);
    }

    public void mostrarLibros() {
        for (Libro libro : inventario.values()) {
            System.out.println(libro);

        }
    }

    public Libro buscarLibro(String titulo) {
        return inventario.get(titulo);
    }

    public String actualizarPrecio(String titulo, double nuevoPrecio) {
        Libro libro = inventario.get(titulo); //VERIFICO EXISTENCIA DE LIBRO

        if (libro != null) {
            libro.setPrecio(nuevoPrecio);
            inventario.put(libro.getTitulo(), libro);

            return "EL LIBRO SE ACTUALIZO CORRECTAMENTE";
        } else {
            return "El libro no existe";
        }


    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Libro libro : inventario.values()) {
            precioTotal = precioTotal + libro.getPrecio();
        }
        return precioTotal;

    }

    public int contarLibros() {
        return inventario.values().size();
    }

    public Libro encontrarLibroMasCaro() {
        Libro libroMasCaro = null;
        double precioMaximo = 0;

        for (Libro libro : inventario.values()) {
            if (libro.getPrecio() > precioMaximo) {
                precioMaximo = libro.getPrecio();
                libroMasCaro = libro;

            }

        }
        return libroMasCaro;
    }

    public Libro encontrarLibroMasBarato() {
        Libro libroMasBarato = null;
        double precioMinimo = Double.MAX_VALUE;

        for (Libro libro : inventario.values()) {

            if (libro.getPrecio() < precioMinimo) {
                precioMinimo = libro.getPrecio();
                libroMasBarato = libro;

            }


        }
        return libroMasBarato;
    }
}