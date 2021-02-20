package edu.pingpong.cotxox.domain.carrera;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarreraTest {

    private Carrera carrera = null;
    
    @Before
    public void setupCarrera() {

        carrera = new Carrera("666333111");
    }

    @Test
    public void settersAndGettersCarrera() {

        double delta = 0.01;

        carrera.setOrigen("Bombay");
        carrera.setDestino("Hawai");
        carrera.setDistancia(15.5);

        assertEquals("666333111", carrera.getTarjetaCredito());
        assertEquals("Bombay", carrera.getOrigen());
        assertEquals("Hawai", carrera.getDestino());
        assertEquals(15.5, carrera.getDistancia(), delta);
    }

}
