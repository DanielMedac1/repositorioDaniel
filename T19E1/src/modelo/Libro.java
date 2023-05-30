/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * La clase libro está formada por los parámetros de título, autor, publicación y precio.
 * @author usuario
 */
public class Libro {
    private String titulo;
    private String autor;
    private Integer publicacion;
    private Double precio;

    public Libro(String titulo, String autor, int publicacion, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.precio = precio;
    }

    public Libro(String titulo, String autor, Integer publicacion, Double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", publicacion=" + publicacion + ", precio=" + precio + '}';
    }
    
    
}
