package biblioteca;

/**
 * Esta sería las clases y el paquete facilitados para la prueba de segunda trimestre de Entornos
 * de desarrollo, a continuación se va a realizar la documentación de dichas clases, que serían la clase {@link Libro}
 * y {@link Biblioteca}
 *
 *----------
 *
 * @author Stephen Nicholas Jones De Giorgi GitHub: (https://github.com/L0cksat)
 * @version 4.3.2025
 */

public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Documentamos todos los artibutos solicitados:
     * @param titulo -Título del objeto de la clase libro.
     * @param autor -Nombre y apellidos del autor del libro.
     * @param anioPublicacion -Año/anio de publicación del libro creado.
     */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Este metodo es un constructor con todos los parámetros para realizar la creación de un nuevo libro,
     * y devuelve un objeto de libro creado en memoria.
     * Además tenemos los getters and setters creados.
     */
    public Libro() {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método

    /**
     * Este metodo muestra toda la información del autor, introducido anteriormente en el
     * constructor.
     * @return -Devuelve y muestra en pantalla toda la información del autor introducido en el parámetro del constructor.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método

    /**
     * Este metodo muestra toda la información del año/anio de publicación del libro
     * @return -Devuelve y muestra en pantalla toda la información del año/anio publicado introducido en el constructor.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
