package ufps.cliente;

import ufps.Comedia;
import ufps.Director;
import ufps.Musical;
import ufps.Pelicula;

public class Cliente {

	public static void main(String[] args) {
		
		Comedia c = new Comedia();
		
		Pelicula p = new Comedia();
		Pelicula p2 = new Musical();
		
		c.setNombre("¿Qué pasó ayer en POO2?");
		
		// Por composición
		c.asignarDirector("Boris Perez", 41);
		
		
		// Por agregación
		Director di = new Director();
		di.setNombre("Marco Adarme");
		di.setEdad(43);
		
		c.asignarDirector(di);
		c = null;
		
		
	}
	
}
