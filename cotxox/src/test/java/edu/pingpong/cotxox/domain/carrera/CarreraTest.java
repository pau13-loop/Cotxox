package edu.pingpong.cotxox.domain.carrera;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.pingpong.cotxox.domain.conductor.Conductor;
import edu.pingpong.cotxox.domain.conductor.PoolConductores;

public class CarreraTest {

    private Carrera carrera = null;
    private Conductor conductor = null;
    private List<Conductor> conductores = new ArrayList<Conductor>();
    private PoolConductores poolConductores = null;
    private double delta = 0.01d;
    
    @Before
    public void setupCarrera() {
        carrera = new Carrera("666333111");
        conductor = new Conductor("Daniel Brühl");

        conductores.add(conductor);
        poolConductores = new PoolConductores(conductores);
    }

    @Test
    public void settersAndGettersCarrera() {

        carrera.setOrigen("Bombay");
        carrera.setDestino("Hawai");
        carrera.setDistancia(15.5);
        carrera.setTiempoCarrera(20);

        assertEquals("666333111", carrera.getTarjetaCredito());
        assertEquals("Bombay", carrera.getOrigen());
        assertEquals("Hawai", carrera.getDestino());
        assertEquals(15.5, carrera.getDistancia(), delta);
        assertEquals(20, carrera.getTiempoCarrera());
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

    @Test
    public void checkConductorFreeTest() {

        carrera.setConductor(conductor);
        carrera.liberarConductor();

        assertEquals(false, conductor.isOcupado());
    }

    @Test
    public void checkConductorNotFreeTest() {
        
        carrera.asignarConductor(poolConductores);

        assertEquals(true, carrera.getConductor().isOcupado());
    }

    @Test
    public void checkCosteTotalTest() {
        
        carrera.realizarPago(80);

        assertEquals(80, carrera.getCosteTotal(), delta);
    }

    @Test
    public void checkPropinaTest() {

        carrera.recibirPropina(5);

        assertEquals(5, carrera.getPropina());
    }
}
