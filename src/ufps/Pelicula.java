package ufps;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	private String nombre;
	private int anioPresentacion;
	
	// Relación de asociación
	private Director objDirector;
	
	private List<Ubicacion> listaUbicaciones;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioPresentacion() {
		return anioPresentacion;
	}

	public void setAnioPresentacion(int anioPresentacion) {
		this.anioPresentacion = anioPresentacion;
	}
	
	/*
	 *  Dos bloques para asignar el director
	 *  ¿Cuál es mejor o más adecuado?
	 */
	
	public void asignarDirector(String nombre, int edad) {
		Director d = new Director();
		d.setNombre(nombre);
		d.setEdad(edad);
		
		objDirector = d;
	}
	
	public void asignarDirector(Director d) {
		objDirector = d;
	}
	
	/*
	 * Relaciones de agregación y composición
	 */
	
	public void adicionarUbicacion(Ubicacion ubicacion) {
		if(listaUbicaciones==null)
			listaUbicaciones = new ArrayList<Ubicacion>();
		
		listaUbicaciones.add(ubicacion);
	}
	
	public void adicionarUbicacion(String nombreCiudad, String nombrePais) {
		if(listaUbicaciones==null)
			listaUbicaciones = new ArrayList<Ubicacion>();
		
		Ubicacion ubicacion = new Ubicacion();
		ubicacion.setNombreCiudad(nombreCiudad);
		ubicacion.setNombrePais(nombrePais);
		
		listaUbicaciones.add(ubicacion);
	}
	
	
	/*
	 *  ¿Qué pasa si se invocan antes de haberlo creado?
	 */
	
	public Director obtenerDirector() {
		return objDirector;
	}
	
	public String obtenerNombreDirector() {
		return objDirector.getNombre();
	}
	
}
