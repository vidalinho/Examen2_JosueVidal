
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josue
 */
public class Cancion implements Serializable {

    private String nombre;
    private String artista;
    private int duracion;
    private String genero;

    private static final long SerialVersionUID = 777L;

    public Cancion(String nombre, String artista, int duracion, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public Cancion(Cancion cancion) {
       
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
