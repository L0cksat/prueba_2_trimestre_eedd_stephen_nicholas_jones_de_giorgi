package java;

import biblioteca.Biblioteca;
import biblioteca.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {
    private Biblioteca biblioteca;
    @BeforeEach
    void setUp() {
        biblioteca = new Biblioteca();
    }
    @Test
    void agregarLibro() {
        //Dado (GIVEN)
        Libro libro1 = new Libro();
        Libro resultadoEsperado = libro1;

        //Cuando (WHEN)
        biblioteca.agregarLibro(libro1);

        for (Libro elemento : biblioteca.getLibros()) {
            if(elemento.getTitulo().equals(libro1.getTitulo())) {
                resultadoEsperado = elemento;
            }
            assertEquals(resultadoEsperado.getTitulo(), libro1.getTitulo());
        }
    }

    @Test
    void eliminarLibro() {
        Libro libro1 = new Libro();
        Libro resultadoEsperado = libro1;
        biblioteca.eliminarLibro(libro1);
        for (Libro elemento : biblioteca.getLibros()) {
            if(elemento.getTitulo().equals(libro1.getTitulo())) {
                resultadoEsperado = elemento;
            }
            assertEquals(resultadoEsperado, elemento);
        }
    }

    @Test
    void encuentraLibroPorTitulo() {
        List<Libro> aux = new ArrayList<Libro>();
        Libro libro1 = new Libro();
        Libro resultadoEsperado = libro1;
        for (Libro elemento : biblioteca.getLibros()) {
            if(elemento.getTitulo().equals(libro1.getTitulo())) {
                aux.add(elemento);
            }

        }
       assertEquals(aux.get(0).getTitulo(), libro1.getTitulo());
    }

    @Test
    void encuentraLibrosPorAutor() {
        Libro libro1 = new Libro();
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
            assert
        }

    }
}