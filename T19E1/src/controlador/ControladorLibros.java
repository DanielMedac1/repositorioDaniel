/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.util.ArrayList;
import modelo.Libro;


/**
 *
 * @author usuario
 */
public class ControladorLibros {

    private ConexionDB4O conexion;

    public ControladorLibros(ConexionDB4O conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Libro> obtenerTodosLibros() {
        ArrayList<Libro> totalLibros = new ArrayList<>();
        
        Query consulta1 = conexion.getBd().query();
            consulta1.constrain(Libro.class);
            consulta1.descend("Libro").descend("publicacion").orderDescending();
            ObjectSet res1 = consulta1.execute();
            while (res1.hasNext()) {
                Libro li=(Libro)res1.next();
                totalLibros.add(li);
            }
        return totalLibros;

    }
    //consulta1.descend("Libro").descend("precio").constrain(30).greater();
}
