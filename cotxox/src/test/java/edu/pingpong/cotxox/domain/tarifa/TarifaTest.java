package edu.pingpong.cotxox.domain.tarifa;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import edu.pingpong.cotxox.domain.carrera.Carrera;

public class TarifaTest {

    private Carrera carrera = null;
    private double delta = 0.01d;

    @Before
    public void setupTarifa() {
        carrera = new Carrera("111222333");
    }

    @Test
    public void getCosteDistanciaTest() {

        assertEquals(29.7, Tarifa.getCosteDistancia(22), delta);
    }

    @Test
    public void getCosteTiempoTest() {

        assertEquals(7.7, Tarifa.getCosteTiempo(22), delta);
    }


    @Test
    public void getCosteTotalEsperadoTest() {

        carrera.setDistancia(15);
        carrera.setTiempoEsperado(5);
        
        double costeTotal = 15 * 1.35 + 5 * 0.35;

        assertEquals(costeTotal, Tarifa.getCosteTotalEsperado(carrera), delta);
    }

    @Test
    public void getCosteMinimoTest() {
        
        carrera.setDistancia(1);
        carrera.setTiempoEsperado(2);

        assertEquals(5, Tarifa.getCosteTotalEsperado(carrera), delta);
    }
}