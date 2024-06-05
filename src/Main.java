//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        GestionLibro gestion = new GestionLibro();

        // Agregar algunos libros de ejemplo
        gestion.agregarLibro(new Libro("Eragon", "Martin Palermo", 20.50, 1954));
        gestion.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 18.75, 1967));
        gestion.agregarLibro(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 15.99, 1997));

        // Mostrar todos los libros en el inventario
        System.out.println("Libros en el inventario:");
        gestion.mostrarLibros();

        // Actualizar el precio de un libro
        String mensaje = gestion.actualizarPrecio("Eragon", 30.99);
        System.out.println(mensaje);
        System.out.println("\nLibros en el inventario después de actualizar el precio:");
        gestion.mostrarLibros();

        // Calcular el precio total de todos los libros
        System.out.println("\nPrecio total de todos los libros: $" + gestion.calcularPrecioTotal());

        // Contar el número total de libros
        System.out.println("Número total de libros: " + gestion.contarLibros());

        // Encontrar el libro más caro y el más barato
        System.out.println("\nLibro más caro:");
        System.out.println(gestion.encontrarLibroMasCaro());
        System.out.println("\nLibro más barato:");
        System.out.println(gestion.encontrarLibroMasBarato());



    }
}