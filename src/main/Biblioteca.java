package biblioteca;

import java.util.ArrayList;
import java.util.List;

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

public class Biblioteca {

    // TODO: Documentar estos atributos

    /**
     * Este atributo es una lista de la clase libro que muestra los objetos libros creados y añadidos
     * a la lista, el atributo no se puede modificar ya que es final
     */
    private final List<Libro> libros;

    // TODO: Documentar este método

    /**
     * Este metodo crea una nueva ArrayList para poder introducir nuevos libros en ella, se crea vacia.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO

    /**
     * Este metodo muestra en pantalla los libros que han sido introducidos en la lista
     *
     * @param libros -Este parámetro sería como se llama la lista de libros que contiene la lista que se va a mostrar
     *               en pantalla cuando se llama este metodo en el main.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Este metodo retorna/devuelve de la lista de los libros, cada objeto de libro que hayan sido creados y añadidos
     * a la lista de libros.
     *
     * @return -Devuelve los libros que hayan sido introducidos en la lista anteriormente.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Este metodo realiza una búsqueda a través de la lista
     * {@code public List<Libro> getLibros() {
     * return libros;
     * }}
     *
     * @param titulo - El parametro que hay que pasar por el metodo para que pueda buscarlo en la lista
     *               al recorrerla.
     * @return - Devuelve el objeto en memoria libro con su información que haya encontrado en la lista, y si no
     * lo encuentra, devuelve null.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * @param autor - Este parámetro es de tipo String del autor que hay que pasar por el metodo para que pueda realizar
     *              la búsqueda.
     * @return - Devuelve todos los libros y su información de dicho autor introducido y los muestra en pantalla,
     * en caso contrario devuelve null.
     * @deprecated - Este metodo está obsoleto y no se recomienda usar la version mejorada de
     * {@link #encuentraLibrosPorAutor(String)}
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Este metodo es la version mejorada y sustituye al metodo anterior {@link #encuentraLibroPorTitulo(String)} está
     * disponible desde la version 2.0
     *
     * @param autor -Este parámetro es del tipo String y hay que introducir el nombre del autor para que el metodo pueda
     *              buscarlo en la lista
     * @return -Devuelve todos los libros asignados al autor que se ha introducido antes, y muestra una lista de los
     * libros, ya que inicia el metodo la lista en null, si no se encuentran libros con el mismo nombre
     * que el autor, se añade el libro en cuestión a la lista.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
