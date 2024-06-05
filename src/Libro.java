public class Libro {

    public String titulo;
    public String autor;
    public double precio;
    public int anio;

    //CONSTRUCTOR

    public Libro(String titulo, String autor, double precio, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.anio = anio;
    }


    //GETTERS AND SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    //METODOS LIBRO

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", anio=" + anio +
                '}';
    }
}
