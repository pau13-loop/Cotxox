package edu.pingpong.cotxox.appCotxox;

import java.util.ArrayList;
import java.util.List;

import edu.pingpong.cotxox.domain.carrera.Carrera;
import edu.pingpong.cotxox.domain.conductor.Conductor;

public class AppCotxox 
{
    public static void main( String[] args )
    {
        /* 
		 * Configuracion del usuario
		 * y de la Carrera. 
		 */

		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino = "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;

		Carrera carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);

		System.out.println("\n#####" + "\t Set Pickup: \t" + "#####\n");

		System.out.println("Visa: " + carrera.getTarjetaCredito());
		System.out.println("From: " + carrera.getOrigen());
		System.out.println("To: " + carrera.getDestino());
		System.out.println("Distance: " + carrera.getDistancia());

		System.out.println("\n#####" + "\t See your Cost: \t" + "#####\n");

		System.out.println("Visa: " + carrera.getTarjetaCredito());
		System.out.println("From: " + carrera.getOrigen());
		System.out.println("To: " + carrera.getDestino());
		System.out.println("Distance: " + carrera.getDistancia());
		System.out.println("Total: " + carrera.getCosteEsperado() + "€");

		System.out.println("\n#####" + "\t Get a ride: Driver: \t" + "#####\n");

		/**
		 * Necesitamos crear la flota de conductores de donde seleccionar uno
		 * para ofrecer el servicio.
		 * La flota es un objeto de tipo PoolConductores.
		 */

		List<Conductor> poolConductores = new ArrayList<Conductor>();
		Conductor conductor = null;

		// creamos objetos conductor y los metemos en el array

		String[] nombres = { "Samantha", "Fox", "Mola" };
		for (String nombre : nombres) {
			conductor = new Conductor(nombre);
			poolConductores.add(conductor);
		}

		String[] matricula = { "4ABC123", "5DHJ444", "7JKK555" };
		String[] modelos = { "Chevy Malibu", "Toyota Prius", "Mercedes A" };

		int index = 0;
		for (Conductor conductora : poolConductores) {
			conductora.setMatricula(matricula[index]);
			conductora.setModelo(modelos[index]);
			// suponemos que las conductoras tienen una valoracion inicial de 4 stars
			conductora.setValoracion((byte) 4);
			index++;
		}
    }
}
