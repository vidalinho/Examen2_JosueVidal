
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josue
 */
public class Playlist {
    private String Nombre;
    private ArrayList <Cancion>cancionest=new ArrayList();

    public Playlist() {
    }

    public Playlist(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Cancion> getCancionest() {
        return cancionest;
    }

    public void setCancionest(ArrayList<Cancion> cancionest) {
        this.cancionest = cancionest;
    }

    @Override
    public String toString() {
        return Nombre ;
    }

   
    
}
