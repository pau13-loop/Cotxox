package edu.pingpong.cotxox.domain.carrera;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarreraTest {

    private Carrera carrera = null;
    private double delta = 0.01d;
    
    @Before
    public void setupCarrera() {
        carrera = new Carrera("666333111");
    }

    @Test
    public void settersAndGettersCarrera() {

        carrera.setOrigen("Bombay");
        carrera.setDestino("Hawai");
        carrera.setDistancia(15.5);

        assertEquals("666333111", carrera.getTarjetaCredito());
        assertEquals("Bombay", carrera.getOrigen());
        assertEquals("Hawai", carrera.getDestino());
        assertEquals(15.5, carrera.getDistancia(), delta);
    }

    @Test
    public void getCosteTotalEsperadoTest() {

        carrera.setDistancia(15);
        carrera.setTiempoEsperado(5);
        
        double costeTotal = 15 * 1.35 + 5 * 0.35;

        assertEquals(costeTotal, carrera.getCosteEsperado(), delta);
    }

    @Test
    public void getCosteMinimoTest() {
        
        carrera.setDistancia(1);
        carrera.setTiempoEsperado(2);

        assertEquals(5, carrera.getCosteEsperado(), delta);
    }

}
